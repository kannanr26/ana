package com.anaplan.sbp.services;

import com.anaplan.sbp.model.PRDetails;;

public interface PRDetailServices {
	public boolean addPRDetail(PRDetails pRDetail) throws Exception;
	public PRDetails getPRDetailById(long id) throws Exception;
	public boolean updatePRDetail(PRDetails  pRDetail) throws Exception;
	
}
