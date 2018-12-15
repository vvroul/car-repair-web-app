package com.example.demo.forms;

import com.example.demo.domain.Users;

import java.time.LocalDate;
import java.util.Date;

public class RepairsSearchForm {

    private LocalDate dateTime;
    private Users owner;

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }
}
