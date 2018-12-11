package com.example.demo.controller.mappers;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.domain.Users;
import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Component;

@Component
public class UsersToUsersMapper {

    public UsersModel mapToUserModel(Users users) {
        UsersModel userModel = new UsersModel();
        userModel.setEmail(users.getEmail());
        userModel.setPassword(users.getPassword());
        userModel.setaFM(users.getaFM());
        return userModel;
    }
}