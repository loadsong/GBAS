package com.service.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Bdsnavdata {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Id
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

    @Column(name = "weekCount")
    private Short weekcount;

    @Column(name = "URAI")
    private Byte urai;

    @Column(name = "SatHel")
    private Byte sathel;

    @Column(name = "IODC")
    private Byte iodc;

    @Column(name = "IODE")
    private Byte iode;

    @Column(name = "TGD1")
    private Short tgd1;

    @Column(name = "TGD2")
    private Short tgd2;

    public BigDecimal getEcc() {
        return ecc;
    }

    public void setEcc(BigDecimal ecc) {
        this.ecc = ecc;
    }

    private Integer toc;

    private BigDecimal af0;

    private BigDecimal af1;

    private BigDecimal af2;

    private BigDecimal ecc;

    private Integer toe;

    @Column(name = "sqrtA")
    private BigDecimal sqrta;

    private BigDecimal e;

    private BigDecimal w;

    @Column(name = "deltaN")
    private BigDecimal deltan;

    @Column(name = "M0")
    private BigDecimal m0;

    @Column(name = "orbitalLon")
    private BigDecimal orbitallon;

    @Column(name = "orbitalLonRate")
    private BigDecimal orbitallonrate;

    private BigDecimal i0;

    @Column(name = "IDOT")
    private BigDecimal idot;

    @Column(name = "Cuc")
    private BigDecimal cuc;

    @Column(name = "Cus")
    private BigDecimal cus;

    @Column(name = "Crc")
    private BigDecimal crc;

    @Column(name = "Crs")
    private BigDecimal crs;

    @Column(name = "Cic")
    private BigDecimal cic;

    @Column(name = "Cis")
    private BigDecimal cis;

    @Column(name = "Wntoc")
    private Short wntoc;

    @Column(name = "Wntoe")
    private Short wntoe;

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
     * @return weekCount
     */
    public Short getWeekcount() {
        return weekcount;
    }

    /**
     * @param weekcount
     */
    public void setWeekcount(Short weekcount) {
        this.weekcount = weekcount;
    }

    /**
     * @return URAI
     */
    public Byte getUrai() {
        return urai;
    }

    /**
     * @param urai
     */
    public void setUrai(Byte urai) {
        this.urai = urai;
    }

    /**
     * @return SatHel
     */
    public Byte getSathel() {
        return sathel;
    }

    /**
     * @param sathel
     */
    public void setSathel(Byte sathel) {
        this.sathel = sathel;
    }

    /**
     * @return IODC
     */
    public Byte getIodc() {
        return iodc;
    }

    /**
     * @param iodc
     */
    public void setIodc(Byte iodc) {
        this.iodc = iodc;
    }

    /**
     * @return IODE
     */
    public Byte getIode() {
        return iode;
    }

    /**
     * @param iode
     */
    public void setIode(Byte iode) {
        this.iode = iode;
    }

    /**
     * @return TGD1
     */
    public Short getTgd1() {
        return tgd1;
    }

    /**
     * @param tgd1
     */
    public void setTgd1(Short tgd1) {
        this.tgd1 = tgd1;
    }

    /**
     * @return TGD2
     */
    public Short getTgd2() {
        return tgd2;
    }

    /**
     * @param tgd2
     */
    public void setTgd2(Short tgd2) {
        this.tgd2 = tgd2;
    }

    /**
     * @return toc
     */
    public Integer getToc() {
        return toc;
    }

    /**
     * @param toc
     */
    public void setToc(Integer toc) {
        this.toc = toc;
    }

    /**
     * @return af0
     */
    public BigDecimal getAf0() {
        return af0;
    }

    /**
     * @param af0
     */
    public void setAf0(BigDecimal af0) {
        this.af0 = af0;
    }

    /**
     * @return af1
     */
    public BigDecimal getAf1() {
        return af1;
    }

    /**
     * @param af1
     */
    public void setAf1(BigDecimal af1) {
        this.af1 = af1;
    }

    /**
     * @return af2
     */
    public BigDecimal getAf2() {
        return af2;
    }

    /**
     * @param af2
     */
    public void setAf2(BigDecimal af2) {
        this.af2 = af2;
    }

    /**
     * @return toe
     */
    public Integer getToe() {
        return toe;
    }

    /**
     * @param toe
     */
    public void setToe(Integer toe) {
        this.toe = toe;
    }

    /**
     * @return sqrtA
     */
    public BigDecimal getSqrta() {
        return sqrta;
    }

    /**
     * @param sqrta
     */
    public void setSqrta(BigDecimal sqrta) {
        this.sqrta = sqrta;
    }

    /**
     * @return e
     */
    public BigDecimal getE() {
        return e;
    }

    /**
     * @param e
     */
    public void setE(BigDecimal e) {
        this.e = e;
    }

    /**
     * @return w
     */
    public BigDecimal getW() {
        return w;
    }

    /**
     * @param w
     */
    public void setW(BigDecimal w) {
        this.w = w;
    }

    /**
     * @return deltaN
     */
    public BigDecimal getDeltan() {
        return deltan;
    }

    /**
     * @param deltan
     */
    public void setDeltan(BigDecimal deltan) {
        this.deltan = deltan;
    }

    /**
     * @return M0
     */
    public BigDecimal getM0() {
        return m0;
    }

    /**
     * @param m0
     */
    public void setM0(BigDecimal m0) {
        this.m0 = m0;
    }

    /**
     * @return orbitalLon
     */
    public BigDecimal getOrbitallon() {
        return orbitallon;
    }

    /**
     * @param orbitallon
     */
    public void setOrbitallon(BigDecimal orbitallon) {
        this.orbitallon = orbitallon;
    }

    /**
     * @return orbitalLonRate
     */
    public BigDecimal getOrbitallonrate() {
        return orbitallonrate;
    }

    /**
     * @param orbitallonrate
     */
    public void setOrbitallonrate(BigDecimal orbitallonrate) {
        this.orbitallonrate = orbitallonrate;
    }

    /**
     * @return i0
     */
    public BigDecimal getI0() {
        return i0;
    }

    /**
     * @param i0
     */
    public void setI0(BigDecimal i0) {
        this.i0 = i0;
    }

    /**
     * @return IDOT
     */
    public BigDecimal getIdot() {
        return idot;
    }

    /**
     * @param idot
     */
    public void setIdot(BigDecimal idot) {
        this.idot = idot;
    }

    /**
     * @return Cuc
     */
    public BigDecimal getCuc() {
        return cuc;
    }

    /**
     * @param cuc
     */
    public void setCuc(BigDecimal cuc) {
        this.cuc = cuc;
    }

    /**
     * @return Cus
     */
    public BigDecimal getCus() {
        return cus;
    }

    /**
     * @param cus
     */
    public void setCus(BigDecimal cus) {
        this.cus = cus;
    }

    /**
     * @return Crc
     */
    public BigDecimal getCrc() {
        return crc;
    }

    /**
     * @param crc
     */
    public void setCrc(BigDecimal crc) {
        this.crc = crc;
    }

    /**
     * @return Crs
     */
    public BigDecimal getCrs() {
        return crs;
    }

    /**
     * @param crs
     */
    public void setCrs(BigDecimal crs) {
        this.crs = crs;
    }

    /**
     * @return Cic
     */
    public BigDecimal getCic() {
        return cic;
    }

    /**
     * @param cic
     */
    public void setCic(BigDecimal cic) {
        this.cic = cic;
    }

    /**
     * @return Cis
     */
    public BigDecimal getCis() {
        return cis;
    }

    /**
     * @param cis
     */
    public void setCis(BigDecimal cis) {
        this.cis = cis;
    }

    /**
     * @return Wntoc
     */
    public Short getWntoc() {
        return wntoc;
    }

    /**
     * @param wntoc
     */
    public void setWntoc(Short wntoc) {
        this.wntoc = wntoc;
    }

    /**
     * @return Wntoe
     */
    public Short getWntoe() {
        return wntoe;
    }

    /**
     * @param wntoe
     */
    public void setWntoe(Short wntoe) {
        this.wntoe = wntoe;
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