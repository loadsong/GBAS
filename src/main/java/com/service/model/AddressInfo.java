package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by songmeng on 2018/12/21.
 */
public class AddressInfo {

    @Id
    private Long id;

    private String name;
    private String icp;
    private String address;
    private String tel;
    private String zipcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
