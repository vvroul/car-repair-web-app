package com.example.demo.builder;

import com.example.demo.domain.Users;
import com.example.demo.enumeration.UserTypeEnum;

public class UsersBuilder {
    private int u_id;
    private Long afm;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserTypeEnum uType;

    public UsersBuilder setU_id(int u_id) {
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

    public Users createUsers() {
        return new Users(u_id, afm, firstName, lastName, email, password, uType);
    }
}