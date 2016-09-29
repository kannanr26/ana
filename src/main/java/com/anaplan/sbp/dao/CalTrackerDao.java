package com.anaplan.sbp.dao;

import com.anaplan.sbp.model.CalTracker;

public interface CalTrackerDao {

	public boolean addCalTracker(CalTracker CalTracker) throws Exception;
	public CalTracker getCalTrackerById(long id) throws Exception;
	public boolean updateCalTracker(CalTracker calTracker) throws Exception;
	
}
