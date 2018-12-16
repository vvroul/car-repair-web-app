package com.example.demo.model;

import com.example.demo.enumeration.UserTypeEnum;

public class UsersModel {

    private Long u_id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private UserTypeEnum uType;
    private String vType;
    private String VPlate;
    private Long aFM;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getaFM() {
        return aFM;
    }

    public void setaFM(Long aFM) {
        this.aFM = aFM;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserTypeEnum getuType() {
        return uType;
    }

    public void setuType(UserTypeEnum uType) {
        this.uType = uType;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getVPlate() {
        return VPlate;
    }

    public void setVPlate(String VPlate) {
        this.VPlate = VPlate;
    }

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }
}
