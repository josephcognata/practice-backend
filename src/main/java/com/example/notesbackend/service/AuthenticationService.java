package com.example.notesbackend.service;

import com.example.notesbackend.account.dto.request.LoginRequest;
import com.example.notesbackend.account.dto.request.RegistrationRequest;
import com.example.notesbackend.account.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse registration(RegistrationRequest request);

    JwtAuthenticationResponse login(LoginRequest request);
}
