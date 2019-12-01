package com.service.model;

import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class ConfigInfo2 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long SEQID;

    private String MT1TINT;
    private String MT2TINT;
    private String MT4TINT;
    private String MT11TINT;
    private int FLUSHTINT;
    private int RAWTINT;
    private Date currentTime;


    public String getMT1TINT() {
        return MT1TINT;
    }

    public void setMT1TINT(String MT1TINT) {
        this.MT1TINT = MT1TINT;
    }

    public String getMT2TINT() {
        return MT2TINT;
    }

    public void setMT2TINT(String MT2TINT) {
        this.MT2TINT = MT2TINT;
    }

    public String getMT4TINT() {
        return MT4TINT;
    }

    public void setMT4TINT(String MT4TINT) {
        this.MT4TINT = MT4TINT;
    }

    public String getMT11TINT() {
        return MT11TINT;
    }

    public void setMT11TINT(String MT11TINT) {
        this.MT11TINT = MT11TINT;
    }

    public Long getSEQID() {
        return SEQID;
    }

    public void setSEQID(Long SEQID) {
        this.SEQID = SEQID;
    }



    public int getFLUSHTINT() {
        return FLUSHTINT;
    }

    public void setFLUSHTINT(int FLUSHTINT) {
        this.FLUSHTINT = FLUSHTINT;
    }

    public int getRAWTINT() {
        return RAWTINT;
    }

    public void setRAWTINT(int RAWTINT) {
        this.RAWTINT = RAWTINT;
    }


    public String getCurrentTime() {
        return  simpleDateFormat.format(currentTime.getTime());
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
