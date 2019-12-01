package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class MessagetypeAll {
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
    private String currenttime;

    // messagetype 2

    private Byte GSReceiver;
    private Byte GSAccDesignator;
    private Byte GSCIDisignator;
    private BigDecimal localMagneticVariation;
    private BigDecimal vert_iono_gradient;
    private Integer refractivityindex;
    private Integer scaleheight;
    private Integer refractivityuncertainty;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal referencepointheight;
    private Integer referencestationdataselector;
    private Integer maximumusedistance;
    private BigDecimal md_e_pos_gps;
    private BigDecimal md_e_cat1_gps;
    private BigDecimal md_e_pos_glonass;
    private BigDecimal md_e_cat1_glonass;
    private Byte additionaldatablocklength;
    private Byte additionaldatablocknumber;
    private BigDecimal md_e_gsl_d_gps;
    private BigDecimal md_e_gsl_e_gps;
    private BigDecimal md_e_gsl_f_gps;


    //messagetype 4
    private Byte datasetlength;
    private Byte operationtype;
    private Byte sbasserviceprovider;
    private String airportid;
    private Byte runwaynumber;
    private Integer runwayletter;
    private Byte apdesignator;
    private String routeindicator;
    private Byte refpathdataselector;
    private String referencepathid;
    private BigDecimal ltpFtplatitude;
    private BigDecimal ltpFtplongitude;
    private BigDecimal ltpFtpheight;
    private BigDecimal fpaplatitude;
    private BigDecimal fpaplongitude;
    private BigDecimal approachthcrossingheight;
    private Byte approachtchunitsselector;
    private BigDecimal gpa;
    private BigDecimal coursewidthatthreshold;
    private Integer lengthoffset;
    private BigDecimal finalapproachsegmentcrc;
    private BigDecimal fasvalapproachstatus;
    private BigDecimal faslalapproachstatus;

    //messagetype11

    private BigDecimal ltp_ftplatitude;
    private BigDecimal ltp_ftplongitude;
    private BigDecimal ltp_ftpheight;


    /**
     * @return currentTime
     */
    public String getCurrenttime() {
        return currenttime.substring(0, 19);
    }

    /**
     * @param currenttime
     */
    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }
}