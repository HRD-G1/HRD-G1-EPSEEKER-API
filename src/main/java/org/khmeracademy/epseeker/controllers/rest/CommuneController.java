package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Commune;
import org.khmeracademy.epseeker.services.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommuneController {

	@Autowired
	CommuneService communeService;
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", communeService.findAl());
		return map; 
	}
	
	@RequestMapping(value="/rest/commune/{districtID}", method = RequestMethod.GET)
	Map<String, Object> findAllByDistrictID(@PathVariable("districtID")int districtID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", communeService.findAllByDistrictID(districtID));
		return map; 
	}
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Commune commune){
		
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", communeService.save(commune));
		return map;
	}
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Commune commune){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", communeService.update(commune));
		return map;
	}
	
	@RequestMapping(value="/rest/commune/{communeID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("communeID")int communeID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", communeService.delete(communeID));
		return map;
	}
}
