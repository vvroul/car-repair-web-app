package com.example.demo.service;

import com.example.demo.model.LoginResponse;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public LoginResponse login(String username, String password) {
        return new LoginResponse(username, password, Collections.singletonList(new SimpleGrantedAuthority("ADMIN")));
    }

    @Override
    public void logout(String username, String password) {
        return;
    }
}
