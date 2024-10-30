package com.syed.project.ridebooking.app.services;

import com.syed.project.ridebooking.app.dto.DriverDto;
import com.syed.project.ridebooking.app.dto.RideDto;
import com.syed.project.ridebooking.app.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
