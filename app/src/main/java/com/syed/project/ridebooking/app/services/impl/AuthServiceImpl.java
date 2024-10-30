package com.syed.project.ridebooking.app.services.impl;

import com.syed.project.ridebooking.app.dto.DriverDto;
import com.syed.project.ridebooking.app.dto.SignUpDto;
import com.syed.project.ridebooking.app.dto.UserDto;
import com.syed.project.ridebooking.app.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
