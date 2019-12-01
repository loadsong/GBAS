package com.service.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by songmeng on 2018/12/21.
 */
public class SatInfoByMath {
    private double sum;
    private double max;
    private double min;
    private double avg;
    private double stddev;
    private double median;
    private double count;
    private double max_sal_95;
    private double max_sal_99;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getStddev() {
        return stddev;
    }

    public void setStddev(double stddev) {
        this.stddev = stddev;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getMax_sal_95() {
        return max_sal_95;
    }

    public void setMax_sal_95(double max_sal_95) {
        this.max_sal_95 = max_sal_95;
    }

    public double getMax_sal_99() {
        return max_sal_99;
    }

    public void setMax_sal_99(double max_sal_99) {
        this.max_sal_99 = max_sal_99;
    }
}
