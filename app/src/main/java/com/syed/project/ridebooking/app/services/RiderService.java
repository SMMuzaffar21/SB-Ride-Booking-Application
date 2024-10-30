package com.syed.project.ridebooking.app.services;

import com.syed.project.ridebooking.app.dto.DriverDto;
import com.syed.project.ridebooking.app.dto.RideDto;
import com.syed.project.ridebooking.app.dto.RideRequestDto;
import com.syed.project.ridebooking.app.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
