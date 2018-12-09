package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Controller
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    UsersService usersService;

//    @GetMapping(path = "/")
//    public List<User> findAll() {
//        return userService.findAll();
//    }
//
//
//    @GetMapping(path = "/{id}")
//    public User find(@PathVariable Long id) {
//        return userService.find(id);
//    }
//
//
//    @GetMapping(path = "")
//    public List<User> findByUsername(@RequestParam String surname) {
//        return userService.findBySurname(surname);
//    }

    @PostMapping(path = "")
    public Users create(@RequestBody Users users) {
        return usersService.create(users);
    }

}
