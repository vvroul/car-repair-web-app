package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;

import com.example.demo.enumeration.*;


@Entity
@Table(name = "USERS", uniqueConstraints = {@UniqueConstraint(columnNames = {"email", "password", "AFM"})})
public class Users {
    private static final int MAX_NAME_LENGTH = 30;

    @Id
    @Column(name="user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_id;

    @Column(name = "AFM", nullable = false)
    private Long AFM;

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

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_type")
    private UserTypeEnum uType;

    @OneToMany(mappedBy = "owner", targetEntity = Repairs.class)
    private List<Repairs> repairs;


    public Users(int u_id, Long AFM, String firstName, String lastName, String email, String password, UserTypeEnum uType) {
        this.u_id = u_id;
        this.AFM = AFM;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.uType = uType;
    }

    public Users() {
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public Long getAFM() {
        return AFM;
    }

    public void setAFM(Long AFM) {
        this.AFM = AFM;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getVPlate() {
        return VPlate;
    }

    public void setVPlate(String VPlate) {
        this.VPlate = VPlate;
    }

    public UserTypeEnum getuType() {
        return uType;
    }

    public void setuType(UserTypeEnum uType) {
        this.uType = uType;
    }

    public List<Repairs> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repairs> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Users{");
        sb.append("u_id=").append(u_id);
        sb.append(", AFM=").append(AFM);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", vType='").append(vType).append('\'');
        sb.append(", VPlate='").append(VPlate).append('\'');
        sb.append(", uType=").append(uType);
        sb.append('}');
        return sb.toString();
    }
}
