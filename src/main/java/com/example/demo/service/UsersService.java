package com.example.demo.service;

import com.example.demo.domain.Users;
import com.example.demo.model.UsersModel;

import java.util.Optional;

public interface UsersService {

    Optional<Users> getUsersByAFMAndEmail(Long aFM, String email);

    UsersModel create(UsersModel users);
}
