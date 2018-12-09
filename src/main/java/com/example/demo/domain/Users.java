package com.example.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.demo.enumeration.*;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
public class Users {
    private static final int MAX_NAME_LENGTH = 30;

    @Id
    @Column(name="user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_id;

    @Column(name = "TIN", nullable = false)
    private Long TIN;

    @Column(name = "firstname", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastname", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password", length = MAX_NAME_LENGTH)
    private String password;

    @Column(name = "vehicle_type")
    private String vType;

    @Column(name = "vehicle_plate")
    private String VPlate;

    @Column(name = "user_type")
    private UserTypeEnum UType;

    public Users(int u_id, Long TIN, String firstName, String lastName, String email, String password, UserTypeEnum UType) {
        this.u_id = u_id;
        this.TIN = TIN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.UType = UType;
    }

    public Users() {
    }

}
