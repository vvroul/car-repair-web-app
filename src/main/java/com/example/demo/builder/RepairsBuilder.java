package com.example.demo.builder;

import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;

import java.util.Date;

public class RepairsBuilder {
    private Long r_id;
    private Date dateTime;
    private RepairStateEnum rState;
    private RepairTypeEnum rType;
    private double rCost;
    private Users owner;
    private String description;

    public static RepairsBuilder getRepairsBuilder() {
        return new RepairsBuilder();
    }

    public void setR_id(Long r_id) {
        this.r_id = r_id;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setrState(RepairStateEnum rState) {
        this.rState = rState;
    }

    public void setrType(RepairTypeEnum rType) {
        this.rType = rType;
    }

    public void setrCost(double rCost) {
        this.rCost = rCost;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Repairs createRepairs() {
        return new Repairs(r_id, dateTime, rState, rType, rCost, owner, description);
    }
}
