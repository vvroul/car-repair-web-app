package com.example.demo.service;

import com.example.demo.domain.Users;
import com.example.demo.exception.UsersNotFoundException;
import com.example.demo.repository.UsersJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersJPARepository jpaRepository;

    public Users find(Long id) {
        return jpaRepository.findById(id)
                .orElseThrow(() -> new UsersNotFoundException());
    }

    public List<Users> findAll() {
        return jpaRepository.findAll();
    }

    public Users create(Users users) {
        return jpaRepository.save(users);
    }
}
