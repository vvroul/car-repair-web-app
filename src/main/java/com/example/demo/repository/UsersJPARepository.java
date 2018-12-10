package com.example.demo.repository;

import com.example.demo.domain.Users;
import com.example.demo.domain.Repairs;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UsersJPARepository extends JpaRepository<Users, Long> {

    @Override
    Users save(Users users);

    Optional<Users> getUsersByAFMAndEmail(Long aFM, String email);
}
