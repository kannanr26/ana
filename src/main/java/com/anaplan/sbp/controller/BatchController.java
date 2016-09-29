package com.anaplan.sbp.controller;

import com.anaplan.sbp.services.BatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "schedule")
public class BatchController {

    @Autowired
    private BatchServices batchServices;

    @RequestMapping(value = "/trigger", method = RequestMethod.GET, headers = "Accept=application/json")
    public void scheduleBatch() {
        batchServices.triggerBatch();
    }

    @RequestMapping(value = "/fixeddelay", method = RequestMethod.GET, headers = "Accept=application/json")
    public void fixedDelaySchedule() {
        batchServices.fixedDelaySchedule();
    }

    @RequestMapping(value = "/cron", method = RequestMethod.GET, headers = "Accept=application/json")
    public void cronSchedule() {
        batchServices.cronschedule();
    }

}
