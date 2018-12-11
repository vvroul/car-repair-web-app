package com.example.demo.controller.mappers;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.domain.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersToUsersMapper {

    public Users mapToUserModel(Users users) {
        Users userModel = new UsersBuilder().setUsers(users);
        return userModel;
    }
}