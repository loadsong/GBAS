package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Procdata2 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;


    private Short week;

    private Integer msow;

    @Column(name = "GBASID")
    private String gbasid;

    @Column(name = "freqSigID")
    private Byte freqsigid;

    public BigDecimal getSatid() {
        return satid;
    }

    public void setSatid(BigDecimal satid) {
        this.satid = satid;
    }

    @Column(name = "recID")
    private Byte recid;


    private BigDecimal dvgc;

    private BigDecimal dqm;
    private BigDecimal satid;

    private BigDecimal cnavg;

    public Short getWeek() {
        return week;
    }

    public void setWeek(Short week) {
        this.week = week;
    }

    public Integer getMsow() {
        return msow;
    }

    public void setMsow(Integer msow) {
        this.msow = msow;
    }

    public String getGbasid() {
        return gbasid;
    }

    public void setGbasid(String gbasid) {
        this.gbasid = gbasid;
    }

    public Byte getFreqsigid() {
        return freqsigid;
    }

    public void setFreqsigid(Byte freqsigid) {
        this.freqsigid = freqsigid;
    }

    public Byte getRecid() {
        return recid;
    }

    public void setRecid(Byte recid) {
        this.recid = recid;
    }

    public BigDecimal getDvgc() {
        return dvgc;
    }

    public void setDvgc(BigDecimal dvgc) {
        this.dvgc = dvgc;
    }

    public BigDecimal getDqm() {
        return dqm;
    }

    public void setDqm(BigDecimal dqm) {
        this.dqm = dqm;
    }

    public BigDecimal getCnavg() {
        return cnavg;
    }

    public void setCnavg(BigDecimal cnavg) {
        this.cnavg = cnavg;
    }

    public BigDecimal getAcc() {
        return acc;
    }

    public void setAcc(BigDecimal acc) {
        this.acc = acc;
    }



    public BigDecimal getRamp() {
        return ramp;
    }

    public void setRamp(BigDecimal ramp) {
        this.ramp = ramp;
    }

    public BigDecimal getStep() {
        return step;
    }

    public void setStep(BigDecimal step) {
        this.step = step;
    }

    public BigDecimal getInno() {
        return inno;
    }

    public void setInno(BigDecimal inno) {
        this.inno = inno;
    }

    @Column(name = "Acc")
    private BigDecimal acc;

    public BigDecimal getAccminth() {
        return accminth;
    }

    public void setAccminth(BigDecimal accminth) {
        this.accminth = accminth;
    }

    public BigDecimal getAccmaxth() {
        return accmaxth;
    }

    public void setAccmaxth(BigDecimal accmaxth) {
        this.accmaxth = accmaxth;
    }


    private BigDecimal accminth;
    private BigDecimal rampminth;
    private BigDecimal stepminth;
    private BigDecimal innominth;
    private BigDecimal dqmminth;
    private BigDecimal dvgcminth;

    private BigDecimal accmaxth;
    private BigDecimal rampmaxth;
    private BigDecimal stepmaxth;
    private BigDecimal innomaxth;
    private BigDecimal dqmmaxth;
    private BigDecimal dvgcmaxth;

    public BigDecimal getRampminth() {
        return rampminth;
    }

    public void setRampminth(BigDecimal rampminth) {
        this.rampminth = rampminth;
    }

    public BigDecimal getStepminth() {
        return stepminth;
    }

    public void setStepminth(BigDecimal stepminth) {
        this.stepminth = stepminth;
    }

    public BigDecimal getInnominth() {
        return innominth;
    }

    public void setInnominth(BigDecimal innominth) {
        this.innominth = innominth;
    }

    public BigDecimal getDqmminth() {
        return dqmminth;
    }

    public void setDqmminth(BigDecimal dqmminth) {
        this.dqmminth = dqmminth;
    }

    public BigDecimal getDvgcminth() {
        return dvgcminth;
    }

    public void setDvgcminth(BigDecimal dvgcminth) {
        this.dvgcminth = dvgcminth;
    }

    public BigDecimal getRampmaxth() {
        return rampmaxth;
    }

    public void setRampmaxth(BigDecimal rampmaxth) {
        this.rampmaxth = rampmaxth;
    }

    public BigDecimal getStepmaxth() {
        return stepmaxth;
    }

    public void setStepmaxth(BigDecimal stepmaxth) {
        this.stepmaxth = stepmaxth;
    }

    public BigDecimal getInnomaxth() {
        return innomaxth;
    }

    public void setInnomaxth(BigDecimal innomaxth) {
        this.innomaxth = innomaxth;
    }

    public BigDecimal getDqmmaxth() {
        return dqmmaxth;
    }

    public void setDqmmaxth(BigDecimal dqmmaxth) {
        this.dqmmaxth = dqmmaxth;
    }

    public BigDecimal getDvgcmaxth() {
        return dvgcmaxth;
    }

    public void setDvgcmaxth(BigDecimal dvgcmaxth) {
        this.dvgcmaxth = dvgcmaxth;
    }

    @Column(name = "Ramp")
    private BigDecimal ramp;


    @Column(name = "Step")
    private BigDecimal step;


    @Column(name = "Inno")
    private BigDecimal inno;



}