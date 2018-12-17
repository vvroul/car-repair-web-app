package com.example.demo.security;

import com.example.demo.model.LoginResponse;
import com.example.demo.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AccountLoginAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public Authentication authenticate(Authentication authentication) {
        LoginResponse loginResponse = authenticateUser(authentication);
        return new UsernamePasswordAuthenticationToken(loginResponse.getUsername(), loginResponse.getPassword(), loginResponse.getRoles());
    }

    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private LoginResponse authenticateUser(Authentication authentication) {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        return authenticationService.login(username, password);
    }


}

