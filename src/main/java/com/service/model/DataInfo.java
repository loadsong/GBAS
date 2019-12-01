package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.text.SimpleDateFormat;

/**
 * @author
 */
public class DataInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 主键
     */
    @Id
    private String ida;

    /**
     * 用户名
     */
    @Column(name = "table_name")
    private String table_name;

    public String getId() {
        return ida;
    }

    public void setId(String id) {
        this.ida = id;
    }

    public String getUserName() {
        return table_name;
    }

    public void setUserName(String userName) {
        this.table_name = userName;
    }
}


