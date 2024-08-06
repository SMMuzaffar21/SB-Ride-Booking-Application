package com.syed.ridebooking.rideBookingApp.strategies.impl;

import com.syed.ridebooking.rideBookingApp.dtos.RideRequestDto;
import com.syed.ridebooking.rideBookingApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
