package com.syed.ridebooking.rideBookingApp.services;
//For Authentication etc


import com.syed.ridebooking.rideBookingApp.dtos.DriverDto;
import com.syed.ridebooking.rideBookingApp.dtos.SignupDto;
import com.syed.ridebooking.rideBookingApp.dtos.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signUp(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
