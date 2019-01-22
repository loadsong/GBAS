package com.service.dao.db2;

import com.service.core.universal.Mapper;
import com.service.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 * songmeng
 */

public interface DataInfoV2Mapper extends Mapper<UserInfo> {

    List<DataInfo> tableAll();

    List<FlagInfo> flagAll();

    List<AddressInfo> addressSearch();

    List<FieldInfo> fieldAll(@Param("tablename") String tablename);

    //接口三
    List<Procdata> dataSearchByProcGps
    (@Param("GBASID") String GBASID, @Param("type") String type,
     @Param("freqsigidString") String freqsigidString, @Param("rectypeidByBdsString") String rectypeidByBdsString,
     @Param("rectypeidByGpsString") String rectypeidByGpsString,
     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
     int page, int size);

    List<Procdata> dataSearchByProcBds
            (@Param("GBASID") String GBASID, @Param("type") String type,
             @Param("freqsigidString") String freqsigidString, @Param("rectypeidByBdsString") String rectypeidByBdsString,
             @Param("rectypeidByGdsString") String rectypeidByGdsString,
             @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Procdata> dataSearchByProc
            (@Param("GBASID") String GBASID, @Param("type") String type,
             @Param("freqsigidString") String freqsigidString, @Param("rectypeidByBdsString") String rectypeidByBdsString,
             @Param("rectypeidByGdsString") String rectypeidByGdsString,
             @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    //接口三--过程数据
    List<Procdata2> dataSearchByProcAll
    (@Param("GBASID") String GBASID, @Param("type") String type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );

    //接口4--保护级
    List<Xpl> datasearchByxpl
    (@Param("GBASID") String GBASID, @Param("type") int type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );
    //保护级---vpl的20限制
    List<Xpl> datasearchByvplLimit
    (@Param("GBASID") String GBASID, @Param("type") int type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );
    //保护级--lpl的20限制
    List<Xpl> datasearchBylplLimit
    (@Param("GBASID") String GBASID, @Param("type") int type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );

    //保护级--vpl-DH
    List<Xpl> datasearchByvplDH
    (@Param("GBASID") String GBASID, @Param("type") int type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );

    //保护级--lpl-DH
    List<Xpl> datasearchBylplDH
    (@Param("GBASID") String GBASID, @Param("type") int type,

     @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
    );




    //    接口5--资源
    List<SourceInfo> sourceSearch
    (@Param("keywords") String keyWords, @Param("name") String name,
     int page, int size
    );

    //    接口6
    List<AvailInfo> availabilitySearch
    (@Param("GBASID") String GBASID,@Param("starttime") String starttime, @Param("endtime") String endtime
    );

    //接口2
    List<Alm> dataSearchByALM
    (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
     @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
     @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
     @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
     int page, int size);

    List<GbasSeq> dataSearchBySEQ
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Bdsnavdata> dataSearchByBdsnavdata
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Gpsnavdata> dataSearchByGPSnavData
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Procdata> dataSearchByProcData
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Rangebase> dataSearchByRangeBase
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow
            );

    List<Rangedata> dataSearchByRangeData
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Messagetype1> dataSearchByType1
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Messagetype2> dataSearchByType2
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Messagetype4> dataSearchByType4
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);

    List<Pvt> dataSearchByPvt
            (@Param("GBASID") String GBASID, @Param("gpsstartweek") int gpsstartweek, @Param("gpsstarttow") int gpsstarttow,
             @Param("bdsstartweek") int bdsstartweek, @Param("bdsstarttow") int bdsstarttow,
             @Param("gpsendweek") int gpsendweek, @Param("gpsendtow") int gpsendtow,
             @Param("bdsendweek") int bdsendweek, @Param("bdsendtow") int bdsendtow,
             int page, int size);
}