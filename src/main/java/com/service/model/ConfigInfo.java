package com.service.model;

import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class ConfigInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Long SEQID;

    private String PARAMNAME;
    private String PARAMVALUE;
    private String PARAMNOTE;
    private String currentTime;

    public Long getSEQID() {
        return SEQID;
    }

    public void setSEQID(Long SEQID) {
        this.SEQID = SEQID;
    }

    public String getPARAMNAME() {
        return PARAMNAME;
    }

    public void setPARAMNAME(String PARAMNAME) {
        this.PARAMNAME = PARAMNAME;
    }

    public String getPARAMVALUE() {
        return PARAMVALUE;
    }

    public void setPARAMVALUE(String PARAMVALUE) {
        this.PARAMVALUE = PARAMVALUE;
    }

    public String getPARAMNOTE() {
        return PARAMNOTE;
    }

    public void setPARAMNOTE(String PARAMNOTE) {
        this.PARAMNOTE = PARAMNOTE;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
