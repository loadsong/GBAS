package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author
 */
public class FieldInfo {

    /**
     * 主键
     */
    @Id
    @Column(name = "column_name")
    private String id;



    public String getId() {
        return column_name.toLowerCase();
    }

    public void setId(String id) {
        this.id = column_name;
    }

    public String getColumn_name() {
        return column_name.toLowerCase();
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    /**
     * 用户名
     */
    @Column(name = "column_name")
    private String column_name;


}
