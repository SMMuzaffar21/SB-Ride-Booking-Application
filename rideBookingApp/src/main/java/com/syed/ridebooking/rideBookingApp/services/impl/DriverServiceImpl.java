package com.syed.ridebooking.rideBookingApp.services.impl;

import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideDto;
import com.syed.ridebooking.rideBookingApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto rateRider(Long rideId) {
        return null;
    }

    @Override
    public RideDto acceptRide(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
