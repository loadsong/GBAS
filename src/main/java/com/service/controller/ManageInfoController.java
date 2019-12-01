package com.service.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.service.core.ret.RetResponse;
import com.service.core.ret.RetResult;
import com.service.core.utils.DateUtils;
import com.service.model.*;
import com.service.sysservice.DataInfoService;
import com.service.sysservice.ManageInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by songmeng on 2019/08/31
 */

@RestController
@RequestMapping("manage")
public class ManageInfoController {

    @Resource
    DataInfoService dataInfoService;
    @Resource
    ManageInfoService manageInfoService;

    //3.1VDB电文（根据电文表）
    @GetMapping("/MTInfo")
    public RetResult MTInfo(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        List MT = new ArrayList();
        List SYS = new ArrayList();

        //有的MT电文没有numOfMeasurements字段

        MT.add("MESSAGETYPE1");
        MT.add("MESSAGETYPE2");
//        MT.add("MESSAGETYPE4");
//        MT.add("MESSAGETYPE11");
        SYS.add("BDS");
        SYS.add("GPS");
        SYS.add("Galileo");

        JSONObject resp = new JSONObject();
        JSONObject GASTDObject = new JSONObject();
        for (int j = 0; j < SYS.size(); j++) {
            //循环获取系统进行外层嵌套
            JSONObject SYSObject = new JSONObject();

            for (int i = 0; i < MT.size(); i++) {
                //循环获取电文表的数据并put到系统json里
                List MtList = manageInfoService.MTInfo(starttime, endtime, new DateUtils().ValueChangeOfSys(SYS.get(j).toString()), MT.get(i).toString());

//                //获取电文表的信号频点统计
//                if (MT.get(i).toString().equals("MESSAGETYPE1") || MT.get(i).toString().equals("MESSAGETYPE11")) {
//                    List MtByfreqList = manageInfoService.MTInfoByfreq(starttime, endtime, new DateUtils().ValueChangeOfSys(SYS.get(j).toString()), MT.get(i).toString());
//                    MtList.add(MtByfreqList);
//                }

                SYSObject.put(MT.get(i).toString(), MtList);
            }
            resp.put(SYS.get(j).toString(), SYSObject);
        }

        return RetResponse.makeOKRsp(resp);
    }

    //各系统各电文随时间的变化趋势
    @GetMapping("/MTInfoByTime")
    public RetResult MTInfoByTime(@RequestParam(required = false, defaultValue = "0") String freqSigID, @RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        List MT = new ArrayList();
        List SYS = new ArrayList();

        //有的MT电文没有numOfMeasurements字段

        MT.add("MESSAGETYPE1");
        MT.add("MESSAGETYPE2");
        MT.add("MESSAGETYPE4");
        MT.add("MESSAGETYPE11");


        JSONObject resp = new JSONObject();

        for (int i = 0; i < MT.size(); i++) {
            //循环获取电文表的数据并put到系统json里
            List MtList = manageInfoService.MTInfoByTime(starttime, endtime, freqSigID, MT.get(i).toString());

//                //获取电文表的信号频点统计
//                if (MT.get(i).toString().equals("MESSAGETYPE1") || MT.get(i).toString().equals("MESSAGETYPE11")) {
//                    List MtByfreqList = manageInfoService.MTInfoByfreq(starttime, endtime, new DateUtils().ValueChangeOfSys(SYS.get(j).toString()), MT.get(i).toString());
//                    MtList.add(MtByfreqList);
//                }

            resp.put(MT.get(i).toString(), MtList);
        }


        return RetResponse.makeOKRsp(resp);
    }

    @GetMapping("/MTInfoByCurrentTime")
    public RetResult MTInfoByCurrentTime(@RequestParam(required = true, defaultValue = "0") String freqSigID, @RequestParam(required = true, defaultValue = "0") Long currenttime, @RequestParam(required = true, defaultValue = "0") String messagetype) throws Exception {
        JSONObject resp = new JSONObject();
        List MtListBycurrentTime = manageInfoService.MTInfoBycurrentTime(freqSigID, messagetype, currenttime);
        resp.put("MTInfoByCurrentTime", MtListBycurrentTime);
        return RetResponse.makeOKRsp(resp);

    }

    //3.2信号强度（根据VDBINFO表）
    @GetMapping("/vdbInfo")
    public RetResult vdbInfo(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        List VDBINFOList = manageInfoService.vdbInfo(starttime, endtime);

        JSONObject resp = new JSONObject();
        resp.put("vdbinfo", VDBINFOList);
        //math求值
        List VdbInfoMathList = manageInfoService.vdbInfoByMath(starttime, endtime);
        resp.put("math", VdbInfoMathList);
        return RetResponse.makeOKRsp(resp);
    }

