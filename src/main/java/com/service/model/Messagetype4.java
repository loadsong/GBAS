package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Messagetype4 {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;
    @Column(name = "SEQID")
    private Long seqid;

    private Short week;

    private Integer msow;

    @Column(name = "msgBlockIdentifier")
    private Byte msgblockidentifier;

    @Column(name = "GBASID")
    private String gbasid;

    @Column(name = "messageType")
    private Byte messagetype;

    @Column(name = "messageLength")
    private Integer messagelength;

    @Column(name = "dataSetLength")
    private Byte datasetlength;

    @Column(name = "operationType")
    private Byte operationtype;

    @Column(name = "SBASServiceProvider")
    private Byte sbasserviceprovider;

    @Column(name = "airportID")
    private String airportid;

    @Column(name = "runwayNumber")
    private Byte runwaynumber;

    @Column(name = "runwayLetter")
    private Integer runwayletter;

    @Column(name = "APDesignator")
    private Byte apdesignator;

    @Column(name = "routeIndicator")
    private String routeindicator;

    @Column(name = "RefPathDataSelector")
    private Byte refpathdataselector;

    @Column(name = "referencePathID")
    private String referencepathid;

    @Column(name = "LTP_FTPLatitude")
    private BigDecimal ltpFtplatitude;

    @Column(name = "LTP_FTPLongitude")
    private BigDecimal ltpFtplongitude;

    @Column(name = "LTP_FTPHeight")
    private BigDecimal ltpFtpheight;

    @Column(name = "FPAPLatitude")
    private BigDecimal fpaplatitude;

    @Column(name = "FPAPLongitude")
    private BigDecimal fpaplongitude;

    @Column(name = "approachThCrossingHeight")
    private BigDecimal approachthcrossingheight;

    @Column(name = "approachTCHUnitsSelector")
    private Byte approachtchunitsselector;

    @Column(name = "GPA")
    private BigDecimal gpa;

    @Column(name = "courseWidthAtThreshold")
    private BigDecimal coursewidthatthreshold;

    @Column(name = "lengthOffset")
    private Integer lengthoffset;

    @Column(name = "finalApproachSegmentCRC")
    private BigDecimal finalapproachsegmentcrc;

    @Column(name = "FASVALApproachStatus")
    private BigDecimal fasvalapproachstatus;

    @Column(name = "FASLALApproachStatus")
    private BigDecimal faslalapproachstatus;

    @Column(name = "CRC")
    private Integer crc;

    @Column(name = "currentTime")
    private String currenttime;

    public BigDecimal getLtp_ftplatitude() {
        return ltp_ftplatitude;
    }

    public void setLtp_ftplatitude(BigDecimal ltp_ftplatitude) {
        this.ltp_ftplatitude = ltp_ftplatitude;
    }

    public BigDecimal getLtp_ftplongitude() {
        return ltp_ftplongitude;
    }

    public void setLtp_ftplongitude(BigDecimal ltp_ftplongitude) {
        this.ltp_ftplongitude = ltp_ftplongitude;
    }

    public BigDecimal getLtp_ftpheight() {
        return ltp_ftpheight;
    }

    public void setLtp_ftpheight(BigDecimal ltp_ftpheight) {
        this.ltp_ftpheight = ltp_ftpheight;
    }

    private BigDecimal ltp_ftplatitude;
    private BigDecimal ltp_ftplongitude;
    private BigDecimal ltp_ftpheight;

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
    public Byte getMsgblockidentifier() {
        return msgblockidentifier;
    }

    /**
     * @param msgblockidentifier
     */
    public void setMsgblockidentifier(Byte msgblockidentifier) {
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
    public Integer getMessagelength() {
        return messagelength;
    }

    /**
     * @param messagelength
     */
    public void setMessagelength(Integer messagelength) {
        this.messagelength = messagelength;
    }

    /**
     * @return dataSetLength
     */
    public Byte getDatasetlength() {
        return datasetlength;
    }

    /**
     * @param datasetlength
     */
    public void setDatasetlength(Byte datasetlength) {
        this.datasetlength = datasetlength;
    }

    /**
     * @return operationType
     */
    public Byte getOperationtype() {
        return operationtype;
    }

    /**
     * @param operationtype
     */
    public void setOperationtype(Byte operationtype) {
        this.operationtype = operationtype;
    }

    /**
     * @return SBASServiceProvider
     */
    public Byte getSbasserviceprovider() {
        return sbasserviceprovider;
    }

    /**
     * @param sbasserviceprovider
     */
    public void setSbasserviceprovider(Byte sbasserviceprovider) {
        this.sbasserviceprovider = sbasserviceprovider;
    }

    /**
     * @return airportID
     */
    public String getAirportid() {
        return airportid;
    }

    /**
     * @param airportid
     */
    public void setAirportid(String airportid) {
        this.airportid = airportid == null ? null : airportid.trim();
    }

    /**
     * @return runwayNumber
     */
    public Byte getRunwaynumber() {
        return runwaynumber;
    }

    /**
     * @param runwaynumber
     */
    public void setRunwaynumber(Byte runwaynumber) {
        this.runwaynumber = runwaynumber;
    }

    /**
     * @return runwayLetter
     */
    public Integer getRunwayletter() {
        return runwayletter;
    }

    /**
     * @param runwayletter
     */
    public void setRunwayletter(Integer runwayletter) {
        this.runwayletter = runwayletter;
    }

    /**
     * @return APDesignator
     */
    public Byte getApdesignator() {
        return apdesignator;
    }

    /**
     * @param apdesignator
     */
    public void setApdesignator(Byte apdesignator) {
        this.apdesignator = apdesignator;
    }

    /**
     * @return routeIndicator
     */
    public String getRouteindicator() {
        return routeindicator;
    }

    /**
     * @param routeindicator
     */
    public void setRouteindicator(String routeindicator) {
        this.routeindicator = routeindicator == null ? null : routeindicator.trim();
    }

    /**
     * @return RefPathDataSelector
     */
    public Byte getRefpathdataselector() {
        return refpathdataselector;
    }

    /**
     * @param refpathdataselector
     */
    public void setRefpathdataselector(Byte refpathdataselector) {
        this.refpathdataselector = refpathdataselector;
    }

    /**
     * @return referencePathID
     */
    public String getReferencepathid() {
        return referencepathid;
    }

    /**
     * @param referencepathid
     */
    public void setReferencepathid(String referencepathid) {
        this.referencepathid = referencepathid == null ? null : referencepathid.trim();
    }

    /**
     * @return LTP_FTPLatitude
     */
    public BigDecimal getLtpFtplatitude() {
        return ltpFtplatitude;
    }

    /**
     * @param ltpFtplatitude
     */
    public void setLtpFtplatitude(BigDecimal ltpFtplatitude) {
        this.ltpFtplatitude = ltpFtplatitude;
    }

    /**
     * @return LTP_FTPLongitude
     */
    public BigDecimal getLtpFtplongitude() {
        return ltpFtplongitude;
    }

    /**
     * @param ltpFtplongitude
     */
    public void setLtpFtplongitude(BigDecimal ltpFtplongitude) {
        this.ltpFtplongitude = ltpFtplongitude;
    }

    /**
     * @return LTP_FTPHeight
     */
    public BigDecimal getLtpFtpheight() {
        return ltpFtpheight;
    }

    /**
     * @param ltpFtpheight
     */
    public void setLtpFtpheight(BigDecimal ltpFtpheight) {
        this.ltpFtpheight = ltpFtpheight;
    }

    /**
     * @return FPAPLatitude
     */
    public BigDecimal getFpaplatitude() {
        return fpaplatitude;
    }

    /**
     * @param fpaplatitude
     */
    public void setFpaplatitude(BigDecimal fpaplatitude) {
        this.fpaplatitude = fpaplatitude;
    }

    /**
     * @return FPAPLongitude
     */
    public BigDecimal getFpaplongitude() {
        return fpaplongitude;
    }

    /**
     * @param fpaplongitude
     */
    public void setFpaplongitude(BigDecimal fpaplongitude) {
        this.fpaplongitude = fpaplongitude;
    }

    /**
     * @return approachThCrossingHeight
     */
    public BigDecimal getApproachthcrossingheight() {
        return approachthcrossingheight;
    }

    /**
     * @param approachthcrossingheight
     */
    public void setApproachthcrossingheight(BigDecimal approachthcrossingheight) {
        this.approachthcrossingheight = approachthcrossingheight;
    }

    /**
     * @return approachTCHUnitsSelector
     */
    public Byte getApproachtchunitsselector() {
        return approachtchunitsselector;
    }

    /**
     * @param approachtchunitsselector
     */
    public void setApproachtchunitsselector(Byte approachtchunitsselector) {
        this.approachtchunitsselector = approachtchunitsselector;
    }

    /**
     * @return GPA
     */
    public BigDecimal getGpa() {
        return gpa;
    }

    /**
     * @param gpa
     */
    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
    }

    /**
     * @return courseWidthAtThreshold
     */
    public BigDecimal getCoursewidthatthreshold() {
        return coursewidthatthreshold;
    }

    /**
     * @param coursewidthatthreshold
     */
    public void setCoursewidthatthreshold(BigDecimal coursewidthatthreshold) {
        this.coursewidthatthreshold = coursewidthatthreshold;
    }

    /**
     * @return lengthOffset
     */
    public Integer getLengthoffset() {
        return lengthoffset;
    }

    /**
     * @param lengthoffset
     */
    public void setLengthoffset(Integer lengthoffset) {
        this.lengthoffset = lengthoffset;
    }

    /**
     * @return finalApproachSegmentCRC
     */
    public BigDecimal getFinalapproachsegmentcrc() {
        return finalapproachsegmentcrc;
    }

    /**
     * @param finalapproachsegmentcrc
     */
    public void setFinalapproachsegmentcrc(BigDecimal finalapproachsegmentcrc) {
        this.finalapproachsegmentcrc = finalapproachsegmentcrc;
    }

    /**
     * @return FASVALApproachStatus
     */
    public BigDecimal getFasvalapproachstatus() {
        return fasvalapproachstatus;
    }

    /**
     * @param fasvalapproachstatus
     */
    public void setFasvalapproachstatus(BigDecimal fasvalapproachstatus) {
        this.fasvalapproachstatus = fasvalapproachstatus;
    }

    /**
     * @return FASLALApproachStatus
     */
    public BigDecimal getFaslalapproachstatus() {
        return faslalapproachstatus;
    }

    /**
     * @param faslalapproachstatus
     */
    public void setFaslalapproachstatus(BigDecimal faslalapproachstatus) {
        this.faslalapproachstatus = faslalapproachstatus;
    }

    /**
     * @return CRC
     */
    public Integer getCrc() {
        return crc;
    }

    /**
     * @param crc
     */
    public void setCrc(Integer crc) {
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