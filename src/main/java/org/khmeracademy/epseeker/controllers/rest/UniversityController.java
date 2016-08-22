package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.University;
import org.khmeracademy.epseeker.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
	
	@Autowired
	UniversityService universityService;

	@RequestMapping(value="/rest/university", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", universityService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/university", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody University uni){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", universityService.save(uni)); 
		return map;
	}
	
	@RequestMapping(value="/rest/university", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody University uni){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", universityService.update(uni));
		return map;
	}
	
	@RequestMapping(value="/rest/university/{universityID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("universityID") int universityID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", universityService.delete(universityID)); 
		return map;
	}
	
}
