package com.example.demo.controller;

import com.example.demo.controller.mappers.RegisterFormToUsersMapper;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.service.*;

import com.example.demo.validators.UsersRegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.utils.GlobalAttributes;

import javax.validation.Valid;

@Controller
public class UsersRegistrationController {

    private static final String REGISTER_FORM = "registerForm";


    @Autowired
    UsersServiceImpl usersServiceImpl;

    @Autowired
    private UsersRegisterValidator registerValidator;

    @Autowired
    private RegisterFormToUsersMapper mapper;

    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registerValidator);
    }

    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM,
                new UsersRegisterForm());
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(Model model,
                           @Valid @ModelAttribute(REGISTER_FORM)
                                   UsersRegisterForm registerForm,
                           BindingResult bindingResult) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage", "an error occurred");
            return "register";
        }

        //Users userModel = mapper.mapToUserModel(registerForm);
        //usersServiceImpl.create(userModel);
        return "redirect:/";
    }
}
