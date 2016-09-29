package com.anaplan.sbp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaplan.sbp.dao.CalTrackerDao;
import com.anaplan.sbp.model.CalTracker;

@Service("calTrackerService")
public class CalTrackerServicesImpl implements CalTrackerServices {

	@Autowired
	CalTrackerDao calTrackerDao;
	
	@Override
	public boolean addEntity(CalTracker calTracker) throws Exception {
		return calTrackerDao.addCalTracker(calTracker);
	}

	@Override
	public CalTracker getEntityById(long id) throws Exception {
		return calTrackerDao.getCalTrackerById(id);

	}

	@Override
	public boolean updateCalTracker(CalTracker calTracker) throws Exception {
		// TODO Auto-generated method stub
		return calTrackerDao.updateCalTracker(calTracker);
	}
}
