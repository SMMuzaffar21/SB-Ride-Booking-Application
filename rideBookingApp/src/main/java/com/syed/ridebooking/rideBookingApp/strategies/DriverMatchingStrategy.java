package com.syed.ridebooking.rideBookingApp.strategies;

import com.syed.ridebooking.rideBookingApp.dtos.RideRequestDto;
import com.syed.ridebooking.rideBookingApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
