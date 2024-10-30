package com.syed.project.ridebooking.app.strategies.impl;

import com.syed.project.ridebooking.app.dto.RideRequestDto;
import com.syed.project.ridebooking.app.entities.Driver;
import com.syed.project.ridebooking.app.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}

