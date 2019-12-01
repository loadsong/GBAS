package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Procdata {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;

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

    @Column(name = "CN0")
    private Byte cn0;

    private BigDecimal pseudo;

    @Column(name = "phaseData")
    private BigDecimal phasedata;

    public BigDecimal getBmrcc() {
        return bmrcc;
    }

    public void setBmrcc(BigDecimal bmrcc) {
        this.bmrcc = bmrcc;
    }

    private Integer locktime;

    @Column(name = "Cnavg")
    private BigDecimal cnavg;

    private BigDecimal bmrcc;

    @Column(name = "CNTh")
    private BigDecimal cnth;

    private BigDecimal correlate;

    @Column(name = "correlateTh")
    private BigDecimal correlateth;

    private Byte matrix0;

    @Column(name = "DQM")
    private BigDecimal dqm;

    @Column(name = "DQMTh")
    private BigDecimal dqmth;

    private BigDecimal elevation;

    private BigDecimal azimuth;

    @Column(name = "Z")
    private BigDecimal z;

    private BigDecimal dvgc;

    @Column(name = "dvgTh")
    private BigDecimal dvgth;

    @Column(name = "Acc")
    private BigDecimal Acc;

    @Column(name = "AccMINTh")
    private BigDecimal Accminth;
    @Column(name = "AccMAXTh")
    private BigDecimal Accmaxth;

    public BigDecimal getAccminth() {
        return Accminth;
    }

    public void setAccminth(BigDecimal accminth) {
        Accminth = accminth;
    }

    public BigDecimal getAccmaxth() {
        return Accmaxth;
    }

    public void setAccmaxth(BigDecimal accmaxth) {
        Accmaxth = accmaxth;
    }

    @Column(name = "Ramp")
    private BigDecimal ramp;

    @Column(name = "RampTh")
    private BigDecimal rampth;

    @Column(name = "Step")
    private BigDecimal step;

    @Column(name = "StepTh")
    private BigDecimal stepth;

    @Column(name = "Hatch")
    private BigDecimal hatch;

    @Column(name = "Inno")
    private BigDecimal inno;

    @Column(name = "InnoTh")
    private BigDecimal innoth;

    private Byte matrix1;

    private Byte matrix2;

    @Column(name = "Tao")
    private BigDecimal tao;

    @Column(name = "disRecvSate")
    private BigDecimal disrecvsate;

    @Column(name = "earthRot")
    private BigDecimal earthrot;

    @Column(name = "avgRecClk")
    private BigDecimal avgrecclk;

    @Column(name = "PRC")
    private BigDecimal prc;

    @Column(name = "RRC")
    private BigDecimal rrc;

    @Column(name = "TimeHatch")
    private Integer timehatch;

    private BigDecimal svclk;

    @Column(name = "relClk")
    private BigDecimal relclk;

    private BigDecimal prgnd;

    @Column(name = "BValue")
    private BigDecimal bvalue;

    private Byte ephem;

    private BigDecimal toe;

    @Column(name = "phaseInital")
    private BigDecimal phaseinital;

    @Column(name = "pseudoResidul")
    private BigDecimal pseudoresidul;

    @Column(name = "phaseResidual")
    private BigDecimal phaseresidual;

    @Column(name = "pseudoWoSvClk")
    private BigDecimal pseudowosvclk;

    @Column(name = "pseudoWoRcvClk")
    private BigDecimal pseudoworcvclk;

    @Column(name = "phaseWoRcvClk")
    private BigDecimal phaseworcvclk;

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
     * @return CN0
     */
    public Byte getCn0() {
        return cn0;
    }

    /**
     * @param cn0
     */
    public void setCn0(Byte cn0) {
        this.cn0 = cn0;
    }

    /**
     * @return pseudo
     */
    public BigDecimal getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo
     */
    public void setPseudo(BigDecimal pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return phaseData
     */
    public BigDecimal getPhasedata() {
        return phasedata;
    }

    /**
     * @param phasedata
     */
    public void setPhasedata(BigDecimal phasedata) {
        this.phasedata = phasedata;
    }

    /**
     * @return locktime
     */
    public Integer getLocktime() {
        return locktime;
    }

    /**
     * @param locktime
     */
    public void setLocktime(Integer locktime) {
        this.locktime = locktime;
    }

    /**
     * @return Cnavg
     */
    public BigDecimal getCnavg() {
        return cnavg;
    }

    /**
     * @param cnavg
     */
    public void setCnavg(BigDecimal cnavg) {
        this.cnavg = cnavg;
    }

    /**
     * @return CNTh
     */
    public BigDecimal getCnth() {
        return cnth;
    }

    /**
     * @param cnth
     */
    public void setCnth(BigDecimal cnth) {
        this.cnth = cnth;
    }

    /**
     * @return correlate
     */
    public BigDecimal getCorrelate() {
        return correlate;
    }

    /**
     * @param correlate
     */
    public void setCorrelate(BigDecimal correlate) {
        this.correlate = correlate;
    }

    /**
     * @return correlateTh
     */
    public BigDecimal getCorrelateth() {
        return correlateth;
    }

    /**
     * @param correlateth
     */
    public void setCorrelateth(BigDecimal correlateth) {
        this.correlateth = correlateth;
    }

    /**
     * @return matrix0
     */
    public Byte getMatrix0() {
        return matrix0;
    }

    /**
     * @param matrix0
     */
    public void setMatrix0(Byte matrix0) {
        this.matrix0 = matrix0;
    }

    /**
     * @return DQM
     */
    public BigDecimal getDqm() {
        return dqm;
    }

    /**
     * @param dqm
     */
    public void setDqm(BigDecimal dqm) {
        this.dqm = dqm;
    }

    /**
     * @return DQMTh
     */
    public BigDecimal getDqmth() {
        return dqmth;
    }

    /**
     * @param dqmth
     */
    public void setDqmth(BigDecimal dqmth) {
        this.dqmth = dqmth;
    }

    /**
     * @return elevation
     */
    public BigDecimal getElevation() {
        return elevation;
    }

    /**
     * @param elevation
     */
    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    /**
     * @return azimuth
     */
    public BigDecimal getAzimuth() {
        return azimuth;
    }

    /**
     * @param azimuth
     */
    public void setAzimuth(BigDecimal azimuth) {
        this.azimuth = azimuth;
    }

    /**
     * @return Z
     */
    public BigDecimal getZ() {
        return z;
    }

    /**
     * @param z
     */
    public void setZ(BigDecimal z) {
        this.z = z;
    }

    /**
     * @return dvgc
     */
    public BigDecimal getDvgc() {
        return dvgc;
    }

    /**
     * @param dvgc
     */
    public void setDvgc(BigDecimal dvgc) {
        this.dvgc = dvgc;
    }

    /**
     * @return dvgTh
     */
    public BigDecimal getDvgth() {
        return dvgth;
    }

    /**
     * @param dvgth
     */
    public void setDvgth(BigDecimal dvgth) {
        this.dvgth = dvgth;
    }

    /**
     * @return Acc
     */
    public BigDecimal getAcc() {
        return Acc;
    }

    /**
     * @param Acc
     */
    public void setAcc(BigDecimal Acc) {
        this.Acc = Acc;
    }



    /**
     * @return Ramp
     */
    public BigDecimal getRamp() {
        return ramp;
    }

    /**
     * @param ramp
     */
    public void setRamp(BigDecimal ramp) {
        this.ramp = ramp;
    }

    /**
     * @return RampTh
     */
    public BigDecimal getRampth() {
        return rampth;
    }

    /**
     * @param rampth
     */
    public void setRampth(BigDecimal rampth) {
        this.rampth = rampth;
    }

    /**
     * @return Step
     */
    public BigDecimal getStep() {
        return step;
    }

    /**
     * @param step
     */
    public void setStep(BigDecimal step) {
        this.step = step;
    }

    /**
     * @return StepTh
     */
    public BigDecimal getStepth() {
        return stepth;
    }

    /**
     * @param stepth
     */
    public void setStepth(BigDecimal stepth) {
        this.stepth = stepth;
    }

    /**
     * @return Hatch
     */
    public BigDecimal getHatch() {
        return hatch;
    }

    /**
     * @param hatch
     */
    public void setHatch(BigDecimal hatch) {
        this.hatch = hatch;
    }

    /**
     * @return Inno
     */
    public BigDecimal getInno() {
        return inno;
    }

    /**
     * @param inno
     */
    public void setInno(BigDecimal inno) {
        this.inno = inno;
    }

    /**
     * @return InnoTh
     */
    public BigDecimal getInnoth() {
        return innoth;
    }

    /**
     * @param innoth
     */
    public void setInnoth(BigDecimal innoth) {
        this.innoth = innoth;
    }

    /**
     * @return matrix1
     */
    public Byte getMatrix1() {
        return matrix1;
    }

    /**
     * @param matrix1
     */
    public void setMatrix1(Byte matrix1) {
        this.matrix1 = matrix1;
    }

    /**
     * @return matrix2
     */
    public Byte getMatrix2() {
        return matrix2;
    }

    /**
     * @param matrix2
     */
    public void setMatrix2(Byte matrix2) {
        this.matrix2 = matrix2;
    }

    /**
     * @return Tao
     */
    public BigDecimal getTao() {
        return tao;
    }

    /**
     * @param tao
     */
    public void setTao(BigDecimal tao) {
        this.tao = tao;
    }

    /**
     * @return disRecvSate
     */
    public BigDecimal getDisrecvsate() {
        return disrecvsate;
    }

    /**
     * @param disrecvsate
     */
    public void setDisrecvsate(BigDecimal disrecvsate) {
        this.disrecvsate = disrecvsate;
    }

    /**
     * @return earthRot
     */
    public BigDecimal getEarthrot() {
        return earthrot;
    }

    /**
     * @param earthrot
     */
    public void setEarthrot(BigDecimal earthrot) {
        this.earthrot = earthrot;
    }

    /**
     * @return avgRecClk
     */
    public BigDecimal getAvgrecclk() {
        return avgrecclk;
    }

    /**
     * @param avgrecclk
     */
    public void setAvgrecclk(BigDecimal avgrecclk) {
        this.avgrecclk = avgrecclk;
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
     * @return TimeHatch
     */
    public Integer getTimehatch() {
        return timehatch;
    }

    /**
     * @param timehatch
     */
    public void setTimehatch(Integer timehatch) {
        this.timehatch = timehatch;
    }

    /**
     * @return svclk
     */
    public BigDecimal getSvclk() {
        return svclk;
    }

    /**
     * @param svclk
     */
    public void setSvclk(BigDecimal svclk) {
        this.svclk = svclk;
    }

    /**
     * @return relClk
     */
    public BigDecimal getRelclk() {
        return relclk;
    }

    /**
     * @param relclk
     */
    public void setRelclk(BigDecimal relclk) {
        this.relclk = relclk;
    }

    /**
     * @return prgnd
     */
    public BigDecimal getPrgnd() {
        return prgnd;
    }

    /**
     * @param prgnd
     */
    public void setPrgnd(BigDecimal prgnd) {
        this.prgnd = prgnd;
    }

    /**
     * @return BValue
     */
    public BigDecimal getBvalue() {
        return bvalue;
    }

    /**
     * @param bvalue
     */
    public void setBvalue(BigDecimal bvalue) {
        this.bvalue = bvalue;
    }

    /**
     * @return ephem
     */
    public Byte getEphem() {
        return ephem;
    }

    /**
     * @param ephem
     */
    public void setEphem(Byte ephem) {
        this.ephem = ephem;
    }

    /**
     * @return toe
     */
    public BigDecimal getToe() {
        return toe;
    }

    /**
     * @param toe
     */
    public void setToe(BigDecimal toe) {
        this.toe = toe;
    }

    /**
     * @return phaseInital
     */
    public BigDecimal getPhaseinital() {
        return phaseinital;
    }

    /**
     * @param phaseinital
     */
    public void setPhaseinital(BigDecimal phaseinital) {
        this.phaseinital = phaseinital;
    }

    /**
     * @return pseudoResidul
     */
    public BigDecimal getPseudoresidul() {
        return pseudoresidul;
    }

    /**
     * @param pseudoresidul
     */
    public void setPseudoresidul(BigDecimal pseudoresidul) {
        this.pseudoresidul = pseudoresidul;
    }

    /**
     * @return phaseResidual
     */
    public BigDecimal getPhaseresidual() {
        return phaseresidual;
    }

    /**
     * @param phaseresidual
     */
    public void setPhaseresidual(BigDecimal phaseresidual) {
        this.phaseresidual = phaseresidual;
    }

    /**
     * @return pseudoWoSvClk
     */
    public BigDecimal getPseudowosvclk() {
        return pseudowosvclk;
    }

    /**
     * @param pseudowosvclk
     */
    public void setPseudowosvclk(BigDecimal pseudowosvclk) {
        this.pseudowosvclk = pseudowosvclk;
    }

    /**
     * @return pseudoWoRcvClk
     */
    public BigDecimal getPseudoworcvclk() {
        return pseudoworcvclk;
    }

    /**
     * @param pseudoworcvclk
     */
    public void setPseudoworcvclk(BigDecimal pseudoworcvclk) {
        this.pseudoworcvclk = pseudoworcvclk;
    }

    /**
     * @return phaseWoRcvClk
     */
    public BigDecimal getPhaseworcvclk() {
        return phaseworcvclk;
    }

    /**
     * @param phaseworcvclk
     */
    public void setPhaseworcvclk(BigDecimal phaseworcvclk) {
        this.phaseworcvclk = phaseworcvclk;
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

    private BigDecimal rampminth;
    private BigDecimal stepminth;
    private BigDecimal innominth;
    private BigDecimal dqmminth;
    private BigDecimal dvgcminth;

    private BigDecimal rampmaxth;
    private BigDecimal stepmaxth;
    private BigDecimal innomaxth;
    private BigDecimal dqmmaxth;

    public BigDecimal getRampminth() {
        return rampminth;
    }

    public void setRampminth(BigDecimal rampminth) {
        this.rampminth = rampminth;
    }

    public BigDecimal getStepminth() {
        return stepminth;
    }

    public void setStepminth(BigDecimal stepminth) {
        this.stepminth = stepminth;
    }

    public BigDecimal getInnominth() {
        return innominth;
    }

    public void setInnominth(BigDecimal innominth) {
        this.innominth = innominth;
    }

    public BigDecimal getDqmminth() {
        return dqmminth;
    }

    public void setDqmminth(BigDecimal dqmminth) {
        this.dqmminth = dqmminth;
    }

    public BigDecimal getDvgcminth() {
        return dvgcminth;
    }

    public void setDvgcminth(BigDecimal dvgcminth) {
        this.dvgcminth = dvgcminth;
    }

    public BigDecimal getRampmaxth() {
        return rampmaxth;
    }

    public void setRampmaxth(BigDecimal rampmaxth) {
        this.rampmaxth = rampmaxth;
    }

    public BigDecimal getStepmaxth() {
        return stepmaxth;
    }

    public void setStepmaxth(BigDecimal stepmaxth) {
        this.stepmaxth = stepmaxth;
    }

    public BigDecimal getInnomaxth() {
        return innomaxth;
    }

    public void setInnomaxth(BigDecimal innomaxth) {
        this.innomaxth = innomaxth;
    }

    public BigDecimal getDqmmaxth() {
        return dqmmaxth;
    }

    public void setDqmmaxth(BigDecimal dqmmaxth) {
        this.dqmmaxth = dqmmaxth;
    }

    public BigDecimal getDvgcmaxth() {
        return dvgcmaxth;
    }

    public void setDvgcmaxth(BigDecimal dvgcmaxth) {
        this.dvgcmaxth = dvgcmaxth;
    }

    private BigDecimal dvgcmaxth;


}