package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Rangedata {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;

    @Column(name = "SEQID")
    private Long seqid;

    private Short week;

    private Integer msow;

    @Column(name = "GBASID")
    private String gbasid;

    @Column(name = "freqSigID")
    private Byte freqsigid;

    @Column(name = "recTypeID")
    private Byte rectypeid;

    @Column(name = "recID")
    private Byte recid;

    @Column(name = "timeSysID")
    private Byte timesysid;

    @Column(name = "satID")
    private Byte satid;

    private BigDecimal pseudo;

    @Column(name = "pseudoRate")
    private BigDecimal pseudorate;

    private Integer doppler;

    @Column(name = "adrCyc")
    private BigDecimal adrcyc;

    @Column(name = "CN0")
    private BigDecimal cn0;

    @Column(name = "PLLLockTime")
    private BigDecimal plllocktime;

    private Integer state;

    private BigDecimal azimuth;

    private BigDecimal elevation;

    @Column(name = "currentTime")
    private String currenttime;

    /**
     * @return SEQID
     */
    public Long getSeqid() {
        return seqid;
    }

    /**
     * @param seqid
     */
    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    /**
     * @return week
     */
    public Short getWeek() {
        return week;
    }

    /**
     * @param week
     */
    public void setWeek(Short week) {
        this.week = week;
    }

    /**
     * @return msow
     */
    public Integer getMsow() {
        return msow;
    }

    /**
     * @param msow
     */
    public void setMsow(Integer msow) {
        this.msow = msow;
    }

    /**
     * @return GBASID
     */
    public String getGbasid() {
        return gbasid;
    }

    /**
     * @param gbasid
     */
    public void setGbasid(String gbasid) {
        this.gbasid = gbasid == null ? null : gbasid.trim();
    }

    /**
     * @return freqSigID
     */
    public Byte getFreqsigid() {
        return freqsigid;
    }

    /**
     * @param freqsigid
     */
    public void setFreqsigid(Byte freqsigid) {
        this.freqsigid = freqsigid;
    }

    /**
     * @return recTypeID
     */
    public Byte getRectypeid() {
        return rectypeid;
    }

    /**
     * @param rectypeid
     */
    public void setRectypeid(Byte rectypeid) {
        this.rectypeid = rectypeid;
    }

    /**
     * @return recID
     */
    public Byte getRecid() {
        return recid;
    }

    /**
     * @param recid
     */
    public void setRecid(Byte recid) {
        this.recid = recid;
    }

    /**
     * @return timeSysID
     */
    public Byte getTimesysid() {
        return timesysid;
    }

    /**
     * @param timesysid
     */
    public void setTimesysid(Byte timesysid) {
        this.timesysid = timesysid;
    }

    /**
     * @return satID
     */
    public Byte getSatid() {
        return satid;
    }

    /**
     * @param satid
     */
    public void setSatid(Byte satid) {
        this.satid = satid;
    }

    /**
     * @return pseudo
     */
    public BigDecimal getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo
     */
    public void setPseudo(BigDecimal pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return pseudoRate
     */
    public BigDecimal getPseudorate() {
        return pseudorate;
    }

    /**
     * @param pseudorate
     */
    public void setPseudorate(BigDecimal pseudorate) {
        this.pseudorate = pseudorate;
    }

    /**
     * @return doppler
     */
    public Integer getDoppler() {
        return doppler;
    }

    /**
     * @param doppler
     */
    public void setDoppler(Integer doppler) {
        this.doppler = doppler;
    }

    /**
     * @return adrCyc
     */
    public BigDecimal getAdrcyc() {
        return adrcyc;
    }

    /**
     * @param adrcyc
     */
    public void setAdrcyc(BigDecimal adrcyc) {
        this.adrcyc = adrcyc;
    }

    /**
     * @return CN0
     */
    public BigDecimal getCn0() {
        return cn0;
    }

    /**
     * @param cn0
     */
    public void setCn0(BigDecimal cn0) {
        this.cn0 = cn0;
    }

    /**
     * @return PLLLockTime
     */
    public BigDecimal getPlllocktime() {
        return plllocktime;
    }

    /**
     * @param plllocktime
     */
    public void setPlllocktime(BigDecimal plllocktime) {
        this.plllocktime = plllocktime;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return azimuth
     */
    public BigDecimal getAzimuth() {
        return azimuth;
    }

    /**
     * @param azimuth
     */
    public void setAzimuth(BigDecimal azimuth) {
        this.azimuth = azimuth;
    }

    /**
     * @return elevation
     */
    public BigDecimal getElevation() {
        return elevation;
    }

    /**
     * @param elevation
     */
    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    /**
     * @return currentTime
     */
    public String getCurrenttime() {
        return currenttime.substring(0,19);
    }

    /**
     * @param currenttime
     */
    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }
}