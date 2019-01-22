package com.service.sysservice;

import com.github.pagehelper.PageInfo;
import com.service.core.universal.Service;
import com.service.model.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 *songmeng
 * 这是接口定义，对每个接口进行入参定义
 * 具体的业务逻辑是在对应的DataInfoServiceImpl中实现
 */
public interface DataInfoService extends Service<UserInfo> {


    List<DataInfo> tableAll();
    List<FieldInfo> fieldAll(String tablename);
    List<FlagInfo> flagAll();
    PageInfo<List> dataSearch (int city, String table , Long starttime, Long  endtime, int page, int size) throws Exception;
    List dataSearchByrangeBase (int city, Long starttime, Long  endtime) throws Exception;
    List datasearchByproc( int city,  String type,  int satid,  List freqsigid,  List rectypeidByBds, List rectypeidByGps, Long starttime,  Long endtime, int page, int size) throws Exception;
    List datasearchByprocAll( int city,  String type,  Long starttime,  Long endtime) throws Exception;
    List datasearchByxpl( int city,  int type,  Long starttime,  Long endtime) throws Exception;
    PageInfo<List> sourceSearch( String keyWords,  String name, int page, int size) throws Exception;
    List addressSearch() throws Exception;
    List availabilitySearch(int city,Long starttime,Long endtime) throws Exception;

}