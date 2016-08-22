package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.POB;
import org.khmeracademy.epseeker.services.POBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POBController {

	@Autowired
	POBService pobService;
	
	@RequestMapping(value="/rest/pob", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/pob/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findOne(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.findOne(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/pobFull/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findOneByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.findOneByExpertID(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/pob", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody POB pob){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.save(pob));
		return map;
	}
	
	@RequestMapping(value="/rest/pob", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody POB pob){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.update(pob)); 
		return map;
	}
	
	@RequestMapping(value="/rest/pob/{expertID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", pobService.delete(expertID));
		return map;
	}
	
}