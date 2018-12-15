package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class HybridModel {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTime;
    private String VPlate;
    private Long aFM;

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public String getVPlate() {
        return VPlate;
    }

    public void setVPlate(String VPlate) {
        this.VPlate = VPlate;
    }

    public Long getaFM() {
        return aFM;
    }

    public void setaFM(Long aFM) {
        this.aFM = aFM;
    }
}
