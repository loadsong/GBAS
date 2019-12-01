package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Message11 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;

    // messagetype 11

    private int TIMESLOT;
    private int week;
    private Long msow;
    private String GBASID;
    private int freqSigID;
    private int msgBlockIdentifier;
    private int messageType;
    private int messageLength;
    private double Zcount;
    private int additionalMsgFlag;
    private int numOfMeasurements;
    private int measurementType;
    private double ephemDecorrelationPara;
    private int rangSrcID;
    private int issueOfData;
    private double PRC30;
    private double RRC30;
    private double pr_gnd_D;
    private double pr_gnd_30;
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

    public String getGBASID() {
        return GBASID;
    }

    public void setGBASID(String GBASID) {
        this.GBASID = GBASID;
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

    public double getZcount() {
        return Zcount;
    }

    public void setZcount(double zcount) {
        Zcount = zcount;
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

    public double getEphemDecorrelationPara() {
        return ephemDecorrelationPara;
    }

    public void setEphemDecorrelationPara(double ephemDecorrelationPara) {
        this.ephemDecorrelationPara = ephemDecorrelationPara;
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

    public double getPRC30() {
        return PRC30;
    }

    public void setPRC30(double PRC30) {
        this.PRC30 = PRC30;
    }

    public double getRRC30() {
        return RRC30;
    }

    public void setRRC30(double RRC30) {
        this.RRC30 = RRC30;
    }

    public double getPr_gnd_D() {
        return pr_gnd_D;
    }

    public void setPr_gnd_D(double pr_gnd_D) {
        this.pr_gnd_D = pr_gnd_D;
    }

    public double getPr_gnd_30() {
        return pr_gnd_30;
    }

    public void setPr_gnd_30(double pr_gnd_30) {
        this.pr_gnd_30 = pr_gnd_30;
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