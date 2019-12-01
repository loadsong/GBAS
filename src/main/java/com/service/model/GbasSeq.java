package com.service.model;

import javax.persistence.*;

@Table(name = "GBAS_SEQ")
public class GbasSeq {
    @Id
    private Long id;

    @Column(name = "seq_name")
    private String seqName;

    @Column(name = "min_val")
    private Long minVal;

    @Column(name = "max_val")
    private Long maxVal;

    @Column(name = "current_val")
    private Long currentVal;

    @Column(name = "increment_val")
    private Integer incrementVal;

    /**
     * @return seq_name
     */
    public String getSeqName() {
        return seqName;
    }

    /**
     * @param seqName
     */
    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    /**
     * @return min_val
     */
    public Long getMinVal() {
        return minVal;
    }

    /**
     * @param minVal
     */
    public void setMinVal(Long minVal) {
        this.minVal = minVal;
    }

    /**
     * @return max_val
     */
    public Long getMaxVal() {
        return maxVal;
    }

    /**
     * @param maxVal
     */
    public void setMaxVal(Long maxVal) {
        this.maxVal = maxVal;
    }

    /**
     * @return current_val
     */
    public Long getCurrentVal() {
        return currentVal;
    }

    /**
     * @param currentVal
     */
    public void setCurrentVal(Long currentVal) {
        this.currentVal = currentVal;
    }

    /**
     * @return increment_val
     */
    public Integer getIncrementVal() {
        return incrementVal;
    }

    /**
     * @param incrementVal
     */
    public void setIncrementVal(Integer incrementVal) {
        this.incrementVal = incrementVal;
    }
}