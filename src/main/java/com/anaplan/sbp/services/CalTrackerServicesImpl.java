package com.anaplan.sbp.services;

import com.anaplan.sbp.dao.CalTrackerDao;
import com.anaplan.sbp.model.CalTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("calTrackerService")
public class CalTrackerServicesImpl implements CalTrackerServices {

    @Autowired
    private CalTrackerDao calTrackerDao;

    @Override
    public boolean addEntity(final CalTracker calTracker) {
        return calTrackerDao.addCalTracker(calTracker);
    }

    @Override
    public CalTracker getEntityById(final long id) {
        return calTrackerDao.getCalTrackerById(id);
    }

    @Override
    public boolean updateCalTracker(final CalTracker calTracker) {
        return calTrackerDao.updateCalTracker(calTracker);
    }
}
