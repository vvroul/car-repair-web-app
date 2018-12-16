package com.example.demo.controller.mappers;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.domain.Users;
import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsersToUsersMapper {

    public UsersModel mapToUserModel(Users users) {
        UsersModel userModel = new UsersModel();
        userModel.setU_id(users.getU_id());
        userModel.setEmail(users.getEmail());
        userModel.setPassword(users.getPassword());
        userModel.setaFM(users.getaFM());
        userModel.setFirstName(users.getFirstName());
        userModel.setLastName(users.getLastName());
        userModel.setAddress(users.getAddress());
        userModel.setuType(users.getuType());
        userModel.setvType(users.getvType());
        userModel.setVPlate(users.getvPlate());
        return userModel;
    }

//    public List<UsersModel> mapToUserModel(List<Users> usersList) {
//        return usersList
//                .stream()
//                .map(this::mapToUserModel)
//                .collect(Collectors.toList());
//    }
}

