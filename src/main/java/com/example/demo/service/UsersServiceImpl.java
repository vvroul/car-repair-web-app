package com.example.demo.service;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.controller.mappers.RegisterFormToUsersMapper;
import com.example.demo.controller.mappers.UsersToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.exception.UsersNotFoundException;
import com.example.demo.forms.UsersEditForm;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersJPARepository usersRepository;

    @Autowired
    private UsersToUsersMapper mapper;


    @Override
    public Users getUsersByAFMAndEmail(String aFM, String email) {
        return usersRepository.findUsersByAFMAndEmail(aFM, email);
    }

    @Override
    public UsersModel create(UsersModel userModel) {
        UsersBuilder builder = UsersBuilder.getUsersBuilder();
        Users users = builder.setEmail(userModel.getEmail()).
                setPassword(userModel.getPassword()).
                setAFM(userModel.getaFM()).
                setFirstName(userModel.getFirstName()).
                setLastName(userModel.getLastName()).
                setAddress(userModel.getAddress()).
                setuType(userModel.getuType()).
                setvType(userModel.getvType()).
                setVPlate(userModel.getVPlate()).createUsers();
        Users savedUsers = usersRepository.save(users);
        return mapper.mapToUserModel(savedUsers);
    }

    @Override
    public List<UsersModel> getAll() {
        return usersRepository
                .findAll()
                .stream()
                .map(users -> mapper.mapToUserModel(users))
                .collect(Collectors.toList());

    }


    @Override
    public Optional<UsersModel> findUsers(Long id) {
        return usersRepository
                .findById(id)
                .map(users -> mapper.mapToUserModel(users));
    }

    @Override
    public void update(UsersEditForm usersEditForm){
        Users users = usersRepository.findById(Long.parseLong(usersEditForm.getU_id())).get();
        if (users==null){throw new UsersNotFoundException();}
        users.setFirstName(usersEditForm.getFirstName());
        users.setLastName(usersEditForm.getLastName());
        users.setaFM(usersEditForm.getAfm());
        users.setEmail(usersEditForm.getEmail());
        users.setPassword(usersEditForm.getPassword());
        users.setAddress(usersEditForm.getAddress());
        users.setuType(usersEditForm.getuType());
        users.setvType(usersEditForm.getvType());
        users.setvPlate(usersEditForm.getVPlate());
        usersRepository.save(users);
    }



    @Override
    public void deleteUsersById(Long u_id) {usersRepository.deleteById(u_id);}

}
