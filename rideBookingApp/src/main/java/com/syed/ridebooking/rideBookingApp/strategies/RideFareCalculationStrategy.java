package com.syed.ridebooking.rideBookingApp.strategies;

import com.syed.ridebooking.rideBookingApp.dtos.RideRequestDto;

public interface RideFareCalculationStrategy {
     double calculateFare(RideRequestDto rideRequestDto);
}
