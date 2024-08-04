package com.syed.ridebooking.rideBookingApp.entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double rating;

}
