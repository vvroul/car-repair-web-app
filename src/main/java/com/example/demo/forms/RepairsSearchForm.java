package com.example.demo.forms;

import com.example.demo.domain.Users;

import java.util.Date;

public class RepairsSearchForm {

    private Date dateTime;
    private Users owner;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }
}
