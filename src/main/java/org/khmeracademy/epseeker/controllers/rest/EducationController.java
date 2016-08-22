package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Education;
import org.khmeracademy.epseeker.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

	@Autowired
	EducationService educationService;
	
	@RequestMapping(value="/rest/education", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", educationService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/education/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", educationService.findAllByExpertID(expertID));
		return map;
	}
	
	@RequestMapping(value="/rest/education", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Education edu){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", educationService.save(edu));
		return map;
	}
	
	@RequestMapping(value="/rest/education", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Education edu){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", educationService.update(edu)); 
		return map;
	}
	
	@RequestMapping(value="/rest/education/{expertID}/{universityID}/{majorID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("universityID")int universityID, @PathVariable("majorID")int majorID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", educationService.delete(expertID, universityID, majorID)); 
		return map;
	}
	
}
