package com.example.demo.service;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.controller.mappers.RegisterFormToUsersMapper;
import com.example.demo.controller.mappers.UsersToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.exception.UsersNotFoundException;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersJPARepository usersRepository;

    @Autowired
    private UsersToUsersMapper mapper;


    @Override
    public Optional<Users> getUsersByAFMAndEmail(Long aFM, String email) {
        return usersRepository.findAllByAFMAndEmail(aFM, email);
    }

    @Override
    public UsersModel create(UsersModel userModel) {
        UsersBuilder builder = UsersBuilder.getUsersBuilder();
        Users users = builder.setEmail(userModel.getEmail()).setPassword(userModel.getPassword()).setAFM(userModel.getaFM()).createUsers();
        Users savedUsers = usersRepository.save(users);
        return mapper.mapToUserModel(savedUsers);
    }
}
