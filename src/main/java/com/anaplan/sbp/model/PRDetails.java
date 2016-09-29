package com.anaplan.sbp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SYSTEM.INP_PR_Details")
public class PRDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "REQUEST_PR_ID")
    private long requestPRId;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "PR_DATE")
    private Date pRDate;

    @Column(name = "EAM_PR_Status")
    private String eAMPRStatus;

    @Column(name = "AMOUNT")
    private int amount;

    @Column(name = "EAM_GENERAL_DESCRIPTION")
    private String eAMGnlDesc;

    @Column(name = "EAM_DEPARTMENT")
    private String eAMDepartment;

    @Column(name = "PR_INITIATOR")
    private String pRInitiator;

    @Column(name = "PO_AMOUNT")
    private int pOAmount;

    @Column(name = "PO_Date")
    private Date PODate;

    @Column(name = "EAM_PO_STATUS")
    private String eAMPOStatus;

    @Column(name = "RESERVED_AMOUNT")
    private int reservedAmount;

    @Column(name = "COMMITTED_AMOUNT")
    private int committedAmount;

    public long getRequestPRId() {
        return requestPRId;
    }

    public void setRequestPRId(final long requestPRId) {
        this.requestPRId = requestPRId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }

    public Date getpRDate() {
        return pRDate;
    }

    public void setpRDate(final Date pRDate) {
        this.pRDate = pRDate;
    }

    public String geteAMPRStatus() {
        return eAMPRStatus;
    }

    public void seteAMPRStatus(final String eAMPRStatus) {
        this.eAMPRStatus = eAMPRStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public String geteAMGnlDesc() {
        return eAMGnlDesc;
    }

    public void seteAMGnlDesc(final String eAMGnlDesc) {
        this.eAMGnlDesc = eAMGnlDesc;
    }

    public String geteAMDepartment() {
        return eAMDepartment;
    }

    public void seteAMDepartment(final String eAMDepartment) {
        this.eAMDepartment = eAMDepartment;
    }

    public String getpRInitiator() {
        return pRInitiator;
    }

    public void setpRInitiator(final String pRInitiator) {
        this.pRInitiator = pRInitiator;
    }

    public int getpOAmount() {
        return pOAmount;
    }

    public void setpOAmount(final int pOAmount) {
        this.pOAmount = pOAmount;
    }

    public Date getPODate() {
        return PODate;
    }

    public void setPODate(final Date pODate) {
        PODate = pODate;
    }

    public String geteAMPOStatus() {
        return eAMPOStatus;
    }

    public void seteAMPOStatus(final String eAMPOStatus) {
        this.eAMPOStatus = eAMPOStatus;
    }

    public int getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(final int reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public int getCommittedAmount() {
        return committedAmount;
    }

    public void setCommittedAmount(final int committedAmount) {
        this.committedAmount = committedAmount;
    }

}
