package com.example.demo.forms;

import com.example.demo.domain.Users;
import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class RepairsEditForm {

    private String r_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTime;
    private RepairStateEnum rState;
    private RepairTypeEnum rType;
    private double rCost;
    private Users owner;
    private String description;

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
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
