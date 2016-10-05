package com.anaplan.sbp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anaplan.sbp.model.CalTracker;
import com.anaplan.sbp.services.CalTrackerServices;
import com.anaplan.sbp.services.ResponseService;

@RestController
public class CalTrackerController {

	@Autowired
	CalTrackerServices calTrackerService;

	static final Logger logger = Logger.getLogger(CalTrackerController.class);

	@RequestMapping(value = "/addCalTracker", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCalTracker(@RequestBody CalTracker calTracker) {
		ResponseService responseService;
		try {
			// calTrackerService
			calTrackerService.addEntity(calTracker);
			responseService = new ResponseService("Added successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseService = new ResponseService("Added fails");
		}

		return responseService.toString();
	}

	@RequestMapping(value = "/updateCalTracker", method = RequestMethod.POST, headers = "Accept=application/json")
	public String updateCalTracker(@RequestBody CalTracker calTracker) {
		ResponseService responseService;
		try {
			// calTrackerService
			calTrackerService.updateCalTracker(calTracker);
			responseService = new ResponseService("Updated successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseService = new ResponseService("Added fails");
		}

		return responseService.toString();
	}

}
