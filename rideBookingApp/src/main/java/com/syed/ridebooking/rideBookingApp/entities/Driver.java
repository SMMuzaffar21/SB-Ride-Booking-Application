package com.syed.ridebooking.rideBookingApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double rating;
    private Boolean available;

    // column should be of type geometry - it can be of any type[circle,sphere
    // 4326 is for earth]
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point currentLocation;
}
