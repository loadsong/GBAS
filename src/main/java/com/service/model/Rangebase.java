package com.service.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

public class Rangebase {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;
    @Column(name = "SEQID")
    private Long seqid;

    private Short week;

    public Long getId() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public Long getseqid() {
        return seqid;
    }

    public void setseqid(Long seqid) {
        this.seqid = seqid;
    }

    public Short getWeek() {
        return week;
    }

    public void setWeek(Short week) {
        this.week = week;
    }

    public Integer getMsow() {
        return msow;
    }

    public void setMsow(Integer msow) {
        this.msow = msow;
    }

    public String getGbasid() {
        return gbasid;
    }

    public void setGbasid(String gbasid) {
        this.gbasid = gbasid;
    }

    public Byte getFreqsigid() {
        return freqsigid;
    }

    public void setFreqsigid(Byte freqsigid) {
        this.freqsigid = freqsigid;
    }

    public Byte getRectypeid() {
        return rectypeid;
    }

    public void setRectypeid(Byte rectypeid) {
        this.rectypeid = rectypeid;
    }

    public Byte getRecid() {
        return recid;
    }

    public void setRecid(Byte recid) {
        this.recid = recid;
    }

    public Byte getFrame() {
        return frame;
    }

    public void setFrame(Byte frame) {
        this.frame = frame;
    }

    public Byte getSatnum() {
        return satnum;
    }

    public void setSatnum(Byte satnum) {
        this.satnum = satnum;
    }

    public String getCurrenttime() {
        return currenttime.substring(0,19);
    }

    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }

    private Integer msow;

    @Column(name = "gbasid")
    private String gbasid;

    @Column(name = "freqsigid")
    private Byte freqsigid;

    @Column(name = "rectypeid")
    private Byte rectypeid;

    @Column(name = "recid")
    private Byte recid;

    private Byte frame;

    @Column(name = "satnum")
    private Byte satnum;

    @Column(name = "currenttime")
    private String currenttime;


}