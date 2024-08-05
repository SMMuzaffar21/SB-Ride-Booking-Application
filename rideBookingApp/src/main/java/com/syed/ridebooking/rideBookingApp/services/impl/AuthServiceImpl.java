package com.syed.ridebooking.rideBookingApp.services.impl;

import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.SignupDto;
import com.syed.ridebooking.rideBookingApp.dtos.UserDto;
import com.syed.ridebooking.rideBookingApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
