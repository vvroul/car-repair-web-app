package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.form.UsersRegisterForm;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/users")
public class UsersRegistrationController {

    @Autowired
    UsersServiceImpl usersService;

    private static final String REGISTER_FORM = "registerForm";
    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute( REGISTER_FORM, new UsersRegisterForm());
        return "register";
    }
    @PostMapping(value = "/register")
    public String register(Model model, @ModelAttribute(REGISTER_FORM) UsersRegisterForm
            registerForm) {
        //here we would have the logic for sending the registration request to our service
        return "register";
    }
}