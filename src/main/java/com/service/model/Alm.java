package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Alm {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
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

    @Column(name = "satID")
    private Byte satid;

    private Byte health;

    private BigDecimal e;

    private Integer toa;

    private BigDecimal orbitlncl;

    @Column(name = "orbitalLonRate")
    private BigDecimal orbitallonrate;

    @Column(name = "sqrtA")
    private BigDecimal sqrta;

    @Column(name = "orbitalLon")
    private BigDecimal orbitallon;

    private BigDecimal w;

    @Column(name = "M0")
    private BigDecimal m0;

    private BigDecimal af0;

    private BigDecimal af1;

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
     * @return health
     */
    public Byte getHealth() {
        return health;
    }

    /**
     * @param health
     */
    public void setHealth(Byte health) {
        this.health = health;
    }

    /**
     * @return e
     */
    public BigDecimal getE() {
        return e;
    }

    /**
     * @param e
     */
    public void setE(BigDecimal e) {
        this.e = e;
    }

    /**
     * @return toa
     */
    public Integer getToa() {
        return toa;
    }

    /**
     * @param toa
     */
    public void setToa(Integer toa) {
        this.toa = toa;
    }

    /**
     * @return orbitlncl
     */
    public BigDecimal getOrbitlncl() {
        return orbitlncl;
    }

    /**
     * @param orbitlncl
     */
    public void setOrbitlncl(BigDecimal orbitlncl) {
        this.orbitlncl = orbitlncl;
    }

    /**
     * @return orbitalLonRate
     */
    public BigDecimal getOrbitallonrate() {
        return orbitallonrate;
    }

    /**
     * @param orbitallonrate
     */
    public void setOrbitallonrate(BigDecimal orbitallonrate) {
        this.orbitallonrate = orbitallonrate;
    }

    /**
     * @return sqrtA
     */
    public BigDecimal getSqrta() {
        return sqrta;
    }

    /**
     * @param sqrta
     */
    public void setSqrta(BigDecimal sqrta) {
        this.sqrta = sqrta;
    }

    /**
     * @return orbitalLon
     */
    public BigDecimal getOrbitallon() {
        return orbitallon;
    }

    /**
     * @param orbitallon
     */
    public void setOrbitallon(BigDecimal orbitallon) {
        this.orbitallon = orbitallon;
    }

    /**
     * @return w
     */
    public BigDecimal getW() {
        return w;
    }

    /**
     * @param w
     */
    public void setW(BigDecimal w) {
        this.w = w;
    }

    /**
     * @return M0
     */
    public BigDecimal getM0() {
        return m0;
    }

    /**
     * @param m0
     */
    public void setM0(BigDecimal m0) {
        this.m0 = m0;
    }

    /**
     * @return af0
     */
    public BigDecimal getAf0() {
        return af0;
    }

    /**
     * @param af0
     */
    public void setAf0(BigDecimal af0) {
        this.af0 = af0;
    }

    /**
     * @return af1
     */
    public BigDecimal getAf1() {
        return af1;
    }

    /**
     * @param af1
     */
    public void setAf1(BigDecimal af1) {
        this.af1 = af1;
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