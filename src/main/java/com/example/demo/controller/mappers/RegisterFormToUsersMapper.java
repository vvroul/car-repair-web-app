package com.example.demo.controller.mappers;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.domain.Users;
import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Component;

@Component
public class RegisterFormToUsersMapper {

    public UsersModel mapToUserModel(UsersRegisterForm registerForm) {
        UsersModel userModel = new UsersModel();
        userModel.setEmail(registerForm.getEmail());
        userModel.setPassword(registerForm.getPassword());
        userModel.setaFM(registerForm.getAfm());
        return userModel;
    }
}
