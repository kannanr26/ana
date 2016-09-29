package com.anaplan.sbp.controller;

import com.anaplan.sbp.model.CalTracker;
import com.anaplan.sbp.model.Response;
import com.anaplan.sbp.services.CalTrackerServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalTrackerController {

    private final Logger logger = Logger.getLogger(CalTrackerController.class);
    @Autowired
    private CalTrackerServices calTrackerService;

    @RequestMapping(value = "/addCalTracker", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody
    public Response addCalTracker(@RequestBody final CalTracker calTracker) {
        //calTrackerService
        final Response responseService = new Response("Added successfully");
        return responseService;
    }


}
