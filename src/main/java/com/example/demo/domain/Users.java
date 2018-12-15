package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;
import com.example.demo.enumeration.*;


@Entity
@Table(name = "USERS", uniqueConstraints = {@UniqueConstraint(columnNames = {"email", "password", "aFM"})})
public class Users {
    private static final int MAX_NAME_LENGTH = 30;

    @Id
    @Column(name="u_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long u_id;

    @Column(name = "aFM", nullable = false)
    private Long aFM;

    @Column(name = "address")
    private String address;

    @Column(name = "firstName", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastName", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "email", length = MAX_NAME_LENGTH)
    private String email;

    @Column(name = "password", length = MAX_NAME_LENGTH)
    private String password;

    @Column(name = "vType")
    private String vType;

    @Column(name = "vPlate")
    private String vPlate;

    @Enumerated(EnumType.STRING)
    @Column(name = "uType")
    private UserTypeEnum uType;

    @OneToMany(mappedBy = "owner", targetEntity = Repairs.class)
    private List<Repairs> repairs;

    public Users(Long u_id, Long aFM, String firstName, String lastName, String address, String email, String password, UserTypeEnum uType, String vType, String vPlate) {
        this.u_id = u_id;
        this.aFM = aFM;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.vType = vType;
        this.vPlate = vPlate;
        this.uType = uType;
    }

    private Users() {
    }

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public Long getaFM() {
        return aFM;
    }

    public void setaFM(Long aFM) {
        this.aFM = aFM;
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

    public String getvPlate() {
        return vPlate;
    }

    public void setvPlate(String vPlate) {
        this.vPlate = vPlate;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Users{");
        sb.append("u_id=").append(u_id);
        sb.append(", aFM=").append(aFM);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", vType='").append(vType).append('\'');
        sb.append(", vPlate='").append(vPlate).append('\'');
        sb.append(", uType=").append(uType);
        sb.append('}');
        return sb.toString();
    }
}
