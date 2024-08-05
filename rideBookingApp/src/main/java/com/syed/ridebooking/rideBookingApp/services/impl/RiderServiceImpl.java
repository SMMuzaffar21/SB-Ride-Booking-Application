package com.syed.ridebooking.rideBookingApp.services.impl;

import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideDto;
import com.syed.ridebooking.rideBookingApp.dtos.RideRequestDto;
import com.syed.ridebooking.rideBookingApp.dtos.RiderDto;
import com.syed.ridebooking.rideBookingApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto cancelRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId) {
        return null;
    }

    @Override
    public RideDto requestRide(Long rideId, Integer rating) {
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
