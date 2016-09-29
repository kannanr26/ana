package com.anaplan.sbp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaplan.sbp.dao.PRDetailDao;

import com.anaplan.sbp.model.PRDetails;

@Service("prDetailService")
public class PRDetailImpl implements PRDetailServices {

	@Autowired
	PRDetailDao prDetailDao;

	@Override
	public boolean addPRDetail(PRDetails pRDetail) throws Exception {
		// TODO Auto-generated method stub
		return prDetailDao.addPRDetail(pRDetail);
	}

	@Override
	public PRDetails getPRDetailById(long id) throws Exception {
		// TODO Auto-generated method stub
		return prDetailDao.getPRDetailById(id);
	}

	@Override
	public boolean updatePRDetail(PRDetails pRDetail) throws Exception {
		// TODO Auto-generated method stub
		return prDetailDao.updatePRDetail(pRDetail);
	}
	
	}
