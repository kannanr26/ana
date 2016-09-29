package com.anaplan.sbp.dao;

import com.anaplan.sbp.model.PRDetails;

public interface PRDetailDao {
	public boolean addPRDetail(PRDetails PRDetail) throws Exception;
	public PRDetails getPRDetailById(long id) throws Exception;
	public boolean updatePRDetail(PRDetails PRDetail) throws Exception;
	
}
