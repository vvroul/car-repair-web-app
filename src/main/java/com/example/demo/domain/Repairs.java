package com.example.demo.domain;

import com.example.demo.enumeration.RepairStateEnum;
import com.example.demo.enumeration.RepairTypeEnum;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "REPAIRS")
public class Repairs {

    @Id
    @Column(name = "r_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long r_id;

    @Column(name = "dateTime")
    private Date dateTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "rState")
    private RepairStateEnum rState;

    @Enumerated(EnumType.STRING)
    @Column(name = "rType")
    private RepairTypeEnum rType;

    @Column(name = "rCost")
    private double rCost;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "owner", referencedColumnName = "u_id")
    private Users owner;

    @Column(name = "description")
    private String description;




    public Repairs(Long r_id,Date dateTime, RepairStateEnum rState, RepairTypeEnum rType, Double rCost, Users owner, String description) {
        this.r_id = r_id;
        this.dateTime = dateTime;
        this.rState = rState;
        this.rType = rType;
        this.rCost = rCost;
        this.owner = owner;
        this.description = description;
    }

    public Repairs() {

    }

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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repairs{");
        sb.append("r_id=").append(r_id);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", rState='").append(rState).append('\'');
        sb.append(", rType='").append(rType).append('\'');
        sb.append(", rCost='").append(rCost).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}




