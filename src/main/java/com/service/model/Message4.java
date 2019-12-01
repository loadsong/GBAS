package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Message4 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;

    // messagetype 4

    private int TIMESLOT;
    private int week;
    private Long msow;
    private int msgBlockIdentifier;
    private String GBASID;
    private int messageType;
    private int messageLength;
    private int dataSetLength;
    private int operationType;
    private int SBASServiceProvider;
    private String airportID;
    private int runwayNumber;
    private int runwayLetter;
    private int APDesignator;
    private String routeIndicator;
    private int RefPathDataSelector;
    private String referencePathID;
    private double LTP_FTPLatitude;
    private double LTP_FTPLongitude;
    private BigDecimal LTP_FTPHeight;
    private BigDecimal FPAPLatitude;
    private BigDecimal FPAPLongitude;
    private BigDecimal approachThCrossingHeight;
    private int approachTCHUnitsSelector;
    private BigDecimal GPA;
    private BigDecimal courseWidthAtThreshold;
    private int lengthOffset;
    private BigDecimal finalApproachSegmentCRC;
    private BigDecimal FASVALApproachStatus;
    private BigDecimal FASLALApproachStatus;
    private Long CRC;
    private int CRCSuccess;
    private String currentTime;

    public int getTIMESLOT() {
        return TIMESLOT;
    }

    public void setTIMESLOT(int TIMESLOT) {
        this.TIMESLOT = TIMESLOT;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public Long getMsow() {
        return msow;
    }

    public void setMsow(Long msow) {
        this.msow = msow;
    }

    public int getMsgBlockIdentifier() {
        return msgBlockIdentifier;
    }

    public void setMsgBlockIdentifier(int msgBlockIdentifier) {
        this.msgBlockIdentifier = msgBlockIdentifier;
    }

    public String getGBASID() {
        return GBASID;
    }

    public void setGBASID(String GBASID) {
        this.GBASID = GBASID;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public int getMessageLength() {
        return messageLength;
    }

    public void setMessageLength(int messageLength) {
        this.messageLength = messageLength;
    }

    public int getDataSetLength() {
        return dataSetLength;
    }

    public void setDataSetLength(int dataSetLength) {
        this.dataSetLength = dataSetLength;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public int getSBASServiceProvider() {
        return SBASServiceProvider;
    }

    public void setSBASServiceProvider(int SBASServiceProvider) {
        this.SBASServiceProvider = SBASServiceProvider;
    }

    public String getAirportID() {
        return airportID;
    }

    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }

    public int getRunwayNumber() {
        return runwayNumber;
    }

    public void setRunwayNumber(int runwayNumber) {
        this.runwayNumber = runwayNumber;
    }

    public int getRunwayLetter() {
        return runwayLetter;
    }

    public void setRunwayLetter(int runwayLetter) {
        this.runwayLetter = runwayLetter;
    }

    public int getAPDesignator() {
        return APDesignator;
    }

    public void setAPDesignator(int APDesignator) {
        this.APDesignator = APDesignator;
    }

    public String getRouteIndicator() {
        return routeIndicator;
    }

    public void setRouteIndicator(String routeIndicator) {
        this.routeIndicator = routeIndicator;
    }

    public int getRefPathDataSelector() {
        return RefPathDataSelector;
    }

    public void setRefPathDataSelector(int refPathDataSelector) {
        RefPathDataSelector = refPathDataSelector;
    }

    public String getReferencePathID() {
        return referencePathID;
    }

    public void setReferencePathID(String referencePathID) {
        this.referencePathID = referencePathID;
    }

    public double getLTP_FTPLatitude() {
        return LTP_FTPLatitude;
    }

    public void setLTP_FTPLatitude(double LTP_FTPLatitude) {
        this.LTP_FTPLatitude = LTP_FTPLatitude;
    }

    public double getLTP_FTPLongitude() {
        return LTP_FTPLongitude;
    }

    public void setLTP_FTPLongitude(double LTP_FTPLongitude) {
        this.LTP_FTPLongitude = LTP_FTPLongitude;
    }

    public BigDecimal getLTP_FTPHeight() {
        return LTP_FTPHeight;
    }

    public void setLTP_FTPHeight(BigDecimal LTP_FTPHeight) {
        this.LTP_FTPHeight = LTP_FTPHeight;
    }

    public BigDecimal getFPAPLatitude() {
        return FPAPLatitude;
    }

    public void setFPAPLatitude(BigDecimal FPAPLatitude) {
        this.FPAPLatitude = FPAPLatitude;
    }

    public BigDecimal getFPAPLongitude() {
        return FPAPLongitude;
    }

    public void setFPAPLongitude(BigDecimal FPAPLongitude) {
        this.FPAPLongitude = FPAPLongitude;
    }

    public BigDecimal getApproachThCrossingHeight() {
        return approachThCrossingHeight;
    }

    public void setApproachThCrossingHeight(BigDecimal approachThCrossingHeight) {
        this.approachThCrossingHeight = approachThCrossingHeight;
    }

    public int getApproachTCHUnitsSelector() {
        return approachTCHUnitsSelector;
    }

    public void setApproachTCHUnitsSelector(int approachTCHUnitsSelector) {
        this.approachTCHUnitsSelector = approachTCHUnitsSelector;
    }

    public BigDecimal getGPA() {
        return GPA;
    }

    public void setGPA(BigDecimal GPA) {
        this.GPA = GPA;
    }

    public BigDecimal getCourseWidthAtThreshold() {
        return courseWidthAtThreshold;
    }

    public void setCourseWidthAtThreshold(BigDecimal courseWidthAtThreshold) {
        this.courseWidthAtThreshold = courseWidthAtThreshold;
    }

    public int getLengthOffset() {
        return lengthOffset;
    }

    public void setLengthOffset(int lengthOffset) {
        this.lengthOffset = lengthOffset;
    }

    public BigDecimal getFinalApproachSegmentCRC() {
        return finalApproachSegmentCRC;
    }

    public void setFinalApproachSegmentCRC(BigDecimal finalApproachSegmentCRC) {
        this.finalApproachSegmentCRC = finalApproachSegmentCRC;
    }

    public BigDecimal getFASVALApproachStatus() {
        return FASVALApproachStatus;
    }

    public void setFASVALApproachStatus(BigDecimal FASVALApproachStatus) {
        this.FASVALApproachStatus = FASVALApproachStatus;
    }

    public BigDecimal getFASLALApproachStatus() {
        return FASLALApproachStatus;
    }

    public void setFASLALApproachStatus(BigDecimal FASLALApproachStatus) {
        this.FASLALApproachStatus = FASLALApproachStatus;
    }

    public Long getCRC() {
        return CRC;
    }

    public void setCRC(Long CRC) {
        this.CRC = CRC;
    }

    public int getCRCSuccess() {
        return CRCSuccess;
    }

    public void setCRCSuccess(int CRCSuccess) {
        this.CRCSuccess = CRCSuccess;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}