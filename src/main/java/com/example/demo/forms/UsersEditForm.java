package com.example.demo.forms;

import com.example.demo.domain.Repairs;
import com.example.demo.enumeration.UserTypeEnum;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class UsersEditForm {
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private static final int PASSWORD_MINSIZE = 6;

    private String u_id;
    private String afm;
    private String firstName;
    private String lastName;
    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;
    private String address;

    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;
    private UserTypeEnum uType;
    private String vType;
    private String VPlate;
    private List<Repairs> repairs;

    public static String getPasswordPattern() {
        return PASSWORD_PATTERN;
    }

    public static String getMailPattern() {
        return MAIL_PATTERN;
    }

    public static int getPasswordMinsize() {
        return PASSWORD_MINSIZE;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Repairs> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repairs> repairs) {
        this.repairs = repairs;
    }
}
