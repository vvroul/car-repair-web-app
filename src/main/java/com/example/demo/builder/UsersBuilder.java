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

    public static UsersBuilder getUsersBuilder() {
        return new UsersBuilder();
    }


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
        return new Users(u_id, afm, firstName, lastName, address, email, password, uType, vType, VPlate);
    }
}