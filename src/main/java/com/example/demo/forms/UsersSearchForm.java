package com.example.demo.forms;

import javax.validation.constraints.Pattern;

public class UsersSearchForm {

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private String aFM;
    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;

    public String getaFM() {
        return aFM;
    }

    public void setaFM(String aFM) {
        this.aFM = aFM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
