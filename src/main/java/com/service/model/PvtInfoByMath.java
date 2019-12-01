package com.service.model;

import javax.persistence.Id;
import java.text.SimpleDateFormat;

public class PvtInfoByMath {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;


    private double sum;
    private double H_max;
    private double H_min;
    private double H_avg;
    private double H_stddev;
    private double H_median;
    private double H_count;
    private double H_max_sal_95;
    private double H_max_sal_99;
    private double LC_max;
    private double LC_min;
    private double LC_avg;
    private double LC_stddev;
    private double LC_median;
    private double LC_count;
    private double LC_max_sal_95;
    private double LC_max_sal_99;
    private double PC_max;
    private double PC_min;
    private double PC_avg;
    private double PC_stddev;
    private double PC_median;
    private double PC_count;
    private double PC_max_sal_95;
    private double PC_max_sal_99;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getH_max() {
        return H_max;
    }

    public void setH_max(double h_max) {
        H_max = h_max;
    }

    public double getH_min() {
        return H_min;
    }

    public void setH_min(double h_min) {
        H_min = h_min;
    }

    public double getH_avg() {
        return H_avg;
    }

    public void setH_avg(double h_avg) {
        H_avg = h_avg;
    }

    public double getH_stddev() {
        return H_stddev;
    }

    public void setH_stddev(double h_stddev) {
        H_stddev = h_stddev;
    }

    public double getH_median() {
        return H_median;
    }

    public void setH_median(double h_median) {
        H_median = h_median;
    }

    public double getH_count() {
        return H_count;
    }

    public void setH_count(double h_count) {
        H_count = h_count;
    }

    public double getH_max_sal_95() {
        return H_max_sal_95;
    }

    public void setH_max_sal_95(double h_max_sal_95) {
        H_max_sal_95 = h_max_sal_95;
    }

    public double getH_max_sal_99() {
        return H_max_sal_99;
    }

    public void setH_max_sal_99(double h_max_sal_99) {
        H_max_sal_99 = h_max_sal_99;
    }

    public double getLC_max() {
        return LC_max;
    }

    public void setLC_max(double LC_max) {
        this.LC_max = LC_max;
    }

    public double getLC_min() {
        return LC_min;
    }

    public void setLC_min(double LC_min) {
        this.LC_min = LC_min;
    }

    public double getLC_avg() {
        return LC_avg;
    }

    public void setLC_avg(double LC_avg) {
        this.LC_avg = LC_avg;
    }

    public double getLC_stddev() {
        return LC_stddev;
    }

    public void setLC_stddev(double LC_stddev) {
        this.LC_stddev = LC_stddev;
    }

    public double getLC_median() {
        return LC_median;
    }

    public void setLC_median(double LC_median) {
        this.LC_median = LC_median;
    }

    public double getLC_count() {
        return LC_count;
    }

    public void setLC_count(double LC_count) {
        this.LC_count = LC_count;
    }

    public double getLC_max_sal_95() {
        return LC_max_sal_95;
    }

    public void setLC_max_sal_95(double LC_max_sal_95) {
        this.LC_max_sal_95 = LC_max_sal_95;
    }

    public double getLC_max_sal_99() {
        return LC_max_sal_99;
    }

    public void setLC_max_sal_99(double LC_max_sal_99) {
        this.LC_max_sal_99 = LC_max_sal_99;
    }

    public double getPC_max() {
        return PC_max;
    }

    public void setPC_max(double PC_max) {
        this.PC_max = PC_max;
    }

    public double getPC_min() {
        return PC_min;
    }

    public void setPC_min(double PC_min) {
        this.PC_min = PC_min;
    }

    public double getPC_avg() {
        return PC_avg;
    }

    public void setPC_avg(double PC_avg) {
        this.PC_avg = PC_avg;
    }

    public double getPC_stddev() {
        return PC_stddev;
    }

    public void setPC_stddev(double PC_stddev) {
        this.PC_stddev = PC_stddev;
    }

    public double getPC_median() {
        return PC_median;
    }

    public void setPC_median(double PC_median) {
        this.PC_median = PC_median;
    }

    public double getPC_count() {
        return PC_count;
    }

    public void setPC_count(double PC_count) {
        this.PC_count = PC_count;
    }

    public double getPC_max_sal_95() {
        return PC_max_sal_95;
    }

    public void setPC_max_sal_95(double PC_max_sal_95) {
        this.PC_max_sal_95 = PC_max_sal_95;
    }

    public double getPC_max_sal_99() {
        return PC_max_sal_99;
    }

    public void setPC_max_sal_99(double PC_max_sal_99) {
        this.PC_max_sal_99 = PC_max_sal_99;
    }
}