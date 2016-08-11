package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.JobExpectation;
import org.khmeracademy.epseeker.services.JobExpectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobExpectationController {

	@Autowired
	JobExpectationService jobExpectationService;
	
	@RequestMapping(value="/rest/jobexpectation", method = RequestMethod.GET)
	ArrayList<JobExpectation> findAll(){
		return jobExpectationService.findAll();
	}
	
	@RequestMapping(value="/rest/jobexpectation", method = RequestMethod.POST)
	boolean save(@RequestBody JobExpectation jobExpectation){
		return jobExpectationService.save(jobExpectation);				
	}
	
	
	@RequestMapping(value="/rest/jobexpectation", method = RequestMethod.PUT)
	boolean update(@RequestBody JobExpectation jobExpectation){
		return jobExpectationService.update(jobExpectation);
	}
	
	@RequestMapping(value="/rest/jobexpectation/{expertID}/{positionID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID, @PathVariable("positionID")int positionID){
		return jobExpectationService.delete(expertID, positionID);
	}
}
