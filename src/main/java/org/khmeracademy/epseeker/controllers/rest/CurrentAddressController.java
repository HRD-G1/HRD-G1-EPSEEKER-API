package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.CurrentAddress;
import org.khmeracademy.epseeker.services.CurrentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentAddressController {

	@Autowired
	CurrentAddressService currentAddressService;
	
	@RequestMapping(value="/rest/currentAddress", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.findAll()); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentAddress/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findOne(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.findOne(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentAddressFull/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findOneByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.findOneByExpertID(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentAddress", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody CurrentAddress currentAddress){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.save(currentAddress)); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentAddress", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody CurrentAddress currentAddress){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.update(currentAddress)); 
		return map;
	}
	
	@RequestMapping(value="/rest/currentAddress/{expertID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", currentAddressService.delete(expertID)); 
		return map;
	}
	
}