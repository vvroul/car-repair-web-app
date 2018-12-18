package com.example.demo.controller.mappers;

import com.example.demo.forms.LoginForm;
import com.example.demo.forms.RepairsSearchForm;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Component;

@Component
public class LoginFormToUsersMapper {

    public UsersModel mapToUserModel(LoginForm loginForm) {
        UsersModel usersModel = new UsersModel();
        usersModel.setEmail(loginForm.getEmail());
        usersModel.setPassword(loginForm.getPassword());
        return usersModel;
    }
}
