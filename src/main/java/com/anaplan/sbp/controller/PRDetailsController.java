package com.anaplan.sbp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anaplan.sbp.model.PRDetails;
import com.anaplan.sbp.services.PRDetailServices;
import com.anaplan.sbp.services.ResponseService;


@RestController
public class PRDetailsController {

	@Autowired
	PRDetailServices rRDetailsService;

	static final Logger logger = Logger.getLogger(PRDetailsController.class);

	@RequestMapping(value = "/addPRDetail", method = RequestMethod.POST, headers = "Accept=application/json") 
	public String addPRDetail(@RequestBody PRDetails pRDetail) {
		 ResponseService responseService ; 
		try {
			 //calTrackerService
			rRDetailsService.addPRDetail(pRDetail);
			responseService =new ResponseService ("Added successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseService=new ResponseService ("Update fails");
		} 
		 
		 return responseService.toString();
	}
	

	@RequestMapping(value = "/updatePRDetail", method = RequestMethod.POST, headers = "Accept=application/json") 
	public String updatePRDetail(@RequestBody PRDetails pRDetail) {
		 ResponseService responseService ; 
		try {
			 //calTrackerService
			rRDetailsService.updatePRDetail(pRDetail);
			responseService =new ResponseService ("Updated successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseService=new ResponseService ("Update fails");
		} 
		 return responseService.toString();
	}
	
	
}
