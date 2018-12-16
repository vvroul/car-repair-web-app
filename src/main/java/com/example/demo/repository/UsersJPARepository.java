package com.example.demo.repository;

import com.example.demo.domain.Users;
import com.example.demo.domain.Repairs;
import com.example.demo.forms.UsersRegisterForm;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UsersJPARepository extends JpaRepository<Users, Long> {
    Users findUsersByAFMAndEmail(Long aFM, String email);

    List<Users> findAll();

    Users save(Users users);







}
