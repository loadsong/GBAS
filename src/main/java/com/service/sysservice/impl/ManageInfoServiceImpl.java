package com.service.sysservice.impl;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.core.universal.AbstractService;
import com.service.core.utils.DateUtils;
import com.service.dao.db1.DataInfoMapper;
import com.service.dao.db1.ManageInfoMapper;
import com.service.dao.db2.DataInfoV2Mapper;
import com.service.model.*;
import com.service.sysservice.DataInfoService;
import com.service.sysservice.ManageInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * songmeng
 * 这是接口实现的类，主要是根据入参进行处理的逻辑
 */
@Service
public class ManageInfoServiceImpl extends AbstractService<UserInfo> implements ManageInfoService {

    @Value("${datasource.choose}")
    private int choose;

    private static final Logger logger = LoggerFactory.getLogger(ManageInfoServiceImpl.class);

    @Resource
    private DataInfoMapper dataInfoMapper;
    @Resource
    private ManageInfoMapper manageInfoMapper;


    //3.1VDB电文（根据电文表）
    @Override
    public List MTInfo(Long starttimestramp, Long endtimestramp, String SYS, String MT) throws Exception {

        //TODO:还缺少一种系统的周内秒和周没有加，是否可以复用上面2个系统参数值

        //周数和周内秒
        Map start = new DateUtils().getIntData(starttimestramp);
        Map end = new DateUtils().getIntData(endtimestramp);
        int gpsstartweek = (int) start.get("gpsweek");
        int gpsstarttow = (int) start.get("gpstow");
        int bdsstartweek = (int) start.get("bdsweek");
        int bdsstarttow = (int) start.get("bdstow");
        int gpsendweek = (int) end.get("gpsweek");
        int gpsendtow = (int) end.get("gpstow");
        int bdsendweek = (int) end.get("bdsweek");
        int bdsendtow = (int) end.get("bdstow");

        logger.info("GPS开始周数：" + gpsstartweek + "结束周数：" + gpsendweek + "开始周内秒:" + gpsstarttow + "结束周内秒：" + gpsendtow);
        logger.info("BDS开始周数：" + bdsstartweek + "结束周数：" + bdsendweek + "开始周内秒:" + bdsstarttow + "结束周内秒：" + bdsendtow);

        List resp = new ArrayList();
        JSONObject map = new JSONObject();
        logger.info("获取oracle数据源成功");
        //0、获取预计接收总数
        double totalpre;
        List<ConfigInfo2> ConfigInfo = manageInfoMapper.MTInfoByPre1();
        List<ConfigInfo2> ConfigInfo2 = manageInfoMapper.MTInfoByPre2();
        List<ConfigInfo2> ConfigInfo4 = manageInfoMapper.MTInfoByPre4();
        List<ConfigInfo2> ConfigInfo11 = manageInfoMapper.MTInfoByPre11();
        ConfigInfo.addAll(ConfigInfo2);
        ConfigInfo.addAll(ConfigInfo4);
        ConfigInfo.addAll(ConfigInfo11);

        switch (MT) {
            case "MESSAGETYPE1":
                totalpre = (endtimestramp - starttimestramp) / (Double.valueOf(ConfigInfo.get(0).getMT1TINT()) * 1000);
                List freSigDescrip1 = this.MTInfoByfreq(starttimestramp, endtimestramp, SYS, MT);
                map.put("totalpre", totalpre);
                map.put("freSigDescrip", freSigDescrip1);

                break;
            case "MESSAGETYPE2":
                totalpre = (endtimestramp - starttimestramp) / (Double.valueOf(ConfigInfo.get(1).getMT2TINT()) * 1000);
                map.put("totalpre", totalpre);

                break;
            case "MESSAGETYPE4":
                totalpre = (endtimestramp - starttimestramp) / (Double.valueOf(ConfigInfo.get(2).getMT4TINT()) * 1000);
                map.put("totalpre", totalpre);

                break;
            case "MESSAGETYPE11":
                totalpre = (endtimestramp - starttimestramp) / (Double.valueOf(ConfigInfo.get(3).getMT11TINT()) * 1000);
                List freSigDescrip11 = this.MTInfoByfreq(starttimestramp, endtimestramp, SYS, MT);
                map.put("totalpre", totalpre);
                map.put("freSigDescrip", freSigDescrip11);
                break;

        }
        //1、获取实际接收总数
        List<MTInfo> totalreality = manageInfoMapper.MTInfoByReality(SYS, MT, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
        List<MTInfo> totalpathreality = manageInfoMapper.MTInfoByRealityPath(SYS, MT, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
        //2、获取错误电文总数
        List<MTInfo> errormt = manageInfoMapper.MTInfoByError(SYS, MT, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
        // 3、获取占用间隙总数
        List<MTInfo> timeslot = manageInfoMapper.MTInfoByTimeSlot(SYS, MT, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
        int realitycount = 0;
        int errorcount = 0;
        if (totalreality.size() != 0) {
            if (totalpathreality.size() != 0) {
                realitycount = totalreality.get(0).getTotal() + totalpathreality.get(0).getTotal2() - totalpathreality.get(0).getTotal3();

            } else {
                realitycount = totalreality.get(0).getTotal();

            }

        }
        if (errormt.size() != 0) {
            errorcount = errormt.get(0).getTotal();

        }
        map.put("realitycount", realitycount);
        map.put("errorcount", errorcount);
        map.put("timeslot", timeslot);
        resp.add(map);
        return resp;
    }

    @Override
    public List MTInfoByTime(Long starttimestramp, Long endtimestramp, String SYS, String MT) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));
        logger.info("获取oracle数据源成功");
//        switch (MT) {
//            case ("MESSAGETYPE1"):
        List<MessagetypeAll> resp = manageInfoMapper.MTInfoByTime(starttime, endtime, SYS, MT);
//                List<MTInfo> totalreality = manageInfoMapper.MTInfoByTimeReality(SYS, MT,resp.get());

        //将返回值过滤掉重复时间值数据
        Set set = new HashSet();
        List<MessagetypeAll> newList = new ArrayList();
        for (MessagetypeAll cd : resp) {
            if (set.add(cd.getCurrenttime())) {
                newList.add(cd);
            }
        }
        List respList = new ArrayList();
        //根据时间值获取对应的实际接收总数
        for (MessagetypeAll ms : newList) {

            //获取实际接收总数
            List<MTInfo> totalreality = manageInfoMapper.MTInfoByTimeReality(SYS, MT, ms.getCurrenttime());
            List<MTInfo> totalpathreality = manageInfoMapper.MTInfoByTimeRealityPath(SYS, MT, ms.getCurrenttime());
            JSONObject map = new JSONObject();
            int realitycount = 0;
            if (totalreality.size() != 0) {
                if (totalpathreality.size() != 0) {
                    realitycount = totalreality.get(0).getTotal() + totalpathreality.get(0).getTotal2() - totalpathreality.get(0).getTotal3();

                } else {
                    realitycount = totalreality.get(0).getTotal();

                }

            }
            map.put("realitycount", realitycount);
            map.put("currentTime", ms.getCurrenttime());
            respList.add(map);
        }

        return respList;
//        }

    }

    @Override
    public List MTInfoByfreq(Long starttimestramp, Long endtimestramp, String SYS, String MT) throws Exception {

        //周数和周内秒
        Map start = new DateUtils().getIntData(starttimestramp);
        Map end = new DateUtils().getIntData(endtimestramp);
        int gpsstartweek = (int) start.get("gpsweek");
        int gpsstarttow = (int) start.get("gpstow");
        int bdsstartweek = (int) start.get("bdsweek");
        int bdsstarttow = (int) start.get("bdstow");
        int gpsendweek = (int) end.get("gpsweek");
        int gpsendtow = (int) end.get("gpstow");
        int bdsendweek = (int) end.get("bdsweek");
        int bdsendtow = (int) end.get("bdstow");

        logger.info("GPS开始周数：" + gpsstartweek + "结束周数：" + gpsendweek + "开始周内秒:" + gpsstarttow + "结束周内秒：" + gpsendtow);
        logger.info("BDS开始周数：" + bdsstartweek + "结束周数：" + bdsendweek + "开始周内秒:" + bdsstarttow + "结束周内秒：" + bdsendtow);


        List resp = new ArrayList();
        JSONObject map = new JSONObject();
        logger.info("获取oracle数据源成功");
        //获取信号频点
        List<MTInfo2> totalfreq = manageInfoMapper.MTInfoByFreq(SYS, MT, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
//        map.put("freSigDescrip", totalfreq);
//        resp.add(totalfreq);
        return totalfreq;
    }

    @Override
    public List MTInfoBycurrentTime(String freqSigID, String messagetype, Long currenttime) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String current = sdf.format(new Date(currenttime));

        logger.info("获取oracle数据源成功");
        switch (messagetype) {
            case "messageType1":
                List<Message1> resp1 = manageInfoMapper.MTInfoBycurrentTime1(freqSigID, messagetype, current);
                return resp1;
            case "messageType2":
                List<Message2> resp2 = manageInfoMapper.MTInfoBycurrentTime2(freqSigID, messagetype, current);
                return resp2;
            case "messageType4":
                List<Message4> resp4 = manageInfoMapper.MTInfoBycurrentTime4(freqSigID, messagetype, current);
                return resp4;
            case "messageType11":
                List<Message11> resp11 = manageInfoMapper.MTInfoBycurrentTime11(freqSigID, messagetype, current);
                return resp11;
        }
        return null;

    }

    //3.2信号强度（根据VDBINFO表）
    @Override
    public List vdbInfo(Long starttimestramp, Long endtimestramp) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<VdbInfo> resp = manageInfoMapper.vdbInfo(starttime, endtime);
        return resp;
    }

