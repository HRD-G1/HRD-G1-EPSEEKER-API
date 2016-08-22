package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.CurrentJob;
import org.khmeracademy.epseeker.services.CurrentJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentJobController {
	
	@Autowired
	CurrentJobService currentJobService;

	@RequestMapping(value="/rest/currentjob", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentJobService.findAll()); 
		return map;
	}
	
	
	@RequestMapping(value="/rest/currentjob/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentJobService.findAllByExpertID(expertID)); 
		return map;
	}

	@RequestMapping(value="/rest/currentjob", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody CurrentJob currentJob){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentJobService.save(currentJob)); 
		return map; 
	}
	
	@RequestMapping(value="/rest/currentjob", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody CurrentJob currentJob){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentJobService.update(currentJob)); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentjob/{expertID}/{institutionID}/{positionID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("institutionID")int institutionID,@PathVariable("positionID")int positionID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentJobService.delete(expertID, institutionID, positionID)); 
		return map;
	}
}


