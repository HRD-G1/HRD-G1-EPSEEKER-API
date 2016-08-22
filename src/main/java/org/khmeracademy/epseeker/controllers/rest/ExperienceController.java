package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.ExperienceDetail;
import org.khmeracademy.epseeker.services.ExperienceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {

	@Autowired
	ExperienceDetailService experienceDetailService;
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", experienceDetailService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/experiencedetail/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", experienceDetailService.findAllByExpertID(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody ExperienceDetail experienceDetail){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", experienceDetailService.save(experienceDetail)); 
		return map;
	}
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody ExperienceDetail experienceDetail){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", experienceDetailService.update(experienceDetail)); 
		return map;
	}
	
	@RequestMapping(value="/rest/experiencedetail/{expertID}/{institutionID}/{majorID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("institutionID")int institutionID, @PathVariable("majorID")int majorID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", experienceDetailService.delete(expertID, institutionID, majorID)); 
		return map;
	}
	
}
