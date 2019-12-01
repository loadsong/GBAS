package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class VdbInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private double strength;
    private String currentTime;
    private int Polarization;

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

//        return String.valueOf(simpleDateFormat.parse(currentTime).getTime());


    public String getCurrentTime() throws ParseException {
        return String.valueOf(simpleDateFormat.parse(currentTime).getTime());
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public int getPolarization() {
        return Polarization;
    }

    public void setPolarization(int polarization) {
        Polarization = polarization;
    }
}
