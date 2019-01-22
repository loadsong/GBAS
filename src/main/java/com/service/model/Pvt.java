package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Pvt {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;
    @Column(name = "SEQID")
    private Long seqid;

    @Column(name = "GBASID")
    private String gbasid;

    @Column(name = "freqSigID")
    private Byte freqsigid;

    @Column(name = "recTypeID")
    private Byte rectypeid;

    @Column(name = "recID")
    private Byte recid;

    @Column(name = "posMode")
    private Byte posmode;

    private Short week;

    private Integer msow;

    private BigDecimal latitude;

    private BigDecimal longitude;

    @Column(name = "referencePointHeight")
    private BigDecimal referencepointheight;

    @Column(name = "eastVelocity")
    private BigDecimal eastvelocity;

    @Column(name = "northVelocity")
    private BigDecimal northvelocity;

    @Column(name = "upVelocity")
    private BigDecimal upvelocity;

    @Column(name = "recvClk")
    private BigDecimal recvclk;

    @Column(name = "clockVelocity")
    private BigDecimal clockvelocity;

    @Column(name = "HDOP")
    private BigDecimal hdop;

    @Column(name = "VDOP")
    private BigDecimal vdop;

    @Column(name = "satNum")
    private Byte satnum;

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
     * @return posMode
     */
    public Byte getPosmode() {
        return posmode;
    }

    /**
     * @param posmode
     */
    public void setPosmode(Byte posmode) {
        this.posmode = posmode;
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
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * @return referencePointHeight
     */
    public BigDecimal getReferencepointheight() {
        return referencepointheight;
    }

    /**
     * @param referencepointheight
     */
    public void setReferencepointheight(BigDecimal referencepointheight) {
        this.referencepointheight = referencepointheight;
    }

    /**
     * @return eastVelocity
     */
    public BigDecimal getEastvelocity() {
        return eastvelocity;
    }

    /**
     * @param eastvelocity
     */
    public void setEastvelocity(BigDecimal eastvelocity) {
        this.eastvelocity = eastvelocity;
    }

    /**
     * @return northVelocity
     */
    public BigDecimal getNorthvelocity() {
        return northvelocity;
    }

    /**
     * @param northvelocity
     */
    public void setNorthvelocity(BigDecimal northvelocity) {
        this.northvelocity = northvelocity;
    }

    /**
     * @return upVelocity
     */
    public BigDecimal getUpvelocity() {
        return upvelocity;
    }

    /**
     * @param upvelocity
     */
    public void setUpvelocity(BigDecimal upvelocity) {
        this.upvelocity = upvelocity;
    }

    /**
     * @return recvClk
     */
    public BigDecimal getRecvclk() {
        return recvclk;
    }

    /**
     * @param recvclk
     */
    public void setRecvclk(BigDecimal recvclk) {
        this.recvclk = recvclk;
    }

    /**
     * @return clockVelocity
     */
    public BigDecimal getClockvelocity() {
        return clockvelocity;
    }

    /**
     * @param clockvelocity
     */
    public void setClockvelocity(BigDecimal clockvelocity) {
        this.clockvelocity = clockvelocity;
    }

    /**
     * @return HDOP
     */
    public BigDecimal getHdop() {
        return hdop;
    }

    /**
     * @param hdop
     */
    public void setHdop(BigDecimal hdop) {
        this.hdop = hdop;
    }

    /**
     * @return VDOP
     */
    public BigDecimal getVdop() {
        return vdop;
    }

    /**
     * @param vdop
     */
    public void setVdop(BigDecimal vdop) {
        this.vdop = vdop;
    }

    /**
     * @return satNum
     */
    public Byte getSatnum() {
        return satnum;
    }

    /**
     * @param satnum
     */
    public void setSatnum(Byte satnum) {
        this.satnum = satnum;
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