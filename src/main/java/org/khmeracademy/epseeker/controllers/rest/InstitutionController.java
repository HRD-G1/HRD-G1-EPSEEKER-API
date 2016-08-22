package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Institution;
import org.khmeracademy.epseeker.services.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstitutionController {
	
	@Autowired
	InstitutionService institutionService;

	@RequestMapping(value="/rest/institution", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", institutionService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/institution", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Institution institution){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", institutionService.save(institution));
		return map;
	}
	
	@RequestMapping(value="/rest/institution", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Institution institution){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", institutionService.update(institution)); 
		return map;
	}
	
	@RequestMapping(value="/rest/institution/{institutionID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("institutionID")int institutionID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", institutionService.delete(institutionID));
		return map;
	}
	
}
