package com.example.demo.controller;

import com.example.demo.controller.mappers.CreateFormToRepairsMapper;
import com.example.demo.controller.mappers.LoginFormToUsersMapper;
import com.example.demo.controller.mappers.UsersToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.forms.LoginForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.UsersModel;
import com.example.demo.service.UsersServiceImpl;
import com.example.demo.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LoginController {

    private static final String LOGIN_FORM = "loginForm";

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @Autowired
    LoginValidator loginValidator;

    @Autowired
    private LoginFormToUsersMapper mapper;

    @Autowired
    private UsersToUsersMapper usersMapper;

    @InitBinder(LOGIN_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(loginValidator);
    }

//    @GetMapping(value = "/") public String search(Model model) {
//        model.addAttribute(LOGIN_FORM,
//                new LoginForm());
//        return "login";
//    }

    @PostMapping(value = "/admin/")
    public String search(Model model,
                         @Valid @ModelAttribute(LOGIN_FORM)
                                 LoginForm loginForm,
                         BindingResult bindingResult,
                         @RequestParam(value = "password", required = false, defaultValue = "") String password,
                         @RequestParam(value = "email", required = false, defaultValue = "") String email ) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage", "an error occurred");
            return "login";
        }

        UsersModel userModel = mapper.mapToUserModel(loginForm);
        Users theUsers  = usersServiceImpl.getUsersByEmailAndPassword(userModel.getEmail(), userModel.getPassword());
        UsersModel newUserModel = usersMapper.mapToUserModel(theUsers);
        if (newUserModel.getuType().equals(1))
        {
            System.out.println("The user type is user");
        }
        else
        {
            System.out.println("The user type is admin");
        }
        return "adminHome";
    }

}