package com.anaplan.sbp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SYSTEM.CAL_TRACKER")
public class CalTracker implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "REQ_ID")
    private long reqId;

    @Column(name = "VERSION_ANAPLAN")
    private String versionAnaplan;

    @Column(name = "SUB_DEPT")
    private String subDept;

    @Column(name = "ASSET_CLASS")
    private String assetClass;

    @Column(name = "ASSET_CATEGORY")
    private String assetCategory;

    @Column(name = "NEW_REPLACE")
    private String newReplace;

    @Column(name = "QTY_ORDER")
    private int qtyOrder;

    @Column(name = "TOTAL_COMMITTED")
    private int totalCommitted;

    @Column(name = "TOTAL_RESERVED")
    private int totalReserved;

    @Column(name = "UNIT_PRICE")
    private int unitPrice;

    @Column(name = "YEAR_I")
    private int yearI;

    @Column(name = "BUDGETED_AMOUNT")
    private int budgetedAmount;

    @Column(name = "CAPEX_TYPE")
    private String capexType;

    @Column(name = "REALLOCAION_UNBUDGETED_STATUS")
    private String reallocationUnbudgetedStatus;

    @Column(name = "UNBUDGETED_REQUEST")
    private int unbudgetedRequest;

    @Column(name = "REALLOCATION_REQUEST")
    private int reallocationRequest;

    @Column(name = "TOTAL")
    private int total;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getReqId() {
        return reqId;
    }

    public void setReqId(final long reqId) {
        this.reqId = reqId;
    }

    public String getVersionAnaplan() {
        return versionAnaplan;
    }

    public void setVersionAnaplan(final String versionAnaplan) {
        this.versionAnaplan = versionAnaplan;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(final String subDept) {
        this.subDept = subDept;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(final String assetClass) {
        this.assetClass = assetClass;
    }

    public String getAssetCategory() {
        return assetCategory;
    }

    public void setAssetCategory(final String assetCategory) {
        this.assetCategory = assetCategory;
    }

    public String getNewReplace() {
        return newReplace;
    }

    public void setNewReplace(final String newReplace) {
        this.newReplace = newReplace;
    }

    public int getQtyOrder() {
        return qtyOrder;
    }

    public void setQtyOrder(final int qtyOrder) {
        this.qtyOrder = qtyOrder;
    }

    public int getTotalCommitted() {
        return totalCommitted;
    }

    public void setTotalCommitted(final int totalCommitted) {
        this.totalCommitted = totalCommitted;
    }

    public int getTotalReserved() {
        return totalReserved;
    }

    public void setTotalReserved(final int totalReserved) {
        this.totalReserved = totalReserved;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(final int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getYearI() {
        return yearI;
    }

    public void setYearI(final int yearI) {
        this.yearI = yearI;
    }

    public int getBudgetedAmount() {
        return budgetedAmount;
    }

    public void setBudgetedAmount(final int budgetedAmount) {
        this.budgetedAmount = budgetedAmount;
    }

    public String getCapexType() {
        return capexType;
    }

    public void setCapexType(final String capexType) {
        this.capexType = capexType;
    }

    public String getReallocationUnbudgetedStatus() {
        return reallocationUnbudgetedStatus;
    }

    public void setReallocationUnbudgetedStatus(final String reallocationUnbudgetedStatus) {
        this.reallocationUnbudgetedStatus = reallocationUnbudgetedStatus;
    }

    public int getUnbudgetedRequest() {
        return unbudgetedRequest;
    }

    public void setUnbudgetedRequest(final int unbudgetedRequest) {
        this.unbudgetedRequest = unbudgetedRequest;
    }

    public int getReallocationRequest() {
        return reallocationRequest;
    }

    public void setReallocationRequest(final int reallocationRequest) {
        this.reallocationRequest = reallocationRequest;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

}
