package com.anaplan.sbp.services;

import com.anaplan.sbp.model.CalTracker;

public interface CalTrackerServices {
	public boolean addEntity(CalTracker CalTracker) throws Exception;
	public CalTracker getEntityById(long id) throws Exception;
	public boolean updateCalTracker(CalTracker  calTracker) throws Exception;
	
}
