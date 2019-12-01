package com.service.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by songmeng on 2018/12/21.
 */
public class SysInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int seqID;
    private int appID;
    private String sysID;
    private double CPUUsage;
    private double TotalMemory;
    private double UsedMemory;
    private double TotalDisk;
    private double FreeDisk;
    private String currentTime;

    public int getSeqID() {
        return seqID;
    }

    public void setSeqID(int seqID) {
        this.seqID = seqID;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public String getSysID() {
        return sysID;
    }

    public void setSysID(String sysID) {
        this.sysID = sysID;
    }

    public double getCPUUsage() {
        return CPUUsage;
    }

    public void setCPUUsage(double CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    public double getTotalMemory() {
        return TotalMemory;
    }

    public void setTotalMemory(double totalMemory) {
        TotalMemory = totalMemory;
    }

    public double getUsedMemory() {
        return UsedMemory;
    }

    public void setUsedMemory(double usedMemory) {
        UsedMemory = usedMemory;
    }

    public double getTotalDisk() {
        return TotalDisk;
    }

    public void setTotalDisk(double totalDisk) {
        TotalDisk = totalDisk;
    }

    public double getFreeDisk() {
        return FreeDisk;
    }

    public void setFreeDisk(double freeDisk) {
        FreeDisk = freeDisk;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
