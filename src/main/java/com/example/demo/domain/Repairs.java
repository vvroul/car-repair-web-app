package com.example.demo.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
public class Repairs {

    @Id
    @Column(name="repair_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int r_id;

    @Column(name="date time")
    private LocalDateTime dateTime;



    @Column(name = "repair_cost")
    private double rCost;


    @Column(name = "description")
    private String description;
}
