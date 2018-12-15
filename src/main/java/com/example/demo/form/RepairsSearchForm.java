package com.example.demo.form;

import com.example.demo.domain.Users;

public class RepairsSearchForm {

    private Long r_id;
    private Users owner;

    public Long getR_id() {
        return r_id;
    }

    public void setR_id(Long r_id) {
        this.r_id = r_id;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }
}
