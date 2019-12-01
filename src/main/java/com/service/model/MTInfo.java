package com.service.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by songmeng on 2018/12/21.
 */
public class MTInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int total;
    private int total2;
    private int total3;
    private int timeslot;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getTotal3() {
        return total3;
    }

    public void setTotal3(int total3) {
        this.total3 = total3;
    }

    public int getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(int timeslot) {
        this.timeslot = timeslot;
    }

}
