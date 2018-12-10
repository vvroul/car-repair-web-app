package com.example.demo.controller.mappers;


import com.example.demo.builder.UsersBuilder;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.domain.Users;
import org.springframework.stereotype.Component;

@Component
public class RegisterFormToUsersMapper {

    public Users mapToUserModel(UsersRegisterForm registerForm) {
        Users userModel = new UsersBuilder().createUsers();
        return userModel;
    }
}
