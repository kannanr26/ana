package com.anaplan.sbp.dao;

import com.anaplan.sbp.model.CalTracker;

public interface CalTrackerDao {

    boolean addCalTracker(CalTracker CalTracker);

    CalTracker getCalTrackerById(long id);

    boolean updateCalTracker(CalTracker calTracker);

}
