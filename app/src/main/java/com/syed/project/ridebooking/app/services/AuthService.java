package com.syed.project.ridebooking.app.services;

import com.syed.project.ridebooking.app.dto.DriverDto;
import com.syed.project.ridebooking.app.dto.SignUpDto;
import com.syed.project.ridebooking.app.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignUpDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
