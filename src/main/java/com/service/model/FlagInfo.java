package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author
 */
public class FlagInfo {

    /**
     * 主键
     */
    @Id
    private String ida;

    /**
     * 用户名
     */
    @Column(name = "column_name")
    private String column_name;

    public String getId() {
        return ida;
    }

    public void setId(String id) {
        this.ida = id;
    }

    public String getUserName() {
        return column_name;
    }

    public void setUserName(String userName) {
        this.column_name = userName;
    }
}
