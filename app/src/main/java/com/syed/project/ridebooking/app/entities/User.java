package com.syed.project.ridebooking.app.entities;

import com.syed.project.ridebooking.app.entities.enums.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    // @ElementCollection annotation creates an other table,
    // without the need to manually create one,
    // typically used for String or numbers
    //in our case "ADMIN","DRIVER" etc....
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}
