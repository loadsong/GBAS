package com.service.core.utils;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//package com.service.core.utils;
//
//import java.math.BigInteger;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//
///**
// * Created by songmeng on 2018/12/10.
// */
public class DateUtils {

    //将标准时间换算成周数以及周内秒
    public Map getIntData(Long date) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String selectData = sdf.format(new Date(Long.parseLong(String.valueOf(date))));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String gpsBegin = "1980-1-6";
        String bdsBegin = "2006-1-1";
        String[] aa = selectData.split(" ");
        String[] bb = aa[1].split(":");
        int hour = Integer.parseInt(bb[0]);
        int min = Integer.parseInt(bb[1]);
        int sec = Integer.parseInt(bb[2]);

        Date gpsBeginDate = format.parse(gpsBegin);
        Date bdsBeginDate = format.parse(bdsBegin);
        Date endDate = format.parse(aa[0]);
        //北斗相隔天数
        int dayBDS = (int) ((endDate.getTime() - bdsBeginDate.getTime()) / (1000 * 3600 * 24));
        //GPS相隔天数
        int dayGPS = (int) ((endDate.getTime() - gpsBeginDate.getTime()) / (1000 * 3600 * 24));

        //GPS的周数以及周内秒
        double b_gps = Math.floor(dayGPS / 7);
        BigInteger b1_gps = new BigInteger(Integer.toString((int) b_gps));
        int gpsweek = Integer.parseInt(b1_gps.toString());
        double gpsroll = Math.floor(b_gps / 1024);
        double gpsdow = (dayGPS) - (gpsweek) * 7;
        int gpstow = (int) ((gpsdow * 24 + hour) * 3600 + (min) * 60 + (sec));
        //BDS的周数以及周内秒
        double b_bds = Math.floor(dayBDS / 7);
        BigInteger b1_bds = new BigInteger(Integer.toString((int) b_bds));
        int bdsweek = Integer.parseInt(b1_bds.toString());
        double bdsroll = Math.floor(b_bds / 1024);
        double bdsdow = (dayBDS) - (bdsweek) * 7;
        int bdstow = (int) ((bdsdow * 24 + hour) * 3600 + (min) * 60 + (sec));
        //保存结果
        Map dataResult = new HashMap();
        dataResult.put("gpsweek", gpsweek);
        dataResult.put("gpsroll", gpsroll);
        dataResult.put("gpsdow", gpsdow);
        dataResult.put("gpstow", (gpstow) * 1000);

        dataResult.put("bdsweek", bdsweek);
        dataResult.put("bdsroll", bdsroll);
        dataResult.put("bdsdow", bdsdow);
        dataResult.put("bdstow", (bdstow) * 1000);
        return dataResult;
    }

    public String ValueChange(String value) {
        switch (value) {
            case "ALM":
                return "ALM";
            case "GBAS_SEQ":
                return "GBAS_SEQ";
            case "BDSNAVDATA":
                return "BDSNAVDATA";
            case "GPSNAVDATA":
                return "GPSNAVDATA";
            case "PROCDATA":
                return "PROCDATA";
            case "RANGEBASE":
                return "RANGEBASE";
            case "RANGEDATA":
                return "RANGEDATA";
            case "TYPE1":
                return "MESSAGETYPE1";
            case "TYPE2":
                return "MESSAGETYPE2";
            case "TYPE4":
                return "MESSAGETYPE4";
            case "PVT":
                return "PVT";
            case "XPL":
                return "XPL";
        }
        return null;

    }
    public int ValueChangeOfint(String value) {
        switch (value) {

            case "GAST-C":
                return 11;
            case "GAST-D":
                return 11;
            case "BDS":
                return 1;
            case "GDS":
                return 2;
            case "Galileo":
                return 3;
        }
        return 00;

    }
    public String ValueChangeOfSys(String value) {
        switch (value) {

            case "BDS":
                return "3,4,5,6,7";
            case "GPS":
                return "1,2,8";
            case "Galileo":
                return "9,10";
        }
        return null;

    }



    public String ValueChangeBymysql(String value) {
        switch (value) {
            case "ALM":
                return "ALM";
            case "GBAS_SEQ":
                return "GBAS_SEQ";
            case "BDSNAVDATA":
                return "BDSNavData";
            case "GPSNAVDATA":
                return "GPSNavData";
            case "PROCDATA":
                return "ProcData";
            case "RANGEBASE":
                return "RangeBase";
            case "RANGEDATA":
                return "RangeData";
            case "TYPE1":
                return "MessageType1";
            case "TYPE2":
                return "MessageType2";
            case "TYPE4":
                return "MessageType4";
            case "PVT":
                return "PVT";
            case "XPL":
                return "XPL";
        }
        return null;

    }
}


