package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	 Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", jobExpectationService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/jobexpectation/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", jobExpectationService.findAllByExpertID(expertID));
		return map;
	}
	
	@RequestMapping(value="/rest/jobexpectation", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody JobExpectation jobExpectation){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", jobExpectationService.save(jobExpectation)); 
		return map;				
	}
	
	
	@RequestMapping(value="/rest/jobexpectation", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody JobExpectation jobExpectation){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", jobExpectationService.update(jobExpectation));
		return map;
	}
	
	@RequestMapping(value="/rest/jobexpectation/{expertID}/{positionID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("positionID")int positionID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", jobExpectationService.delete(expertID, positionID)); 
		return map;
	}
}
