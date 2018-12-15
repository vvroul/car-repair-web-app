package com.example.demo.builder;

import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class RepairsBuilder {
    private Long r_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTime;
    private RepairStateEnum rState;
    private RepairTypeEnum rType;
    private double rCost;
    private Users owner;
    private String description;


    public static RepairsBuilder getRepairsBuilder() {
        return new RepairsBuilder();
    }


    public RepairsBuilder setR_id(Long r_id) {
        this.r_id = r_id;
        return this;
    }

    public RepairsBuilder setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public RepairsBuilder setrState(RepairStateEnum rState) {
        this.rState = rState;
        return this;
    }

    public RepairsBuilder setrType(RepairTypeEnum rType) {
        this.rType = rType;
        return this;
    }

    public RepairsBuilder setrCost(double rCost) {
        this.rCost = rCost;
        return this;
    }

    public RepairsBuilder setOwner(Users owner) {
        this.owner = owner;
        return this;
    }

    public RepairsBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Repairs createRepairs() {
        return new Repairs(r_id, dateTime, rState, rType, rCost, owner, description);
    }
}
