package com.service.sysservice.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.core.universal.AbstractService;
import com.service.core.utils.DateUtils;
import com.service.dao.db1.DataInfoMapper;
import com.service.dao.db2.DataInfoV2Mapper;
import com.service.model.*;
import com.service.sysservice.DataInfoService;
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
public class DataInfoServiceImpl extends AbstractService<UserInfo> implements DataInfoService {

    @Value("${datasource.choose}")
    private int choose;

    private static final Logger logger = LoggerFactory.getLogger(DataInfoServiceImpl.class);

    @Resource
    private DataInfoMapper dataInfoMapper;

    @Resource
    private DataInfoV2Mapper dataInfoV2Mapper;

    //已废弃
    public List<DataInfo> tableAll() {
        List<DataInfo> tableInfoList = dataInfoMapper.tableAll();
        return tableInfoList;

    }

    //提供给前端每个表中的字段名
    @Override
    public List<FieldInfo> fieldAll(String tablename) {
        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            List<FieldInfo> fieldInfoList = dataInfoMapper.fieldAll(new DateUtils().ValueChange(tablename));
            return fieldInfoList;
        } else {
            logger.info("获取mysql数据源成功");
            List<FieldInfo> fieldInfoList = dataInfoV2Mapper.fieldAll(new DateUtils().ValueChangeBymysql(tablename));
            return fieldInfoList;
        }

    }

    //已废弃
    public List<FlagInfo> flagAll() {
        List<FlagInfo> flagInfoList = dataInfoMapper.flagAll();
        return flagInfoList;

    }

    //    查询历史数据和电文数据的具体业务逻辑
    public PageInfo dataSearch(int city, String table, Long starttime, Long endtime, int page, int size) throws Exception {

        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
        String GBASID;
        if (city == 1) {
            GBASID = "BELL";
        } else {
            GBASID = "ZSDY";
        }
        //周数和周内秒
        Map start = new DateUtils().getIntData(starttime);
        Map end = new DateUtils().getIntData(endtime);
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

        //根据入参表名分别请求表数据
        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            switch (table) {

                case "ALM":
                    PageHelper.startPage(page, size);
                    List<Alm> ALM = dataInfoMapper.dataSearchByALM(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Alm> Alm = new PageInfo<>(ALM);
                    return Alm;
                //废弃
                case "GBAS_SEQ":
                    PageHelper.startPage(page, size);
                    List<GbasSeq> GBAS_SEQ = dataInfoMapper.dataSearchBySEQ(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<GbasSeq> GbasSeq = new PageInfo<>(GBAS_SEQ);
                    return GbasSeq;

                case "BDSNAVDATA":
                    PageHelper.startPage(page, size);
                    List<Bdsnavdata> BDSNAVDATA = dataInfoMapper.dataSearchByBdsnavdata(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Bdsnavdata> Bdsnavdata = new PageInfo<>(BDSNAVDATA);
                    return Bdsnavdata;
                case "GPSNAVDATA":
                    PageHelper.startPage(page, size);
                    List<Gpsnavdata> GPSNAVDATA = dataInfoMapper.dataSearchByGPSnavData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Gpsnavdata> Gpsnavdata = new PageInfo<>(GPSNAVDATA);
                    return Gpsnavdata;
                case "PROCDATA":
                    PageHelper.startPage(page, size);
                    List<Procdata> PROCDATA = dataInfoMapper.dataSearchByProcData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Procdata> Procdata = new PageInfo<>(PROCDATA);
                    return Procdata;
                case "RANGEBASE":
                    PageHelper.startPage(page, size);
                    List<Rangebase> RANGEBASE = dataInfoMapper.dataSearchByRangeBase(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    PageInfo<Rangebase> Rangebase = new PageInfo<>(RANGEBASE);
                    return Rangebase;
                case "RANGEDATA":
                    PageHelper.startPage(page, size);
                    List<Rangedata> RANGEDATA = dataInfoMapper.dataSearchByRangeData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Rangedata> Rangedata = new PageInfo<>(RANGEDATA);
                    return Rangedata;
////1.2.4 sql 确认
                case "TYPE1":
                    PageHelper.startPage(page, size);
                    List<Messagetype1> TYPE1 = dataInfoMapper.dataSearchByType1(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype1> Messagetype1 = new PageInfo<>(TYPE1);
                    return Messagetype1;
                case "TYPE2":
                    PageHelper.startPage(page, size);
                    List<Messagetype2> TYPE2 = dataInfoMapper.dataSearchByType2(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype2> Messagetype2 = new PageInfo<>(TYPE2);
                    return Messagetype2;
                case "TYPE4":
                    PageHelper.startPage(page, size);
                    List<Messagetype4> TYPE4 = dataInfoMapper.dataSearchByType4(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype4> Messagetype4 = new PageInfo<>(TYPE4);
                    return Messagetype4;
                case "PVT":
                    PageHelper.startPage(page, size);
                    List<Pvt> PVT = dataInfoMapper.dataSearchByPvt(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Pvt> Pvt = new PageInfo<>(PVT);
                    return Pvt;
            }
        } else {
            logger.info("获取mysql数据源成功");
            switch (table) {

                case "ALM":
                    PageHelper.startPage(page, size);
                    List<Alm> ALM = dataInfoV2Mapper.dataSearchByALM(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Alm> Alm = new PageInfo<>(ALM);
                    return Alm;
                //废弃
                case "GBAS_SEQ":
                    PageHelper.startPage(page, size);
                    List<GbasSeq> GBAS_SEQ = dataInfoV2Mapper.dataSearchBySEQ(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<GbasSeq> GbasSeq = new PageInfo<>(GBAS_SEQ);
                    return GbasSeq;

                case "BDSNAVDATA":
                    PageHelper.startPage(page, size);
                    List<Bdsnavdata> BDSNAVDATA = dataInfoV2Mapper.dataSearchByBdsnavdata(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Bdsnavdata> Bdsnavdata = new PageInfo<>(BDSNAVDATA);
                    return Bdsnavdata;
                case "GPSNAVDATA":
                    PageHelper.startPage(page, size);
                    List<Gpsnavdata> GPSNAVDATA = dataInfoV2Mapper.dataSearchByGPSnavData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Gpsnavdata> Gpsnavdata = new PageInfo<>(GPSNAVDATA);
                    return Gpsnavdata;
                case "PROCDATA":
                    PageHelper.startPage(page, size);
                    List<Procdata> PROCDATA = dataInfoV2Mapper.dataSearchByProcData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Procdata> Procdata = new PageInfo<>(PROCDATA);
                    return Procdata;
                case "RANGEBASE":
                    PageHelper.startPage(page, size);
                    List<Rangebase> RANGEBASE = dataInfoV2Mapper.dataSearchByRangeBase(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    PageInfo<Rangebase> Rangebase = new PageInfo<>(RANGEBASE);
                    return Rangebase;
                case "RANGEDATA":
                    PageHelper.startPage(page, size);
                    List<Rangedata> RANGEDATA = dataInfoV2Mapper.dataSearchByRangeData(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Rangedata> Rangedata = new PageInfo<>(RANGEDATA);
                    return Rangedata;
////1.2.4 sql 确认
                case "TYPE1":
                    PageHelper.startPage(page, size);
                    List<Messagetype1> TYPE1 = dataInfoV2Mapper.dataSearchByType1(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype1> Messagetype1 = new PageInfo<>(TYPE1);
                    return Messagetype1;
                case "TYPE2":
                    PageHelper.startPage(page, size);
                    List<Messagetype2> TYPE2 = dataInfoV2Mapper.dataSearchByType2(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype2> Messagetype2 = new PageInfo<>(TYPE2);
                    return Messagetype2;
                case "TYPE4":
                    PageHelper.startPage(page, size);
                    List<Messagetype4> TYPE4 = dataInfoV2Mapper.dataSearchByType4(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Messagetype4> Messagetype4 = new PageInfo<>(TYPE4);
                    return Messagetype4;
                case "PVT":
                    PageHelper.startPage(page, size);
                    List<Pvt> PVT = dataInfoV2Mapper.dataSearchByPvt(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                    PageInfo<Pvt> Pvt = new PageInfo<>(PVT);
                    return Pvt;

            }
        }


        return null;
    }

    //特殊--单独提供RangeBase接口
    @Override
    public List dataSearchByrangeBase(int city, Long starttime, Long endtime) throws Exception {
        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
        String GBASID;
        if (city == 1) {
            GBASID = "BELL";
        } else {
            GBASID = "ZSDY";
        }
        //周数和周内秒
        Map start = new DateUtils().getIntData(starttime);
        Map end = new DateUtils().getIntData(endtime);
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

        //根据入参表名分别请求表数据
        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            List<Rangebase> RANGEBASE = dataInfoMapper.dataSearchByRangeBase(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
            return RANGEBASE;

        } else {
            logger.info("获取mysql数据源成功");
            List<Rangebase> RANGEBASE = dataInfoV2Mapper.dataSearchByRangeBase(GBASID, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
            return RANGEBASE;
        }
    }

    //    已废弃
    @Override
    public List datasearchByproc(int city, String type, int satid, List freqsigid, List rectypeidByBds, List rectypeidByGps, Long starttime, Long endtime, int page, int size) throws Exception {

        //对list排序
        Collections.sort(freqsigid);
        Collections.sort(rectypeidByBds);
        Collections.sort(rectypeidByGps);

        //将list转为字符串拼接，逗号隔开
        String freqsigidString = String.join(",", freqsigid);
        logger.info("freqsigid 拼接后字符串" + freqsigidString);
        String rectypeidByBdsString = String.join(",", rectypeidByBds);
        logger.info("rectypeidByBdsString 拼接后字符串" + rectypeidByBdsString);
        String rectypeidByGpsString = String.join(",", rectypeidByGps);
        logger.info("rectypeidByGpsString 拼接后字符串" + rectypeidByGpsString);
        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
        String GBASID;
        if (city == 1) {
            GBASID = "ZSDY";
        } else {
            GBASID = "BELL";
        }
        //周数和周内秒
        Map start = new DateUtils().getIntData(starttime);
        Map end = new DateUtils().getIntData(endtime);
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

        //BDS=2 GDS=1 全选=3 大范围区分
        switch (satid) {
            case 1:
                List<Procdata> procDataListByGps = dataInfoMapper.dataSearchByProcGps(GBASID, type, freqsigidString, rectypeidByBdsString, rectypeidByGpsString, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                return procDataListByGps;

            case 2:
                List<Procdata> procDataListByBds = dataInfoMapper.dataSearchByProcBds(GBASID, type, freqsigidString, rectypeidByBdsString, rectypeidByGpsString, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                return procDataListByBds;

            case 3:
                List<Procdata> procDataListByall = dataInfoMapper.dataSearchByProc(GBASID, type, freqsigidString, rectypeidByBdsString, rectypeidByGpsString, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow, page, size);
                return procDataListByall;

        }
        return null;

    }

    //    查询过程数据的业务逻辑方法
    @Override
    public List datasearchByprocAll(int city, String type, Long starttime, Long endtime) throws Exception {
        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
        String GBASID;
        if (city == 1) {
            GBASID = "BELL";
        } else {
            GBASID = "ZSDY";
        }
        //周数和周内秒
        Map start = new DateUtils().getIntData(starttime);
        Map end = new DateUtils().getIntData(endtime);
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

        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            //根据入参字段名分别请求表数据
            List<Procdata2> dataSearchByProcAll = dataInfoMapper.dataSearchByProcAll(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
            return dataSearchByProcAll;
        } else {
            logger.info("获取mysql数据源成功");
            //根据入参字段名分别请求表数据
            List<Procdata2> dataSearchByProcAll = dataInfoV2Mapper.dataSearchByProcAll(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
            return dataSearchByProcAll;

        }

    }

    //查询保护级数据的业务逻辑方法
    @Override
    public List datasearchByxpl(int city, int type, Long starttime, Long endtime) throws Exception {
        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
//      type  1-侧向保护级 （VPL） 2-水平保护级（LPL）3-VPL at 20nmi 4-LPL at 20nmi 5-VPL DH  6- LPL DH

        String GBASID;
        if (city == 1) {
            GBASID = "BELL";
        } else {
            GBASID = "ZSDY";
        }
        //周数和周内秒
        Map start = new DateUtils().getIntData(starttime);
        Map end = new DateUtils().getIntData(endtime);
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

        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            //根据入参字段名分别请求表数据

            switch (type) {
                case 3:
                    List<Xpl> datasearchByvplLimit = dataInfoMapper.datasearchByvplLimit(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByvplLimit;
                case 4:
                    List<Xpl> datasearchBylplLimit = dataInfoMapper.datasearchBylplLimit(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchBylplLimit;
                case 5:
                    List<Xpl> datasearchByvplDH = dataInfoMapper.datasearchByvplDH(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByvplDH;
                case 6:
                    List<Xpl> datasearchBylplDH = dataInfoMapper.datasearchBylplDH(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchBylplDH;

                default:
                    List<Xpl> datasearchByxpl = dataInfoMapper.datasearchByxpl(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByxpl;
            }

        } else {
            logger.info("获取mysql数据源成功");
            //根据入参字段名分别请求表数据

            switch (type) {
                case 3:
                    List<Xpl> datasearchByvplLimit = dataInfoV2Mapper.datasearchByvplLimit(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByvplLimit;
                case 4:
                    List<Xpl> datasearchBylplLimit = dataInfoV2Mapper.datasearchBylplLimit(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchBylplLimit;
                case 5:
                    List<Xpl> datasearchByvplDH = dataInfoV2Mapper.datasearchByvplDH(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByvplDH;
                case 6:
                    List<Xpl> datasearchBylplDH = dataInfoV2Mapper.datasearchBylplDH(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchBylplDH;

                default:
                    List<Xpl> datasearchByxpl = dataInfoV2Mapper.datasearchByxpl(GBASID, type, gpsstartweek, gpsstarttow, bdsstartweek, bdsstarttow, gpsendweek, gpsendtow, bdsendweek, bdsendtow);
                    return datasearchByxpl;
            }


        }

    }

    //    查询资源数据接口
    @Override
    public PageInfo sourceSearch(String keyWords, String name, int page, int size) throws Exception {


        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            PageHelper.startPage(page, size);
            List<SourceInfo> search = dataInfoMapper.sourceSearch(keyWords, name, page, size);

            PageInfo<SourceInfo> SourceInfo = new PageInfo<>(search);
            return SourceInfo;
        } else {
            logger.info("获取mysql数据源成功");
            PageHelper.startPage(page, size);
            List<SourceInfo> search = dataInfoV2Mapper.sourceSearch(keyWords, name, page, size);

            PageInfo<SourceInfo> SourceInfo = new PageInfo<>(search);
            return SourceInfo;
        }

    }

    //    页脚数据提供
    @Override
    public List addressSearch() throws Exception {

        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            List<AddressInfo> address = dataInfoMapper.addressSearch();
            return address;
        } else {
            logger.info("获取mysql数据源成功");
            List<AddressInfo> address = dataInfoV2Mapper.addressSearch();
            return address;
        }
    }

    @Override
    public List availabilitySearch(int city, Long starttimestramp, Long endtimestramp) throws Exception {

        //处理城市入参，北京站1-->BELL 东营站2-->ZSDY;
        String GBASID;
        if (city == 1) {
            GBASID = "BELL";
        } else {
            GBASID = "ZSDY";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime = sdf.format(new Date(starttimestramp));
        String endtime = sdf.format(new Date(endtimestramp));

        if (choose == 1) {
            logger.info("获取oracle数据源成功");
            List<AvailInfo> AVAILABILITY = dataInfoMapper.availabilitySearch(GBASID, starttime, endtime);
            return AVAILABILITY;
        } else {
            logger.info("获取mysql数据源成功");
            List<AvailInfo> AVAILABILITY = dataInfoV2Mapper.availabilitySearch(GBASID, starttime, endtime);
            return AVAILABILITY;
        }

    }


}