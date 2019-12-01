package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Message1 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;

    // messagetype 1

    private int TIMESLOT;
    private int week;
    private int freqSigID;
    private int msgBlockIdentifier;
    private int messageType;
    private int messageLength;
    private int additionalMsgFlag;
    private int numOfMeasurements;
    private int measurementType;
    private int srcAvaDuration;
    private int rangSrcID;
    private int issueOfData;
    private int CRCSuccess;
    private double Zcount;
    private double ephemDecorrelationPara;
    private double PRC;
    private double RRC;
    private double pr_gnd;
    private double B1;
    private double B2;
    private double B3;
    private double B4;

    private Long msow;
    private Long CRC;
    private Long ephemerisCRC;
    private String GBASID;
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

    public int getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(int freqSigID) {
        this.freqSigID = freqSigID;
    }

    public int getMsgBlockIdentifier() {
        return msgBlockIdentifier;
    }

    public void setMsgBlockIdentifier(int msgBlockIdentifier) {
        this.msgBlockIdentifier = msgBlockIdentifier;
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

    public int getAdditionalMsgFlag() {
        return additionalMsgFlag;
    }

    public void setAdditionalMsgFlag(int additionalMsgFlag) {
        this.additionalMsgFlag = additionalMsgFlag;
    }

    public int getNumOfMeasurements() {
        return numOfMeasurements;
    }

    public void setNumOfMeasurements(int numOfMeasurements) {
        this.numOfMeasurements = numOfMeasurements;
    }

    public int getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(int measurementType) {
        this.measurementType = measurementType;
    }

    public int getSrcAvaDuration() {
        return srcAvaDuration;
    }

    public void setSrcAvaDuration(int srcAvaDuration) {
        this.srcAvaDuration = srcAvaDuration;
    }

    public int getRangSrcID() {
        return rangSrcID;
    }

    public void setRangSrcID(int rangSrcID) {
        this.rangSrcID = rangSrcID;
    }

    public int getIssueOfData() {
        return issueOfData;
    }

    public void setIssueOfData(int issueOfData) {
        this.issueOfData = issueOfData;
    }

    public int getCRCSuccess() {
        return CRCSuccess;
    }

    public void setCRCSuccess(int CRCSuccess) {
        this.CRCSuccess = CRCSuccess;
    }

    public double getZcount() {
        return Zcount;
    }

    public void setZcount(double zcount) {
        Zcount = zcount;
    }

    public double getEphemDecorrelationPara() {
        return ephemDecorrelationPara;
    }

    public void setEphemDecorrelationPara(double ephemDecorrelationPara) {
        this.ephemDecorrelationPara = ephemDecorrelationPara;
    }

    public double getPRC() {
        return PRC;
    }

    public void setPRC(double PRC) {
        this.PRC = PRC;
    }

    public double getRRC() {
        return RRC;
    }

    public void setRRC(double RRC) {
        this.RRC = RRC;
    }

    public double getPr_gnd() {
        return pr_gnd;
    }

    public void setPr_gnd(double pr_gnd) {
        this.pr_gnd = pr_gnd;
    }

    public double getB1() {
        return B1;
    }

    public void setB1(double b1) {
        B1 = b1;
    }

    public double getB2() {
        return B2;
    }

    public void setB2(double b2) {
        B2 = b2;
    }

    public double getB3() {
        return B3;
    }

    public void setB3(double b3) {
        B3 = b3;
    }

    public double getB4() {
        return B4;
    }

    public void setB4(double b4) {
        B4 = b4;
    }

    public Long getMsow() {
        return msow;
    }

    public void setMsow(Long msow) {
        this.msow = msow;
    }

    public Long getCRC() {
        return CRC;
    }

    public void setCRC(Long CRC) {
        this.CRC = CRC;
    }

    public Long getEphemerisCRC() {
        return ephemerisCRC;
    }

    public void setEphemerisCRC(Long ephemerisCRC) {
        this.ephemerisCRC = ephemerisCRC;
    }

    public String getGBASID() {
        return GBASID;
    }

    public void setGBASID(String GBASID) {
        this.GBASID = GBASID;
    }

    public String getCurrentTime() {
        return currentTime.substring(0, 19);
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

/**
     * @return currentTime
     */
//    public String getCurrenttime() {
//        return currentTime.substring(0, 19);
//    }

    /**
     * @param currenttime
     */
//    public void setCurrenttime(String currenttime) {
//        this.currentTime = currenttime;
//    }
}