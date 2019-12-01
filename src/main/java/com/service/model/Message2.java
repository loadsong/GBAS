package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Message2 {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
    private Long id;

    // messagetype 2

    private int TIMESLOT;
    private int week;
    private Long msow;
    private int msgBlockIdentifier;
    private String GBASID;
    private int messageType;
    private int messageLength;
    private int GSReceiver;
    private int GSAccDesignator;
    private int GSCIDisignator;
    private double localMagneticVariation;
    private double vert_iono_gradient;
    private int refractivityIndex;
    private int scaleHeight;
    private int refractivityUncertainty;
    private double latitude;
    private double longitude;
    private double referencePointHeight;
    private int referenceStationDataSelector;
    private int maximumUseDistance;
    private double md_e_POS_GPS;
    private double md_e_CAT1_GPS;
    private double md_e_POS_GLONASS;
    private double md_e_CAT1_GLONASS;
    private int additionalDataBlockLength;
    private int additionalDataBlockNumber;
    private double md_e_GSL_D_GPS;
    private double md_e_GSL_E_GPS;
    private double md_e_GSL_F_GPS;
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

    public int getGSReceiver() {
        return GSReceiver;
    }

    public void setGSReceiver(int GSReceiver) {
        this.GSReceiver = GSReceiver;
    }

    public int getGSAccDesignator() {
        return GSAccDesignator;
    }

    public void setGSAccDesignator(int GSAccDesignator) {
        this.GSAccDesignator = GSAccDesignator;
    }

    public int getGSCIDisignator() {
        return GSCIDisignator;
    }

    public void setGSCIDisignator(int GSCIDisignator) {
        this.GSCIDisignator = GSCIDisignator;
    }

    public double getLocalMagneticVariation() {
        return localMagneticVariation;
    }

    public void setLocalMagneticVariation(double localMagneticVariation) {
        this.localMagneticVariation = localMagneticVariation;
    }

    public double getVert_iono_gradient() {
        return vert_iono_gradient;
    }

    public void setVert_iono_gradient(double vert_iono_gradient) {
        this.vert_iono_gradient = vert_iono_gradient;
    }

    public int getRefractivityIndex() {
        return refractivityIndex;
    }

    public void setRefractivityIndex(int refractivityIndex) {
        this.refractivityIndex = refractivityIndex;
    }

    public int getScaleHeight() {
        return scaleHeight;
    }

    public void setScaleHeight(int scaleHeight) {
        this.scaleHeight = scaleHeight;
    }

    public int getRefractivityUncertainty() {
        return refractivityUncertainty;
    }

    public void setRefractivityUncertainty(int refractivityUncertainty) {
        this.refractivityUncertainty = refractivityUncertainty;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getReferencePointHeight() {
        return referencePointHeight;
    }

    public void setReferencePointHeight(double referencePointHeight) {
        this.referencePointHeight = referencePointHeight;
    }

    public int getReferenceStationDataSelector() {
        return referenceStationDataSelector;
    }

    public void setReferenceStationDataSelector(int referenceStationDataSelector) {
        this.referenceStationDataSelector = referenceStationDataSelector;
    }

    public int getMaximumUseDistance() {
        return maximumUseDistance;
    }

    public void setMaximumUseDistance(int maximumUseDistance) {
        this.maximumUseDistance = maximumUseDistance;
    }

    public double getMd_e_POS_GPS() {
        return md_e_POS_GPS;
    }

    public void setMd_e_POS_GPS(double md_e_POS_GPS) {
        this.md_e_POS_GPS = md_e_POS_GPS;
    }

    public double getMd_e_CAT1_GPS() {
        return md_e_CAT1_GPS;
    }

    public void setMd_e_CAT1_GPS(double md_e_CAT1_GPS) {
        this.md_e_CAT1_GPS = md_e_CAT1_GPS;
    }

    public double getMd_e_POS_GLONASS() {
        return md_e_POS_GLONASS;
    }

    public void setMd_e_POS_GLONASS(double md_e_POS_GLONASS) {
        this.md_e_POS_GLONASS = md_e_POS_GLONASS;
    }

    public double getMd_e_CAT1_GLONASS() {
        return md_e_CAT1_GLONASS;
    }

    public void setMd_e_CAT1_GLONASS(double md_e_CAT1_GLONASS) {
        this.md_e_CAT1_GLONASS = md_e_CAT1_GLONASS;
    }

    public int getAdditionalDataBlockLength() {
        return additionalDataBlockLength;
    }

    public void setAdditionalDataBlockLength(int additionalDataBlockLength) {
        this.additionalDataBlockLength = additionalDataBlockLength;
    }

    public int getAdditionalDataBlockNumber() {
        return additionalDataBlockNumber;
    }

    public void setAdditionalDataBlockNumber(int additionalDataBlockNumber) {
        this.additionalDataBlockNumber = additionalDataBlockNumber;
    }

    public double getMd_e_GSL_D_GPS() {
        return md_e_GSL_D_GPS;
    }

    public void setMd_e_GSL_D_GPS(double md_e_GSL_D_GPS) {
        this.md_e_GSL_D_GPS = md_e_GSL_D_GPS;
    }

    public double getMd_e_GSL_E_GPS() {
        return md_e_GSL_E_GPS;
    }

    public void setMd_e_GSL_E_GPS(double md_e_GSL_E_GPS) {
        this.md_e_GSL_E_GPS = md_e_GSL_E_GPS;
    }

    public double getMd_e_GSL_F_GPS() {
        return md_e_GSL_F_GPS;
    }

    public void setMd_e_GSL_F_GPS(double md_e_GSL_F_GPS) {
        this.md_e_GSL_F_GPS = md_e_GSL_F_GPS;
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