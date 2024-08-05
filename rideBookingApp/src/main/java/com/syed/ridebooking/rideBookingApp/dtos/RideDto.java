package com.syed.ridebooking.rideBookingApp.dtos;

import com.syed.ridebooking.rideBookingApp.entities.enums.PaymentMethod;
import com.syed.ridebooking.rideBookingApp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
