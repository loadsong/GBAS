package com.service.dao.db1;

import com.service.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 * songmeng
 */
@Primary
public interface ManageInfoMapper {


    //3.1VDB电文（根据电文表）
    List<MTInfo> MTInfoByReality
    (
            @Param("freqSigID") String SYS, @Param("messageType") String MT,
            @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
            @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
            @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
            @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );

    List<MTInfo> MTInfoByRealityPath
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
                    @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
                    @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
                    @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
            );

    List<MTInfo> MTInfoByError
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
                    @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
                    @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
                    @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
            );

    List<MTInfo> MTInfoByTimeSlot
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
                    @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
                    @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
                    @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
            );

    List<ConfigInfo2> MTInfoByPre1
            (
            );

    List<ConfigInfo2> MTInfoByPre2
            (
            );

    List<ConfigInfo2> MTInfoByPre4
            (
            );

    List<ConfigInfo2> MTInfoByPre11
            (
            );

    List<MTInfo2> MTInfoByFreq
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
                    @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
                    @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
                    @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
            );

    List MTInfoByTime
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String SYS, @Param("messageType") String MT
            );
    List MTInfoBycurrentTime1
            (@Param("freqSigID") String freqSigID, @Param("messageType") String messagetype,
             @Param("currentTime") String currenttime
            );
    List MTInfoBycurrentTime2
            (@Param("freqSigID") String freqSigID, @Param("messageType") String messagetype,
             @Param("currentTime") String currenttime
            );
    List MTInfoBycurrentTime4
            (@Param("freqSigID") String freqSigID, @Param("messageType") String messagetype,
             @Param("currentTime") String currenttime
            );
    List MTInfoBycurrentTime11
            (@Param("freqSigID") String freqSigID, @Param("messageType") String messagetype,
             @Param("currentTime") String currenttime
            );

    List<MTInfo> MTInfoByTimeReality
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("currentTime") String currentTime

            );

    List<MTInfo> MTInfoByTimeRealityPath
            (
                    @Param("freqSigID") String SYS, @Param("messageType") String MT,
                    @Param("currentTime") String currentTime
            );

    //3.2 信号强度（根据VDBINFO表）
    List<VdbInfo> vdbInfo
    (@Param("starttime") String starttime, @Param("endtime") String endtime
    );

    List<SatInfoByMath> vdbInfoByMath
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    //3.3伪距差分精度（根据SATINFO表）
    List<SatInfo> satInfoByElevation
    (@Param("starttime") String starttime, @Param("endtime") String endtime,
     @Param("freqSigID") String freqSigID, @Param("recTypeID") String recTypeID,
     @Param("recID") String recID
    );

    List<SatInfo> satInfoByTime
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID
            );

    List<SatInfoByMath> satInfoByTimeMath
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID
            );

    List<SatInfo> satInfoByTreble
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List<SatInfo> satInfoByTrebleD
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List<SatInfo> satInfoByTreble30
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    //3.4完好性监测（根据APRDEV表）
    List<AprdevInfo> aprdevInfo
    (@Param("starttime") String starttime, @Param("endtime") String endtime, @Param("posMode") int posMode,
     @Param("freqSigID") String freqSigID
    );

    List<SatInfoByMath> aprdevInfoByMath
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List<AprdevInfo> aprdevInfoByOverlal
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List<AprdevInfo> aprdevInfoByOverval
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    //3.5差分定位精度（根据PVT表）
    List<PvtInfo> PvtInfo
    (@Param("starttime") String starttime, @Param("endtime") String endtime,
     @Param("freqSigID") String freqSigID, @Param("posMode") String posMode
    );

    List<SatInfoByMath> PvtInfoByMathH
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID, @Param("posMode") String posMode
            );

    List<SatInfoByMath> PvtInfoByMathLC
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID, @Param("posMode") String posMode
            );

    List<SatInfoByMath> PvtInfoByMathPC
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID, @Param("posMode") String posMode
            );

    //3.6

    List<SatInfo> TBDInfoByFreqSigID
            (@Param("starttime") String starttime, @Param("endtime") String endtime,
             @Param("freqSigID") String freqSigID
            );

    List<TotalInfo> TBDInfoByGNSS
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List<TotalInfo> TBDInfoByVDB
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );

    List TestRecInfo
            (@Param("starttime") String starttime, @Param("endtime") String endtime
            );


    //3.7配置管理（根据CONFIG表）
    List<ConfigInfo> configManage();

    Object configUpdate(@Param("SEQID") Long SEQID, @Param("PARAMNAME") String PARAMNAME, @Param("PARAMVALUE") String PARAMVALUE,
                        @Param("PARAMNOTE") String PARAMNOTE
    );

    Object configAdd(@Param("PARAMNAME") String PARAMNAME, @Param("PARAMVALUE") String PARAMVALUE,
                     @Param("PARAMNOTE") String PARAMNOTE
    );

}