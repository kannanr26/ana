package com.anaplan.sbp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SYSTEM.CAL_TRACKER")
public class CalTracker implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "REQ_ID")
	private long Req_ID;
	
	@Column(name = "VERSION_ANAPLAN")
	private String version_Anaplan;
	
	@Column(name = "SUB_DEPT")
	private String sub_Dept;
	
	@Column(name = "ASSET_CLASS")
	private String asset_Class;
	
	public long getReq_ID() {
		return Req_ID;
	}

	public void setReq_ID(long req_ID) {
		Req_ID = req_ID;
	}

	public String getVersion_Anaplan() {
		return version_Anaplan;
	}

	public void setVersion_Anaplan(String version_Anaplan) {
		this.version_Anaplan = version_Anaplan;
	}

	public String getSub_Dept() {
		return sub_Dept;
	}

	public void setSub_Dept(String sub_Dept) {
		this.sub_Dept = sub_Dept;
	}

	public String getAsset_Class() {
		return asset_Class;
	}

	public void setAsset_Class(String asset_Class) {
		this.asset_Class = asset_Class;
	}

	public String getAsset_Category() {
		return asset_Category;
	}

	public void setAsset_Category(String asset_Category) {
		this.asset_Category = asset_Category;
	}

	public String getNew_Replace() {
		return new_Replace;
	}

	public void setNew_Replace(String new_Replace) {
		this.new_Replace = new_Replace;
	}

	public int getQty_Order() {
		return qty_Order;
	}

	public void setQty_Order(int qty_Order) {
		this.qty_Order = qty_Order;
	}

	public int getTotal_Committed() {
		return total_Committed;
	}

	public void setTotal_Committed(int total_Committed) {
		this.total_Committed = total_Committed;
	}

	public int getTotal_Reserved() {
		return total_Reserved;
	}

	public void setTotal_Reserved(int total_Reserved) {
		this.total_Reserved = total_Reserved;
	}

	public int getUnit_Price() {
		return unit_Price;
	}

	public void setUnit_Price(int unit_Price) {
		this.unit_Price = unit_Price;
	}

	public int getYear_I() {
		return year_I;
	}

	public void setYear_I(int year_I) {
		this.year_I = year_I;
	}

	public int getBudgeted_Amount() {
		return budgeted_Amount;
	}

	public void setBudgeted_Amount(int budgeted_Amount) {
		this.budgeted_Amount = budgeted_Amount;
	}

	public String getCapex_Type() {
		return capex_Type;
	}

	public void setCapex_Type(String capex_Type) {
		this.capex_Type = capex_Type;
	}

	public String getReallocation_Unbudgeted_Status() {
		return reallocation_Unbudgeted_Status;
	}

	public void setReallocation_Unbudgeted_Status(String reallocation_Unbudgeted_Status) {
		this.reallocation_Unbudgeted_Status = reallocation_Unbudgeted_Status;
	}

	public int getUnbudgeted_Request() {
		return unbudgeted_Request;
	}

	public void setUnbudgeted_Request(int unbudgeted_Request) {
		this.unbudgeted_Request = unbudgeted_Request;
	}

	public int getReallocation_Request() {
		return reallocation_Request;
	}

	public void setReallocation_Request(int reallocation_Request) {
		this.reallocation_Request = reallocation_Request;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Column(name = "ASSET_CATEGORY")
	private String asset_Category;
	
	
	@Column(name = "NEW_REPLACE")
	private String new_Replace;
	
	@Column(name = "QTY_ORDER")
	private int qty_Order;
	
	@Column(name = "TOTAL_COMMITTED")
	private int total_Committed;
	
	@Column(name = "TOTAL_RESERVED")
	private int total_Reserved;
	
	
	@Column(name = "UNIT_PRICE")
	private int unit_Price;
	
	@Column(name = "YEAR_I")
	private int year_I;
	
	@Column(name = "BUDGETED_AMOUNT")
	private int budgeted_Amount;
	  
	@Column(name = "CAPEX_TYPE")
		private String capex_Type;
		
		@Column(name = "REALLOCAION_UNBUDGETED_STATUS")
		private String reallocation_Unbudgeted_Status;
		
		@Column(name ="UNBUDGETED_REQUEST")
		private int unbudgeted_Request;
		
		@Column(name = "REALLOCATION_REQUEST")
		private int reallocation_Request;
		
		@Column(name = "TOTAL")
		private int total;
	  
}
