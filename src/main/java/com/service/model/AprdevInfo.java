package com.service.model;

import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class AprdevInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private double lpl;
    private double lal;
    private double vpl;
    private double val;
    private int posMode;
    private int freqSigID;
    private String gast;
    private String currentTime;


    public double getLpl() {
        return lpl;
    }

    public void setLpl(double lpl) {
        this.lpl = lpl;
    }

    public double getLal() {
        return lal;
    }

    public void setLal(double lal) {
        this.lal = lal;
    }

    public double getVpl() {
        return vpl;
    }

    public void setVpl(double vpl) {
        this.vpl = vpl;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public int getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(int freqSigID) {
        this.freqSigID = freqSigID;
    }

    public String getGast() {
        return gast;
    }

    public void setGast(String gast) {
        this.gast = gast;
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
