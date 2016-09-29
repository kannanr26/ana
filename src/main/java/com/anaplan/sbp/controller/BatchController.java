package com.anaplan.sbp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.anaplan.sbp.services.BatchServices;


@RestController
@RequestMapping(value="schedule")
public class BatchController {

	@Autowired
	BatchServices batchServices;

	static final Logger logger = Logger.getLogger(BatchController.class);

	@RequestMapping(value = "/trigger", method = RequestMethod.GET, headers = "Accept=application/json") 
	public void scheduleBatch() {
		 try {
			batchServices.triggerBatch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ;
	}
	
	@RequestMapping(value = "/fixeddelay", method = RequestMethod.GET, headers = "Accept=application/json") 
	public void fixedDelaySchedule() {
		 try {
			batchServices.fixedDelaySchedule();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ;
	}
	
	@RequestMapping(value = "/cron", method = RequestMethod.GET, headers = "Accept=application/json") 
	public void cronSchedule() {
		 try {
			batchServices.cronschedule();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ;
	}
}
