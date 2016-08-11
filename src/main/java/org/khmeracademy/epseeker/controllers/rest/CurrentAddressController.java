package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<CurrentAddress> findAll(){
		return currentAddressService.findAll();
	}
	
	@RequestMapping(value="/rest/currentAddress/{expertID}", method = RequestMethod.GET)
	CurrentAddress findOne(@PathVariable("expertID")int expertID){
		return currentAddressService.findOne(expertID);
	}
	
	@RequestMapping(value="/rest/currentAddress", method = RequestMethod.POST)
	boolean save(@RequestBody CurrentAddress currentAddress){
		return currentAddressService.save(currentAddress);
	}
	
	@RequestMapping(value="/rest/currentAddress", method = RequestMethod.PUT)
	boolean update(@RequestBody CurrentAddress currentAddress){
		return currentAddressService.update(currentAddress);
	}
	
	@RequestMapping(value="/rest/currentAddress/{expertID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID){
		return currentAddressService.delete(expertID);
	}
	
}