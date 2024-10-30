package com.syed.project.ridebooking.app.strategies;

import com.syed.project.ridebooking.app.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
