package com.service.sysservice;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.service.core.universal.Service;
import com.service.model.*;

import java.util.List;

/**
 * songmeng
 * 这是接口定义，对每个接口进行入参定义
 * 具体的业务逻辑是在对应的DataInfoServiceImpl中实现
 */
public interface ManageInfoService extends Service<UserInfo> {


    //3.1VDB电文（根据电文表）
    List MTInfo(Long starttime, Long endtime,String SYS,String MT) throws Exception;
    List MTInfoByTime(Long starttime, Long endtime,String SYS,String MT) throws Exception;
    List MTInfoByfreq(Long starttime, Long endtime,String SYS,String MT) throws Exception;
    List MTInfoBycurrentTime(String freqSigID, String messagetype,Long currenttime) throws Exception;

    //3.2信号强度（根据VDBINFO表）
    List vdbInfo(Long starttime, Long endtime);
    List vdbInfoByMath(Long starttime, Long endtime);

    //3.3伪距差分精度（根据SATINFO表）
    List satInfoByElevation(Long starttime,Long endtime,String freqSigID,String recTypeID,String recID);

    List satInfoByTime(Long starttime, Long endtime, String freqSigID);
    List satInfoByTimeMath(Long starttime, Long endtime, String freqSigID);
    List satInfoByTreble(Long starttime, Long endtime);
    List satInfoByTrebleD(Long starttime, Long endtime);
    List satInfoByTreble30(Long starttime, Long endtime);

    //3.4完好性监测（根据APRDEV表）
    List<AprdevInfo> aprdevInfo(Long starttime, Long endtime, int posMode, String freqSigID);
    List aprdevInfoByMath(Long starttime, Long endtime);
    List aprdevInfoByOverlal(Long starttime, Long endtime);
    List aprdevInfoByOverval(Long starttime, Long endtime);

    //3.5差分定位精度（根据PVT表）
    List PvtInfo(Long starttime, Long endtime, String freqSigID, String posMode);
    List PvtInfoByMathH(Long starttime, Long endtime, String freqSigID, String posMode);
    List PvtInfoByMathLC(Long starttime, Long endtime, String freqSigID, String posMode);
    List PvtInfoByMathPC(Long starttime, Long endtime, String freqSigID, String posMode);

    //3.6系统首页（根据SATINFO、SYSINFO表）
    List TBDInfoByFreqSigID(Long starttime, Long endtime, String freqSigID);
    List TBDInfoByGNSS(Long starttime, Long endtime);
    List TBDInfoByVDB(Long starttime, Long endtime);

    List TestRecInfo(Long starttime, Long endtime);

    //3.7配置管理（根据CONFIG表）
    //查看
    PageInfo<List> configInfo(int page, int size) throws Exception;

    //编辑
    Object configUpdate(Long seqid,String paramname,String paramvalue,String paramnote) throws Exception;

    //新增
    Object configAdd(String paramname,String paramvalue,String paramnote) throws Exception;


}