    @Override
    public List vdbInfoByMath(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.vdbInfoByMath(starttime, endtime);
        return resp;
    }

    //3.3伪距差分精度（根据SATINFO表）
    @Override
    public List satInfoByElevation(Long starttimestramp, Long endtimestramp, String freqSigID, String recTypeID, String recID) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));
        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.satInfoByElevation(starttime, endtime, freqSigID, recTypeID, recID);
        return resp;

    }

    @Override
    public List satInfoByTime(Long starttimestramp, Long endtimestramp, String freqSigID) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.satInfoByTime(starttime, endtime, freqSigID);
        return resp;
    }

    @Override
    public List satInfoByTimeMath(Long starttimestramp, Long endtimestramp, String freqSigID) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.satInfoByTimeMath(starttime, endtime, freqSigID);
        return resp;
    }

    @Override
    public List satInfoByTreble(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.satInfoByTreble(starttime, endtime);
        return resp;
    }

    @Override
    public List satInfoByTrebleD(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.satInfoByTrebleD(starttime, endtime);
        return resp;
    }

    @Override
    public List satInfoByTreble30(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.satInfoByTreble30(starttime, endtime);
        return resp;
    }

    // 3.4完好性监测（根据APRDEV表）
    @Override
    public List aprdevInfo(Long starttimestramp, Long endtimestramp, int posMode, String freqSigID) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<AprdevInfo> resp = manageInfoMapper.aprdevInfo(starttime, endtime, posMode, freqSigID);
        return resp;

    }

    @Override
    public List aprdevInfoByMath(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.aprdevInfoByMath(starttime, endtime);
        return resp;

    }

    @Override
    public List aprdevInfoByOverlal(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<AprdevInfo> resp = manageInfoMapper.aprdevInfoByOverlal(starttime, endtime);
        return resp;

    }

    @Override
    public List aprdevInfoByOverval(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<AprdevInfo> resp = manageInfoMapper.aprdevInfoByOverval(starttime, endtime);
        return resp;

    }

    //3.5差分定位精度（根据PVT表）
    @Override
    public List<PvtInfo> PvtInfo(Long starttimestramp, Long endtimestramp, String freqSigID, String posMode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<PvtInfo> resp = manageInfoMapper.PvtInfo(starttime, endtime, freqSigID, posMode);
        return resp;

    }

    //math
    @Override
    public List<SatInfoByMath> PvtInfoByMathH(Long starttimestramp, Long endtimestramp, String freqSigID, String posMode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.PvtInfoByMathH(starttime, endtime, freqSigID, posMode);
        return resp;

    }

    @Override
    public List<SatInfoByMath> PvtInfoByMathLC(Long starttimestramp, Long endtimestramp, String freqSigID, String posMode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.PvtInfoByMathLC(starttime, endtime, freqSigID, posMode);
        return resp;

    }

    @Override
    public List<SatInfoByMath> PvtInfoByMathPC(Long starttimestramp, Long endtimestramp, String freqSigID, String posMode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfoByMath> resp = manageInfoMapper.PvtInfoByMathPC(starttime, endtime, freqSigID, posMode);
        return resp;

    }

    //3.6系统首页（根据SATINFO、SYSINFO表）
    @Override
    public List TBDInfoByFreqSigID(Long starttimestramp, Long endtimestramp, String freqSigID) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<SatInfo> resp = manageInfoMapper.TBDInfoByFreqSigID(starttime, endtime, freqSigID);
        return resp;
    }

    @Override
    public List TBDInfoByGNSS(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<TotalInfo> resp = manageInfoMapper.TBDInfoByGNSS(starttime, endtime);
        return resp;
    }

    @Override
    public List TBDInfoByVDB(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List<TotalInfo> resp = manageInfoMapper.TBDInfoByVDB(starttime, endtime);
        return resp;
    }

    @Override
    public List TestRecInfo(Long starttimestramp, Long endtimestramp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        logger.info("获取oracle数据源成功");
        List resp = manageInfoMapper.TestRecInfo(starttime, endtime);
        return resp;
    }

    //3.7配置管理（根据CONFIG表）
    //查看
    @Override
    public PageInfo configInfo(int page, int size) throws Exception {

        logger.info("获取oracle数据源成功");
        PageHelper.startPage(page, size);
        List<ConfigInfo> config = manageInfoMapper.configManage();

        PageInfo<ConfigInfo> configInfo = new PageInfo<>(config);
        return configInfo;
    }

    //编辑
    @Override
    public Object configUpdate(Long seqid, String paramname, String paramvalue, String paramnote) throws Exception {
        logger.info("获取oracle数据源成功");
        Object resp = manageInfoMapper.configUpdate(seqid, paramname, paramvalue, paramnote);
        return resp;

    }

    @Override
    public Object configAdd(String paramname, String paramvalue, String paramnote) throws Exception {
        logger.info("获取oracle数据源成功");
        Object resp = manageInfoMapper.configAdd(paramname, paramvalue, paramnote);
        return resp;


    }
}