    //3.3伪距差分精度（根据SATINFO表）
    @GetMapping("/satInfoByElevation")
    public RetResult satInfoByElevation(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime, @RequestParam(required = false, defaultValue = "0") String freqSigID, @RequestParam(required = false, defaultValue = "0") String recTypeID, @RequestParam(required = false, defaultValue = "0") String recID) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        JSONObject data = new JSONObject();
        //Y轴的值
        List SATINFOList = manageInfoService.satInfoByElevation(starttime, endtime, freqSigID, recTypeID, recID);
        //求仰角的平均值，标准差，样本数；
        //TODO:后续加上配置化

        List average = new ArrayList();
        List numList = new ArrayList();
        List standardList = new ArrayList();
        JSONArray a = JSONArray.parseArray(JSON.toJSONString(SATINFOList));
        int time = 360 / 20;//后续加上配置化

        for (int i = 0; i < time; i++) {
            double sum = 0;
            int num = 0;
            for (int j = 0; j < SATINFOList.size(); j++) {
                if (i * 20 <= JSONObject.parseObject(a.get(j).toString()).getDouble("elevation") && JSONObject.parseObject(a.get(j).toString()).getDouble("elevation") < (i + 1) * 20) {
                    sum = sum + JSONObject.parseObject(a.get(j).toString()).getDouble("elevation");
                    num++;
                }
            }
            double arg;
            if (num == 0) {
                arg = 0;

            } else {
                arg = sum / num;
            }
            //求平均值
            average.add(arg);
            //样本数
            numList.add(num);
            //标准差
            int total = 0;
            for (int k = 0; k < SATINFOList.size(); k++) {
                if (i * 20 <= JSONObject.parseObject(a.get(k).toString()).getDouble("elevation") && JSONObject.parseObject(a.get(k).toString()).getDouble("elevation") < (i + 1) * 20) {
                    total += (JSONObject.parseObject(a.get(k).toString()).getDouble("elevation") - arg) * (JSONObject.parseObject(a.get(k).toString()).getDouble("elevation") - arg);
                }
            }
            if (num == 0) {
                double standardDeviation = 0;
                standardList.add(standardDeviation);

            } else {
                double standardDeviation = Math.sqrt(total / num);   //求出标准差
                standardList.add(standardDeviation);

            }

        }

        data.put("average", average);
        data.put("division", 20);
        data.put("num", numList);
        data.put("standardDeviation", standardList);

