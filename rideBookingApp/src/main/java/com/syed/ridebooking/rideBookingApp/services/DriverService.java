package com.syed.ridebooking.rideBookingApp.services;

import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideDto;

import java.util.List;

public interface DriverService {

    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId);
    RideDto acceptRide(Long rideId, Integer rating);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();


}
