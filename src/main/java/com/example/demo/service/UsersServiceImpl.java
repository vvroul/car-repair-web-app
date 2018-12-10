package com.example.demo.service;

import com.example.demo.domain.Users;
import com.example.demo.repository.UsersJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersJPARepository usersRepository;

    @Override
    public Optional<Users> findUsersByAFMAndEmail(Long aFM, String email) {
        return usersRepository.getUsersByAFMAndEmail(aFM, email);
    }

    @Override
    public void saveUsers(Users users) {
        usersRepository.save(users);
    }
}
