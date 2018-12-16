package com.example.demo.controller.mappers;

import com.example.demo.forms.UsersEditForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.UsersModel;

public class EditFormToUsersMapper {
    public UsersModel mapToUserModel(UsersEditForm usersEditForm) {
        UsersModel userModel = new UsersModel();
        userModel.setU_id(Long.parseLong((usersEditForm.getU_id())));
        userModel.setFirstName(usersEditForm.getFirstName());
        userModel.setLastName(usersEditForm.getLastName());
        userModel.setEmail(usersEditForm.getEmail());

        return userModel;
    }
}
