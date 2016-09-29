package com.anaplan.sbp.services;

public interface BatchServices {
    void triggerBatch();

    void fixedDelaySchedule();

    void cronschedule();
}
