package com.anaplan.sbp.services;

public class ResponseService {
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ResponseService(String msg) {
		this.msg=msg;
	}
	
	public String toString(){
		return "Response : "+msg;
		
	}
}
