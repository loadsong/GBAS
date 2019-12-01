package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class PvtInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;

    private int freqSigID;
    private int posMode;
    private double lambda_c;
    private double phi_c;
    private double ellHeight;
    private String currentTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(int freqSigID) {
        this.freqSigID = freqSigID;
    }


    public double getLambda_c() {
        return lambda_c;
    }

    public void setLambda_c(double lambda_c) {
        this.lambda_c = lambda_c;
    }

    public double getPhi_c() {
        return phi_c;
    }

    public void setPhi_c(double phi_c) {
        this.phi_c = phi_c;
    }

    public double getEllHeight() {
        return ellHeight;
    }

    public void setEllHeight(double ellHeight) {
        this.ellHeight = ellHeight;
    }

    public int getPosMode() {
        return posMode;
    }

    public void setPosMode(int posMode) {
        this.posMode = posMode;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}