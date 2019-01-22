package com.service.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author
 */
public class UserInfo {

    /**
     * 主键
     */
    @Id
    private String ida;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    public String getId() {
        return ida;
    }

    public void setId(String id) {
        this.ida = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
