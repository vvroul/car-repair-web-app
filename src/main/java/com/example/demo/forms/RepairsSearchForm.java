package com.example.demo.forms;

import com.example.demo.domain.Users;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class RepairsSearchForm {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTime;
    private String aFM;
    private String vPlate;

    public String getaFM() {
        return aFM;
    }

    public void setaFM(String aFM) {
        this.aFM = aFM;
    }

    public String getvPlate() {
        return vPlate;
    }

    public void setvPlate(String vPlate) {
        this.vPlate = vPlate;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

}
