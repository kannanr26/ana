package com.anaplan.sbp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "SYSTEM.INP_PR_Details")
public class PRDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REQUEST_PR_ID")
	private long requestPRId;
	
	@Column(name = "REQUEST_ID")
	private String requestId;
	
	@Column(name = "PR_ID")
	private String pRId;
	
	
	@Column(name = "PR_DATE")
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	
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
	
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "PO_Date")
	private Date pODate;
	
	@Column(name = "EAM_PO_STATUS")
	private String eAMPOStatus;
	                
	@Column(name = "RESERVED_AMOUNT")
	private int reservedAmount;
	  
	@Column(name = "COMMITTED_AMOUNT")
	private int committedAmount;

	public long getRequestPRId() {
		return requestPRId;
	}

	public void setRequestPRId(long requestPRId) {
		this.requestPRId = requestPRId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getpRDate() {
		return pRDate;
	}

	public void setpRDate(Date pRDate) {
		this.pRDate = pRDate;
	}

	public String geteAMPRStatus() {
		return eAMPRStatus;
	}

	public void seteAMPRStatus(String eAMPRStatus) {
		this.eAMPRStatus = eAMPRStatus;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String geteAMGnlDesc() {
		return eAMGnlDesc;
	}

	public void seteAMGnlDesc(String eAMGnlDesc) {
		this.eAMGnlDesc = eAMGnlDesc;
	}

	public String geteAMDepartment() {
		return eAMDepartment;
	}

	public void seteAMDepartment(String eAMDepartment) {
		this.eAMDepartment = eAMDepartment;
	}

	public String getpRInitiator() {
		return pRInitiator;
	}

	public void setpRInitiator(String pRInitiator) {
		this.pRInitiator = pRInitiator;
	}

	public int getpOAmount() {
		return pOAmount;
	}

	public void setpOAmount(int pOAmount) {
		this.pOAmount = pOAmount;
	}

	public Date getPODate() {
		return pODate;
	}

	public void setPODate(Date pODate) {
		this.pODate = pODate;
	}

	public String geteAMPOStatus() {
		return eAMPOStatus;
	}

	public void seteAMPOStatus(String eAMPOStatus) {
		this.eAMPOStatus = eAMPOStatus;
	}

	public int getReservedAmount() {
		return reservedAmount;
	}

	public void setReservedAmount(int reservedAmount) {
		this.reservedAmount = reservedAmount;
	}

	public int getCommittedAmount() {
		return committedAmount;
	}

	public void setCommittedAmount(int committedAmount) {
		this.committedAmount = committedAmount;
	}

	  
}