        resp.put("satinfo", SATINFOList);
        resp.put("mathinfo", data);
        return RetResponse.makeOKRsp(resp);
    }

    @GetMapping("/satInfoByTime")
    public RetResult satInfoByTime(@RequestParam(required = false, defaultValue = "0") String freqSigID, @RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        //返回数据
        List SatInfoList = manageInfoService.satInfoByTime(starttime, endtime, freqSigID);
        //3倍数据
//        List SatInfoTrebleList = manageInfoService.satInfoByTreble(starttime, endtime);
        //math求值
        List SatInfoMathList = manageInfoService.satInfoByTimeMath(starttime, endtime, freqSigID);
        resp.put("satinfo", SatInfoList);
        resp.put("satinfomath", SatInfoMathList);
//        resp.put("satinfotreble", SatInfoTrebleList);
        return RetResponse.makeOKRsp(resp);

    }

    @GetMapping("/satInfoBytrebleOver")
    public RetResult satInfoBytrebleOver(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        //3倍数据
        List sigma_pr_gnd = manageInfoService.satInfoByTreble(starttime, endtime);
        List sigma_pr_gnd_D = manageInfoService.satInfoByTrebleD(starttime, endtime);
        List sigma_pr_gnd_30 = manageInfoService.satInfoByTreble30(starttime, endtime);
        resp.put("sigma_pr_gnd", sigma_pr_gnd);
        resp.put("sigma_pr_gnd_D", sigma_pr_gnd_D);
        resp.put("sigma_pr_gnd_30", sigma_pr_gnd_30);
        return RetResponse.makeOKRsp(resp);

    }


    //3.4完好性监测（根据APRDEV表）
    @GetMapping("/aprdevInfo")
    public RetResult aprdevInfo(@RequestParam(required = false, defaultValue = "0") String freqSigID, @RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        JSONObject GASTCObject = new JSONObject();
        JSONObject GASTDObject = new JSONObject();
        int GASTC = new DateUtils().ValueChangeOfint("GAST-C");
        int GASTD = new DateUtils().ValueChangeOfint("GAST-D");
        int BDS = new DateUtils().ValueChangeOfint("BDS");
        int GDS = new DateUtils().ValueChangeOfint("GDS");
        int Galileo = new DateUtils().ValueChangeOfint("Galileo");
        List<AprdevInfo> GASTCList = manageInfoService.aprdevInfo(starttime, endtime, GASTC, freqSigID);
//        List GASTCGDSList = manageInfoService.aprdevInfo(starttime, endtime, GASTC, GDS);
//        List GASTCGalileoList = manageInfoService.aprdevInfo(starttime, endtime, GASTC, Galileo);
        List<AprdevInfo> GASTDList = manageInfoService.aprdevInfo(starttime, endtime, GASTD, freqSigID);
//        List GASTDGDSList = manageInfoService.aprdevInfo(starttime, endtime, GASTD, GDS);
//        List GASTDGalileoList = manageInfoService.aprdevInfo(starttime, endtime, GASTD, Galileo);
        //math求值
        List AprdevInfoMathList = manageInfoService.aprdevInfoByMath(starttime, endtime);
//        GASTCObject.put("BDS", GASTCBDSList);
//        GASTCObject.put("GDS", GASTCGDSList);
//        GASTCObject.put("Galileo", GASTCGalileoList);
//        GASTDObject.put("BDS", GASTDBDSList);
//        GASTDObject.put("GDS", GASTDGDSList);
//        GASTDObject.put("Galileo", GASTDGalileoList);

        resp.put("GASTC", GASTCList);
        resp.put("GASTD", GASTDList);
        resp.put("MATH", AprdevInfoMathList);
        return RetResponse.makeOKRsp(resp);
    }

    @GetMapping("/aprdevInfoByOver")
    public RetResult aprdevInfoByOver(@RequestParam(required = false, defaultValue = "0") int freqSigID, @RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        //over数据
        List OverlalList = manageInfoService.aprdevInfoByOverlal(starttime, endtime);
        List OvervalList = manageInfoService.aprdevInfoByOverval(starttime, endtime);
        resp.put("overlal", OverlalList);
        resp.put("overval", OvervalList);
        return RetResponse.makeOKRsp(resp);

    }

    //3.5差分定位精度（根据PVT表）
    //关于误差，，可 先全量获取，然后循环list<model>获取字段值进行计算误差然后组装成list输出
    @GetMapping("/PvtInfo")
    public RetResult PvtInfo(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime, @RequestParam(required = false, defaultValue = "0") String freqSigID, @RequestParam(required = false, defaultValue = "0") String posMode, @RequestParam(required = false, defaultValue = "0") String BaseposMode) throws Exception {
        JSONObject resp = new JSONObject();
        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        //经纬高原数据
        List<PvtInfo> PvtInfo = manageInfoService.PvtInfo(starttime, endtime, freqSigID, posMode);
        //math
        List<SatInfoByMath> PvtMathH = manageInfoService.PvtInfoByMathH(starttime, endtime, freqSigID, posMode);
        List<SatInfoByMath> PvtMathLC = manageInfoService.PvtInfoByMathLC(starttime, endtime, freqSigID, posMode);
        List<SatInfoByMath> PvtMathPC = manageInfoService.PvtInfoByMathPC(starttime, endtime, freqSigID, posMode);
        //基准源数据
        List<PvtInfo> baseresp = manageInfoService.PvtInfo(starttime, endtime, freqSigID, BaseposMode);
        //误差数据,双层循环进行diff
        Map map = new HashMap();
//        for (int i = 0; i < resp.size(); i++) {
//            for (int j = 0; j < baseresp.size(); j++) {
//                if (resp.get(i).getCurrentTime().equals(baseresp.get(j).getCurrentTime())) {
//                    double difflambda = resp.get(i).getLambda_c() - baseresp.get(j).getLambda_c();
//                    double diffheight = resp.get(i).getEllHeight() - baseresp.get(j).getEllHeight();
//                    double diffphi = resp.get(i).getPhi_c() - baseresp.get(j).getPhi_c();
//                    //TODO:这里需要继续做一下
//                }
//            }
//        }

        List diffresp = manageInfoService.PvtInfo(starttime, endtime, freqSigID, posMode);


        resp.put("PvtInfo", PvtInfo);
        resp.put("PvtMathH", PvtMathH);
        resp.put("PvtMathLC", PvtMathLC);
        resp.put("PvtMathPC", PvtMathPC);

        return RetResponse.makeOKRsp(resp);
    }


    //3.6系统首页（根据SATINFO、SYSINFO表）
    @GetMapping("/TBDInfoByFreqSigID")
    public RetResult TBDInfoByFreqSigID(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime, @RequestParam(required = false, defaultValue = "0") String freqSigID) throws Exception {
        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        List TBDObject = new ArrayList();
        List<SatInfo> DataList = manageInfoService.TBDInfoByFreqSigID(starttime, endtime, freqSigID);
//循环获取卫星状态,每个系统的卫星数是不一样的
//        for (int j = 0; j < DataList.size(); j++) {
//            TBDObject.add(DataList.get(j).getSatid());
//        }
//        resp.put("TBD", TBDObject);
        resp.put("satinfo", DataList);
        return RetResponse.makeOKRsp(resp);
    }

    //GNSS接收机
    @GetMapping("/TBDInfoByGNSS")
    public RetResult TBDInfoByGNSS(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {
        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        //TODO:默认等分间隔为30次，求间隔count秒，后续加上配置化
        Long count = (endtime - starttime) / 30;
        JSONObject resp = new JSONObject();
        JSONObject countresp = new JSONObject();
        LinkedHashMap map = new LinkedHashMap();
        List<TotalInfo> DataList = manageInfoService.TBDInfoByGNSS(starttime, endtime);
//时间段数据判断落地
        for (int i = 0; i < 30; i++) {
            int totalcount = 0;
            for (int j = 0; j < DataList.size(); j++) {
                if (DataList.get(j).getCurrentTime() >= starttime && DataList.get(j).getCurrentTime() < starttime + count) {
                    totalcount = totalcount + 1;
                }

            }
            map.put(starttime, totalcount);
            starttime = starttime + count;
        }
//循环获取卫星状态,每个系统的卫星数是不一样的
//        for (int j = 0; j < DataList.size(); j++) {
//            TBDObject.add(DataList.get(j).getSatid());
//        }
        String str = JSONObject.toJSONString(map);
        JSONObject json = JSONObject.parseObject(str);
        resp.put("GNSS", json);

        return RetResponse.makeOKRsp(resp);
    }

    //VDB接收机
    @GetMapping("/TBDInfoByVDB")
    public RetResult TBDInfoByVDB(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {
        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }

        //TODO:默认等分间隔为30次，求间隔count秒，后续加上配置化
        Long count = (endtime - starttime) / 30;
        JSONObject resp = new JSONObject();
        LinkedHashMap map = new LinkedHashMap();
        List<TotalInfo> DataList = manageInfoService.TBDInfoByVDB(starttime, endtime);
//时间段数据判断落地
        for (int i = 0; i < 30; i++) {
            int totalcount = 0;
            for (int j = 0; j < DataList.size(); j++) {
                if (DataList.get(j).getCurrentTime() >= starttime && DataList.get(j).getCurrentTime() < starttime + count) {
                    totalcount = totalcount + 1;
                }

            }
            map.put(starttime, totalcount);
            starttime = starttime + count;
        }
//循环获取卫星状态,每个系统的卫星数是不一样的
//        for (int j = 0; j < DataList.size(); j++) {
//            TBDObject.add(DataList.get(j).getSatid());
//        }
//        JSONObject json = new JSONObject(map);
        String str = JSON.toJSONString(map);
        JSONObject json = JSONObject.parseObject(str);
        resp.put("VDB", json);
        return RetResponse.makeOKRsp(resp);
    }

    //测试评估处理机工况
    @GetMapping("/TestRecInfo")
    public RetResult TestRecInfo(@RequestParam(required = false, defaultValue = "0") Long starttime, @RequestParam(required = false, defaultValue = "0") Long endtime) throws Exception {

        //默认展示当前一周内数据
        if (starttime == 0 && endtime == 0) {
            endtime = new Date().getTime();
            starttime = endtime - 7 * 24 * 3600 * 1000;
        }
        JSONObject resp = new JSONObject();
        //over数据
        List TestList = manageInfoService.TestRecInfo(starttime, endtime);
        resp.put("testrecinfo", TestList);
        return RetResponse.makeOKRsp(resp);

    }


    //3.7配置管理（根据CONFIG表）
    //查看
    @GetMapping("/configInfo")
    public RetResult<PageInfo> configInfo(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "20") int size) throws Exception {
        PageInfo<List> dataInfoList = manageInfoService.configInfo(page, size);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //编辑
    @GetMapping("/configUpdate")
    public RetResult configUpdate(@RequestParam String paramname, @RequestParam String paramvalue, @RequestParam String paramnote, @RequestParam Long seqid) throws Exception {
        Object resp = manageInfoService.configUpdate(seqid, paramname, paramvalue, paramnote);
        return RetResponse.makeOKRsp(resp);
    }

    //新增
    @GetMapping("/configAdd")
    public RetResult configAdd(@RequestParam String paramname, @RequestParam String paramvalue, @RequestParam String paramnote) throws Exception {
        Object resp = manageInfoService.configAdd(paramname, paramvalue, paramnote);
        return RetResponse.makeOKRsp(resp);
    }
    //启用


//    //    AVAILABILITY
//
//    @GetMapping("/availabilitySearch")
//    public RetResult<List> availabilitySearch(@RequestParam int city, @RequestParam Long starttime, @RequestParam Long endtime) throws Exception {
//        List availabilitySearch = dataInfoService.availabilitySearch(city, starttime, endtime);
//        return RetResponse.makeOKRsp(availabilitySearch);
//    }

}
