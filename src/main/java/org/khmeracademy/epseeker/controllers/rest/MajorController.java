package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Major;
import org.khmeracademy.epseeker.services.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MajorController {
	
	@Autowired
	MajorService majorService;

	@RequestMapping(value="/rest/major", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", majorService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/major", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Major maj){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", majorService.save(maj));
		return map;
	}
	
	@RequestMapping(value="/rest/major", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Major maj){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", majorService.update(maj)); 
		return map;
	}
	
	@RequestMapping(value="/rest/major/{majorID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("majorID")int majorID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", majorService.delete(majorID)); 
		return map;
	}
}
