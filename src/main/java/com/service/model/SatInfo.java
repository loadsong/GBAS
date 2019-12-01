package com.service.model;

import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class SatInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int freqSigID;
    private int satID;
    private double B1;
    private double B2;
    private double B3;
    private double B4;
    private double sigma_pr_gnd;
    private double sigma_pr_gnd_D;
    private double sigma_pr_gnd_30;
    private double elevation;
    private String currentTime;
    private int recTypeID;
    private int recID;

    public int getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(int freqSigID) {
        this.freqSigID = freqSigID;
    }

    public double getB1() {
        return B1;
    }

    public void setB1(double b1) {
        B1 = b1;
    }

    public double getB2() {
        return B2;
    }

    public void setB2(double b2) {
        B2 = b2;
    }

    public double getB3() {
        return B3;
    }

    public void setB3(double b3) {
        B3 = b3;
    }

    public double getB4() {
        return B4;
    }

    public void setB4(double b4) {
        B4 = b4;
    }

    public double getSigma_pr_gnd() {
        return sigma_pr_gnd;
    }

    public void setSigma_pr_gnd(double sigma_pr_gnd) {
        this.sigma_pr_gnd = sigma_pr_gnd;
    }

    public double getSigma_pr_gnd_D() {
        return sigma_pr_gnd_D;
    }

    public void setSigma_pr_gnd_D(double sigma_pr_gnd_D) {
        this.sigma_pr_gnd_D = sigma_pr_gnd_D;
    }

    public double getSigma_pr_gnd_30() {
        return sigma_pr_gnd_30;
    }

    public void setSigma_pr_gnd_30(double sigma_pr_gnd_30) {
        this.sigma_pr_gnd_30 = sigma_pr_gnd_30;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }
//    public String getCurrenttime() throws ParseException {
//        return String.valueOf(simpleDateFormat.parse(currentTime).getTime());
//    }
//
//    public void setCurrenttime(String currenttime) {
//        this.currentTime = currenttime;
//    }

    public int getRecTypeID() {
        return recTypeID;
    }

    public void setRecTypeID(int recTypeID) {
        this.recTypeID = recTypeID;
    }

    public int getRecID() {
        return recID;
    }

    public void setRecID(int recID) {
        this.recID = recID;
    }

    public int getSatID() {
        return satID;
    }

    public void setSatID(int satID) {
        this.satID = satID;
    }

    public String getCurrentTime() throws ParseException {
        return String.valueOf(simpleDateFormat.parse(currentTime).getTime());
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
