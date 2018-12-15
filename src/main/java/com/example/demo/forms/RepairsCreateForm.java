package com.example.demo.forms;

import com.example.demo.domain.Users;
import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;

import java.util.Date;

public class RepairsCreateForm {

    private Long r_id;
    private Date dateTime;
    private RepairStateEnum rState;
    private RepairTypeEnum rType;
    private double rCost;
    private Users owner;
    private String description;

    public Long getR_id() {
        return r_id;
    }

    public void setR_id(Long r_id) {
        this.r_id = r_id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public RepairStateEnum getrState() {
        return rState;
    }

    public void setrState(RepairStateEnum rState) {
        this.rState = rState;
    }

    public RepairTypeEnum getrType() {
        return rType;
    }

    public void setrType(RepairTypeEnum rType) {
        this.rType = rType;
    }

    public double getrCost() {
        return rCost;
    }

    public void setrCost(double rCost) {
        this.rCost = rCost;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
