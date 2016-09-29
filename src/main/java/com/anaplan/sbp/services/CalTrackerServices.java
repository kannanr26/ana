package com.anaplan.sbp.services;

import com.anaplan.sbp.model.CalTracker;

public interface CalTrackerServices {
    boolean addEntity(CalTracker CalTracker);

    CalTracker getEntityById(long id);

    boolean updateCalTracker(CalTracker calTracker);

}
