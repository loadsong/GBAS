package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.persistence.*;

public class Messagetype1 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;
    @Column(name = "SEQID")
    private Long seqid;

    private Short week;

    private Integer msow;

    @Column(name = "msgBlockIdentifier")
    private BigDecimal msgblockidentifier;

    @Column(name = "GBASID")
    private String gbasid;

    @Column(name = "messageType")
    private Byte messagetype;

    @Column(name = "messageLength")
    private BigDecimal messagelength;

    @Column(name = "Zcount")
    private BigDecimal zcount;

    @Column(name = "additionalMsgFlag")
    private BigDecimal additionalmsgflag;

    @Column(name = "numOfMeasurements")
    private BigDecimal numofmeasurements;

    @Column(name = "measurementType")
    private BigDecimal measurementtype;

    @Column(name = "ephemDecorrelationPara")
    private BigDecimal ephemdecorrelationpara;

    @Column(name = "ephemerisCRC")
    private BigDecimal ephemeriscrc;

    @Column(name = "srcAvaDuration")
    private BigDecimal srcavaduration;

    @Column(name = "rangSrcID")
    private BigDecimal rangsrcid;

    @Column(name = "issueOfData")
    private BigDecimal issueofdata;

    @Column(name = "PRC")
    private BigDecimal prc;

    @Column(name = "RRC")
    private BigDecimal rrc;

    @Column(name = "pr_gnd")
    private BigDecimal prGnd;

    @Column(name = "B1")
    private BigDecimal b1;

    @Column(name = "B2")
    private BigDecimal b2;

    public BigDecimal getPr_gnd() {
        return pr_gnd;
    }

    public void setPr_gnd(BigDecimal pr_gnd) {
        this.pr_gnd = pr_gnd;
    }

    public BigDecimal getFreqsigid() {
        return freqsigid;
    }

    public void setFreqsigid(BigDecimal freqsigid) {
        this.freqsigid = freqsigid;
    }

    @Column(name = "B3")

    private BigDecimal b3;

    @Column(name = "B4")
    private BigDecimal b4;

    private BigDecimal pr_gnd;
    private BigDecimal freqsigid;

    @Column(name = "CRC")
    private Short crc;

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
     * @return msgBlockIdentifier
     */
    public BigDecimal getMsgblockidentifier() {
        return msgblockidentifier;
    }

    /**
     * @param msgblockidentifier
     */
    public void setMsgblockidentifier(BigDecimal msgblockidentifier) {
        this.msgblockidentifier = msgblockidentifier;
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
     * @return messageType
     */
    public Byte getMessagetype() {
        return messagetype;
    }

    /**
     * @param messagetype
     */
    public void setMessagetype(Byte messagetype) {
        this.messagetype = messagetype;
    }

    /**
     * @return messageLength
     */
    public BigDecimal getMessagelength() {
        return messagelength;
    }

    /**
     * @param messagelength
     */
    public void setMessagelength(BigDecimal messagelength) {
        this.messagelength = messagelength;
    }

    /**
     * @return Zcount
     */
    public BigDecimal getZcount() {
        return zcount;
    }

    /**
     * @param zcount
     */
    public void setZcount(BigDecimal zcount) {
        this.zcount = zcount;
    }

    /**
     * @return additionalMsgFlag
     */
    public BigDecimal getAdditionalmsgflag() {
        return additionalmsgflag;
    }

    /**
     * @param additionalmsgflag
     */
    public void setAdditionalmsgflag(BigDecimal additionalmsgflag) {
        this.additionalmsgflag = additionalmsgflag;
    }

    /**
     * @return numOfMeasurements
     */
    public BigDecimal getNumofmeasurements() {
        return numofmeasurements;
    }

    /**
     * @param numofmeasurements
     */
    public void setNumofmeasurements(BigDecimal numofmeasurements) {
        this.numofmeasurements = numofmeasurements;
    }

    /**
     * @return measurementType
     */
    public BigDecimal getMeasurementtype() {
        return measurementtype;
    }

    /**
     * @param measurementtype
     */
    public void setMeasurementtype(BigDecimal measurementtype) {
        this.measurementtype = measurementtype;
    }

    /**
     * @return ephemDecorrelationPara
     */
    public BigDecimal getEphemdecorrelationpara() {
        return ephemdecorrelationpara;
    }

    /**
     * @param ephemdecorrelationpara
     */
    public void setEphemdecorrelationpara(BigDecimal ephemdecorrelationpara) {
        this.ephemdecorrelationpara = ephemdecorrelationpara;
    }

    /**
     * @return ephemerisCRC
     */
    public BigDecimal getEphemeriscrc() {
        return ephemeriscrc;
    }

    /**
     * @param ephemeriscrc
     */
    public void setEphemeriscrc(BigDecimal ephemeriscrc) {
        this.ephemeriscrc = ephemeriscrc;
    }

    /**
     * @return srcAvaDuration
     */
    public BigDecimal getSrcavaduration() {
        return srcavaduration;
    }

    /**
     * @param srcavaduration
     */
    public void setSrcavaduration(BigDecimal srcavaduration) {
        this.srcavaduration = srcavaduration;
    }

    /**
     * @return rangSrcID
     */
    public BigDecimal getRangsrcid() {
        return rangsrcid;
    }

    /**
     * @param rangsrcid
     */
    public void setRangsrcid(BigDecimal rangsrcid) {
        this.rangsrcid = rangsrcid;
    }

    /**
     * @return issueOfData
     */
    public BigDecimal getIssueofdata() {
        return issueofdata;
    }

    /**
     * @param issueofdata
     */
    public void setIssueofdata(BigDecimal issueofdata) {
        this.issueofdata = issueofdata;
    }

    /**
     * @return PRC
     */
    public BigDecimal getPrc() {
        return prc;
    }

    /**
     * @param prc
     */
    public void setPrc(BigDecimal prc) {
        this.prc = prc;
    }

    /**
     * @return RRC
     */
    public BigDecimal getRrc() {
        return rrc;
    }

    /**
     * @param rrc
     */
    public void setRrc(BigDecimal rrc) {
        this.rrc = rrc;
    }

    /**
     * @return pr_gnd
     */
    public BigDecimal getPrGnd() {
        return prGnd;
    }

    /**
     * @param prGnd
     */
    public void setPrGnd(BigDecimal prGnd) {
        this.prGnd = prGnd;
    }

    /**
     * @return B1
     */
    public BigDecimal getB1() {
        return b1;
    }

    /**
     * @param b1
     */
    public void setB1(BigDecimal b1) {
        this.b1 = b1;
    }

    /**
     * @return B2
     */
    public BigDecimal getB2() {
        return b2;
    }

    /**
     * @param b2
     */
    public void setB2(BigDecimal b2) {
        this.b2 = b2;
    }

    /**
     * @return B3
     */
    public BigDecimal getB3() {
        return b3;
    }

    /**
     * @param b3
     */
    public void setB3(BigDecimal b3) {
        this.b3 = b3;
    }

    /**
     * @return B4
     */
    public BigDecimal getB4() {
        return b4;
    }

    /**
     * @param b4
     */
    public void setB4(BigDecimal b4) {
        this.b4 = b4;
    }

    /**
     * @return CRC
     */
    public Short getCrc() {
        return crc;
    }

    /**
     * @param crc
     */
    public void setCrc(Short crc) {
        this.crc = crc;
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