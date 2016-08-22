package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Country;
import org.khmeracademy.epseeker.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@RequestMapping(value="/rest/country", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", countryService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/country", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Country country){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", countryService.save(country));
		return map;
	}
	
	@RequestMapping(value="/rest/country", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Country country){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", countryService.update(country));
		return map;
	}
	
	@RequestMapping(value="/rest/country/{countryID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("countryID")int countryID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", countryService.delete(countryID));
		return map;
	}
	
}
