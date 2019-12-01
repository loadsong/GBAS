package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Messagetype2 {
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

    @Column(name = "GSReceiver")
    private Byte gsreceiver;

    @Column(name = "GSAccDesignator")
    private Byte gsaccdesignator;

    @Column(name = "GSCIDisignator")
    private Byte gscidisignator;

    @Column(name = "localMagneticVariation")
    private BigDecimal localmagneticvariation;

    @Column(name = "vert_iono_gradient")
    private BigDecimal vertIonoGradient;

    @Column(name = "refractivityIndex")
    private Integer refractivityindex;

    @Column(name = "scaleHeight")
    private Integer scaleheight;

    public BigDecimal getVert_iono_gradient() {
        return vert_iono_gradient;
    }

    public void setVert_iono_gradient(BigDecimal vert_iono_gradient) {
        this.vert_iono_gradient = vert_iono_gradient;
    }

    public BigDecimal getMd_e_pos_gps() {
        return md_e_pos_gps;
    }

    public void setMd_e_pos_gps(BigDecimal md_e_pos_gps) {
        this.md_e_pos_gps = md_e_pos_gps;
    }

    public BigDecimal getMd_e_cat1_gps() {
        return md_e_cat1_gps;
    }

    public void setMd_e_cat1_gps(BigDecimal md_e_cat1_gps) {
        this.md_e_cat1_gps = md_e_cat1_gps;
    }

    public BigDecimal getMd_e_pos_glonass() {
        return md_e_pos_glonass;
    }

    public void setMd_e_pos_glonass(BigDecimal md_e_pos_glonass) {
        this.md_e_pos_glonass = md_e_pos_glonass;
    }

    public BigDecimal getMd_e_cat1_glonass() {
        return md_e_cat1_glonass;
    }

    public void setMd_e_cat1_glonass(BigDecimal md_e_cat1_glonass) {
        this.md_e_cat1_glonass = md_e_cat1_glonass;
    }

    public BigDecimal getMd_e_gsl_d_gps() {
        return md_e_gsl_d_gps;
    }

    public void setMd_e_gsl_d_gps(BigDecimal md_e_gsl_d_gps) {
        this.md_e_gsl_d_gps = md_e_gsl_d_gps;
    }

    public BigDecimal getMd_e_gsl_e_gps() {
        return md_e_gsl_e_gps;
    }

    public void setMd_e_gsl_e_gps(BigDecimal md_e_gsl_e_gps) {
        this.md_e_gsl_e_gps = md_e_gsl_e_gps;
    }

    public BigDecimal getMd_e_gsl_f_gps() {
        return md_e_gsl_f_gps;
    }

    public void setMd_e_gsl_f_gps(BigDecimal md_e_gsl_f_gps) {
        this.md_e_gsl_f_gps = md_e_gsl_f_gps;
    }

    @Column(name = "refractivityUncertainty")

    private Integer refractivityuncertainty;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private BigDecimal vert_iono_gradient;
    private BigDecimal md_e_pos_gps;
    private BigDecimal md_e_cat1_gps;
    private BigDecimal md_e_pos_glonass;
    private BigDecimal md_e_cat1_glonass;
    private BigDecimal md_e_gsl_d_gps;
    private BigDecimal md_e_gsl_e_gps;
    private BigDecimal md_e_gsl_f_gps;

    @Column(name = "referencePointHeight")
    private BigDecimal referencepointheight;

    @Column(name = "referenceStationDataSelector")
    private Integer referencestationdataselector;

    @Column(name = "maximumUseDistance")
    private Integer maximumusedistance;

    @Column(name = "md_e_POS_GPS")
    private BigDecimal mdEPosGps;

    @Column(name = "md_e_CAT1_GPS")
    private BigDecimal mdECat1Gps;

    @Column(name = "md_e_POS_GLONASS")
    private BigDecimal mdEPosGlonass;

    @Column(name = "md_e_CAT1_GLONASS")
    private BigDecimal mdECat1Glonass;

    @Column(name = "additionalDataBlockLength")
    private Byte additionaldatablocklength;

    @Column(name = "additionalDataBlockNumber")
    private Byte additionaldatablocknumber;

    @Column(name = "md_e_GSL_D_GPS")
    private BigDecimal mdEGslDGps;

    @Column(name = "md_e_GSL_E_GPS")
    private BigDecimal mdEGslEGps;

    @Column(name = "md_e_GSL_F_GPS")
    private BigDecimal mdEGslFGps;

    @Column(name = "CRC")
    private Integer crc;

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
     * @return GSReceiver
     */
    public Byte getGsreceiver() {
        return gsreceiver;
    }

    /**
     * @param gsreceiver
     */
    public void setGsreceiver(Byte gsreceiver) {
        this.gsreceiver = gsreceiver;
    }

    /**
     * @return GSAccDesignator
     */
    public Byte getGsaccdesignator() {
        return gsaccdesignator;
    }

    /**
     * @param gsaccdesignator
     */
    public void setGsaccdesignator(Byte gsaccdesignator) {
        this.gsaccdesignator = gsaccdesignator;
    }

    /**
     * @return GSCIDisignator
     */
    public Byte getGscidisignator() {
        return gscidisignator;
    }

    /**
     * @param gscidisignator
     */
    public void setGscidisignator(Byte gscidisignator) {
        this.gscidisignator = gscidisignator;
    }

    /**
     * @return localMagneticVariation
     */
    public BigDecimal getLocalmagneticvariation() {
        return localmagneticvariation;
    }

    /**
     * @param localmagneticvariation
     */
    public void setLocalmagneticvariation(BigDecimal localmagneticvariation) {
        this.localmagneticvariation = localmagneticvariation;
    }

    /**
     * @return vert_iono_gradient
     */
    public BigDecimal getVertIonoGradient() {
        return vertIonoGradient;
    }

    /**
     * @param vertIonoGradient
     */
    public void setVertIonoGradient(BigDecimal vertIonoGradient) {
        this.vertIonoGradient = vertIonoGradient;
    }

    /**
     * @return refractivityIndex
     */
    public Integer getRefractivityindex() {
        return refractivityindex;
    }

    /**
     * @param refractivityindex
     */
    public void setRefractivityindex(Integer refractivityindex) {
        this.refractivityindex = refractivityindex;
    }

    /**
     * @return scaleHeight
     */
    public Integer getScaleheight() {
        return scaleheight;
    }

    /**
     * @param scaleheight
     */
    public void setScaleheight(Integer scaleheight) {
        this.scaleheight = scaleheight;
    }

    /**
     * @return refractivityUncertainty
     */
    public Integer getRefractivityuncertainty() {
        return refractivityuncertainty;
    }

    /**
     * @param refractivityuncertainty
     */
    public void setRefractivityuncertainty(Integer refractivityuncertainty) {
        this.refractivityuncertainty = refractivityuncertainty;
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
     * @return referenceStationDataSelector
     */
    public Integer getReferencestationdataselector() {
        return referencestationdataselector;
    }

    /**
     * @param referencestationdataselector
     */
    public void setReferencestationdataselector(Integer referencestationdataselector) {
        this.referencestationdataselector = referencestationdataselector;
    }

    /**
     * @return maximumUseDistance
     */
    public Integer getMaximumusedistance() {
        return maximumusedistance;
    }

    /**
     * @param maximumusedistance
     */
    public void setMaximumusedistance(Integer maximumusedistance) {
        this.maximumusedistance = maximumusedistance;
    }

    /**
     * @return md_e_POS_GPS
     */
    public BigDecimal getMdEPosGps() {
        return mdEPosGps;
    }

    /**
     * @param mdEPosGps
     */
    public void setMdEPosGps(BigDecimal mdEPosGps) {
        this.mdEPosGps = mdEPosGps;
    }

    /**
     * @return md_e_CAT1_GPS
     */
    public BigDecimal getMdECat1Gps() {
        return mdECat1Gps;
    }

    /**
     * @param mdECat1Gps
     */
    public void setMdECat1Gps(BigDecimal mdECat1Gps) {
        this.mdECat1Gps = mdECat1Gps;
    }

    /**
     * @return md_e_POS_GLONASS
     */
    public BigDecimal getMdEPosGlonass() {
        return mdEPosGlonass;
    }

    /**
     * @param mdEPosGlonass
     */
    public void setMdEPosGlonass(BigDecimal mdEPosGlonass) {
        this.mdEPosGlonass = mdEPosGlonass;
    }

    /**
     * @return md_e_CAT1_GLONASS
     */
    public BigDecimal getMdECat1Glonass() {
        return mdECat1Glonass;
    }

    /**
     * @param mdECat1Glonass
     */
    public void setMdECat1Glonass(BigDecimal mdECat1Glonass) {
        this.mdECat1Glonass = mdECat1Glonass;
    }

    /**
     * @return additionalDataBlockLength
     */
    public Byte getAdditionaldatablocklength() {
        return additionaldatablocklength;
    }

    /**
     * @param additionaldatablocklength
     */
    public void setAdditionaldatablocklength(Byte additionaldatablocklength) {
        this.additionaldatablocklength = additionaldatablocklength;
    }

    /**
     * @return additionalDataBlockNumber
     */
    public Byte getAdditionaldatablocknumber() {
        return additionaldatablocknumber;
    }

    /**
     * @param additionaldatablocknumber
     */
    public void setAdditionaldatablocknumber(Byte additionaldatablocknumber) {
        this.additionaldatablocknumber = additionaldatablocknumber;
    }

    /**
     * @return md_e_GSL_D_GPS
     */
    public BigDecimal getMdEGslDGps() {
        return mdEGslDGps;
    }

    /**
     * @param mdEGslDGps
     */
    public void setMdEGslDGps(BigDecimal mdEGslDGps) {
        this.mdEGslDGps = mdEGslDGps;
    }

    /**
     * @return md_e_GSL_E_GPS
     */
    public BigDecimal getMdEGslEGps() {
        return mdEGslEGps;
    }

    /**
     * @param mdEGslEGps
     */
    public void setMdEGslEGps(BigDecimal mdEGslEGps) {
        this.mdEGslEGps = mdEGslEGps;
    }

    /**
     * @return md_e_GSL_F_GPS
     */
    public BigDecimal getMdEGslFGps() {
        return mdEGslFGps;
    }

    /**
     * @param mdEGslFGps
     */
    public void setMdEGslFGps(BigDecimal mdEGslFGps) {
        this.mdEGslFGps = mdEGslFGps;
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