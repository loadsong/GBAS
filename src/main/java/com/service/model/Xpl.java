package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by songmeng on 2018/12/21.
 */
public class Xpl {

    @Id
    private Long id;



    private BigDecimal seqid;

    public BigDecimal getSeqid() {
        return seqid;
    }

    public void setSeqid(BigDecimal seqid) {
        this.seqid = seqid;
    }

    public BigDecimal getWeek() {
        return week;
    }

    public void setWeek(BigDecimal week) {
        this.week = week;
    }

//    public BigDecimal getMsow() {
//        return msow.multiply(BigDecimal.valueOf(1000));
//    }
public BigDecimal getMsow() {
    return msow;
}

    public void setMsow(BigDecimal msow) {
        this.msow = msow;
    }

    public String getGbasid() {
        return gbasid;
    }

    public void setGbasid(String gbasid) {
        this.gbasid = gbasid;
    }

    public BigDecimal getFreqsigid() {
        return freqsigid;
    }

    public void setFreqsigid(BigDecimal freqsigid) {
        this.freqsigid = freqsigid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getTypepl() {
        return typepl;
    }

    public void setTypepl(BigDecimal typepl) {
        this.typepl = typepl;
    }

    public BigDecimal getPlvalue() {
        return plvalue;
    }

    public void setPlvalue(BigDecimal plvalue) {
        this.plvalue = plvalue;
    }

    private BigDecimal week;

    private BigDecimal msow;

    private String gbasid;

    private BigDecimal freqsigid;

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    private String location;
    private String runway;

    private BigDecimal typepl;

    private BigDecimal plvalue;
}
