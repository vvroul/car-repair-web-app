package com.example.demo.service;

import com.example.demo.domain.Users;

import java.util.Optional;

public interface UsersService {

    Optional<Users> getUsersByAFMAndEmail(Long aFM, String email);

    void saveUsers(Users users);

    Users create(Users user);
}
