package com.service.controller;

import com.github.pagehelper.PageInfo;
import com.service.core.ret.RetResponse;
import com.service.core.ret.RetResult;
import com.service.model.*;
import com.service.sysservice.DataInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * Created by songmeng on 2018/12/9.
 */

@RestController
@RequestMapping("search")
public class DataInfoController {

    @Resource
    DataInfoService dataInfoService;

    @GetMapping("/tableAll")
    public RetResult<List<DataInfo>> tableAll() {
        List<DataInfo> tableInfoList = dataInfoService.tableAll();
        return RetResponse.makeOKRsp(tableInfoList);
    }

    //提供每个表中的字段名供前端使用来创建表格
    @GetMapping("/fieldAll")
    public RetResult<List<FieldInfo>> fieldAll(@RequestParam String tablename) {
        List<FieldInfo> tableFieldList = dataInfoService.fieldAll(tablename);
        return RetResponse.makeOKRsp(tableFieldList);
    }

    //    已废弃
    @GetMapping("/flagAll")
    public RetResult<List<FlagInfo>> flagAll() {
        List<FlagInfo> flagInfoList = dataInfoService.flagAll();
        return RetResponse.makeOKRsp(flagInfoList);
    }

    //    查询原始数据和电文数据接口
    @GetMapping("/dataSearch")
    public RetResult<PageInfo> dataSearch(@RequestParam int city, @RequestParam String table, @RequestParam Long starttime, @RequestParam Long endtime, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "0") int size) throws Exception {
        PageInfo<List> dataInfoList = dataInfoService.dataSearch(city, table, starttime, endtime, page, size);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    特殊-查询rangebase接口
    @GetMapping("/dataSearchByrangeBase")
    public RetResult dataSearchByrangeBase(@RequestParam int city, @RequestParam Long starttime, @RequestParam Long endtime) throws Exception {
        List dataInfoList = dataInfoService.dataSearchByrangeBase(city, starttime, endtime);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    已废弃
    @GetMapping("/datasearchByproc")
    public RetResult<List> datasearchByproc(@RequestParam int city, @RequestParam String type, @RequestParam int satid, @RequestParam List freqsigid, @RequestParam(defaultValue = "0", required = false) List rectypeidByGps, @RequestParam(defaultValue = "0", required = false) List rectypeidByBds, @RequestParam Long starttime, @RequestParam Long endtime, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "0") int size) throws Exception {
        List dataInfoList = dataInfoService.datasearchByproc(city, type, satid, freqsigid, rectypeidByGps, rectypeidByBds, starttime, endtime, page, size);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    查询过程数据接口
    @GetMapping("/datasearchByprocAll")
    public RetResult<List> datasearchByprocAll(@RequestParam int city, @RequestParam String type, @RequestParam Long starttime, @RequestParam Long endtime) throws Exception {
        List dataInfoList = dataInfoService.datasearchByprocAll(city, type, starttime, endtime);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    查询保护级数据接口
    @GetMapping("/datasearchByxpl")
    public RetResult<List> datasearchByxpl(@RequestParam int city, @RequestParam int type, @RequestParam Long starttime, @RequestParam Long endtime) throws Exception {
        List dataInfoList = dataInfoService.datasearchByxpl(city, type, starttime, endtime);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    资源查询接口
    @GetMapping("/sourceSearch")
    //0 论文 1 软著 2 专利
    public RetResult<PageInfo<List>> sourceSearch(@RequestParam(defaultValue = "") String keyWords, @RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "0") int size) throws Exception {
        PageInfo<List> dataInfoList = dataInfoService.sourceSearch(keyWords, name, page, size);
        return RetResponse.makeOKRsp(dataInfoList);
    }

    //    页脚数据提供
    @GetMapping("/addressSearch")
    public RetResult<List> addressSearch() throws Exception {
        List addresslist = dataInfoService.addressSearch();
        return RetResponse.makeOKRsp(addresslist);
    }

    //    AVAILABILITY

    @GetMapping("/availabilitySearch")
    public RetResult<List> availabilitySearch(@RequestParam int city, @RequestParam Long starttime, @RequestParam Long endtime) throws Exception {
        List availabilitySearch = dataInfoService.availabilitySearch(city,starttime,endtime);
        return RetResponse.makeOKRsp(availabilitySearch);
    }

}
