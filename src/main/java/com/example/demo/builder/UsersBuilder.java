package com.example.demo.builder;

import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.enumeration.UserTypeEnum;
import com.example.demo.forms.UsersRegisterForm;

import java.util.List;

public class UsersBuilder {
    private Long u_id;
    private Long afm;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;
    private UserTypeEnum uType;
    private String vType;
    private String VPlate;
    private List<Repairs> repairs;


    public UsersBuilder setU_id(Long u_id) {
        this.u_id = u_id;
        return this;
    }

    public UsersBuilder setAFM(Long afm) {
        this.afm = afm;
        return this;
    }

    public UsersBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UsersBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UsersBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UsersBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UsersBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UsersBuilder setuType(UserTypeEnum uType) {
        this.uType = uType;
        return this;
    }

    public UsersBuilder setvType(String vType) {
        this.vType = vType;
        return this;
    }

    public UsersBuilder setVPlate(String VPlate) {
        this.VPlate = VPlate;
        return this;
    }

    public UsersBuilder setRepairs(List<Repairs> repairs) {
        this.repairs = repairs;
        return this;
    }

    public Users createUsers() {
        return new Users(u_id, afm, firstName, lastName, email, password, uType);
    }

    public Users setUsers(UsersRegisterForm usersRegisterForm) {
        Users users = createUsers();
        users.setU_id(usersRegisterForm.getU_id());
        users.setaFM(usersRegisterForm.getAfm());
        users.setFirstName(usersRegisterForm.getFirstName());
        users.setLastName(usersRegisterForm.getLastName());
        users.setAddress(usersRegisterForm.getAddress());
        users.setEmail(usersRegisterForm.getEmail());
        users.setPassword(usersRegisterForm.getPassword());
        users.setuType(usersRegisterForm.getuType());
        users.setvType(usersRegisterForm.getvType());
        users.setVPlate(usersRegisterForm.getVPlate());
        users.setRepairs(usersRegisterForm.getRepairs());
        return users;
    }

    public Users setUsers(Users theUsers) {
        Users users = createUsers();
        users.setU_id(theUsers.getU_id());
        users.setaFM(theUsers.getaFM());
        users.setFirstName(theUsers.getFirstName());
        users.setLastName(theUsers.getLastName());
        users.setAddress(theUsers.getAddress());
        users.setEmail(theUsers.getEmail());
        users.setPassword(theUsers.getPassword());
        users.setuType(theUsers.getuType());
        users.setvType(theUsers.getvType());
        users.setVPlate(theUsers.getVPlate());
        users.setRepairs(theUsers.getRepairs());
        return users;
    }
}