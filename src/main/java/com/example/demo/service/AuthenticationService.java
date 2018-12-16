package com.example.demo.service;

import com.example.demo.model.LoginResponse;

public interface AuthenticationService {

    LoginResponse login(String username, String password);

    void logout(String username, String password);
}

