package com.service.model;

import java.text.SimpleDateFormat;

/**
 * Created by songmeng on 2018/12/21.
 */
public class MTInfo2 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String freqSigID;
    private int total;


    public String getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(String freqSigID) {
        this.freqSigID = freqSigID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
