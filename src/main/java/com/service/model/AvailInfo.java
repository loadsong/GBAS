package com.service.model;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by songmeng on 2018/12/21.
 */
public class AvailInfo {

    @Id
    private Long id;

    private BigDecimal freqSigID;
    private String Runway;
    private String Location;
    private BigDecimal calcResult;

    public BigDecimal getFreqSigID() {
        return freqSigID;
    }

    public void setFreqSigID(BigDecimal freqSigID) {
        this.freqSigID = freqSigID;
    }

    public String getRunway() {
        return Runway;
    }

    public void setRunway(String runway) {
        Runway = runway;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public BigDecimal getCalcResult() {
        return calcResult;
    }

    public void setCalcResult(BigDecimal calcResult) {
        this.calcResult = calcResult;
    }
}
