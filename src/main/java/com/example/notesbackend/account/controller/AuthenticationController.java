package com.example.notesbackend.account.controller;

import com.example.notesbackend.account.dto.request.LoginRequest;
import com.example.notesbackend.account.dto.request.RegistrationRequest;
import com.example.notesbackend.account.dto.response.JwtAuthenticationResponse;
import com.example.notesbackend.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<JwtAuthenticationResponse> registration(@RequestBody RegistrationRequest request) {
        return ResponseEntity.ok(authenticationService.registration(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }
}
