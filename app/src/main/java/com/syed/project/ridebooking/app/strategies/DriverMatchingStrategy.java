package com.syed.project.ridebooking.app.strategies;

import com.syed.project.ridebooking.app.dto.RideRequestDto;
import com.syed.project.ridebooking.app.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);

}
