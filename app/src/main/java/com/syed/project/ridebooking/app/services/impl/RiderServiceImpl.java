package com.syed.project.ridebooking.app.services.impl;

import com.syed.project.ridebooking.app.dto.DriverDto;
import com.syed.project.ridebooking.app.dto.RideDto;
import com.syed.project.ridebooking.app.dto.RideRequestDto;
import com.syed.project.ridebooking.app.dto.RiderDto;
import com.syed.project.ridebooking.app.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}