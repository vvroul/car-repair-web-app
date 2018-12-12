package com.example.demo.controller.mappers;

import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormToUsersMapper {

    public UsersModel mapToUserModel(UsersSearchForm searchForm) {
        UsersModel userModel = new UsersModel();
        userModel.setEmail(searchForm.getEmail());
        userModel.setaFM(searchForm.getaFM());
        return userModel;
    }
}
