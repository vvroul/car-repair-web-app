package com.example.demo.domain;

import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;
import javax.persistence.*;

@Entity
@Table(name = "REPAIRS")
public class Repairs {

    @Id
    @Column(name="repair_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int r_id;

    @Column(name="date_time")
    private String dateTime;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "repair_state")
    private RepairStateEnum rState;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "repair_type")
    private RepairTypeEnum rType;

    @Column(name = "repair_cost")
    private double rCost;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private Users owner;

    @Column(name = "description")
    private String description;

    public Repairs(String dateTime, RepairStateEnum rState, RepairTypeEnum rType, double rCost, Users owner, String description) {
        this.dateTime = dateTime;
        this.rState = rState;
        this.rType = rType;
        this.rCost = rCost;
        this.owner = owner;
        this.description = description;
    }

    public Repairs() {

    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
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
