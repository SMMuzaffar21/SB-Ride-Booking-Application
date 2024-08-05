package com.syed.ridebooking.rideBookingApp.services;

import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideRequestDto;
import com.syed.ridebooking.rideBookingApp.dtos.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto cancelRide(RideRequestDto rideRequestDto);
    DriverDto rateDriver(Long rideId);
    RideDto requestRide(Long rideId, Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getAllMyRides();
}
