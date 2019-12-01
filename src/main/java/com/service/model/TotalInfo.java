package com.service.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class TotalInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int total;
    private Date currentTime;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getCurrentTime() {
        return currentTime.getTime();
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
