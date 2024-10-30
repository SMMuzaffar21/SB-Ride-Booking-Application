package com.syed.project.ridebooking.app.strategies.impl;

import com.syed.project.ridebooking.app.dto.RideRequestDto;
import com.syed.project.ridebooking.app.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
