package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<POB> findAll(){
		return pobService.findAll();
	}
	
	@RequestMapping(value="/rest/pob/{expertID}", method = RequestMethod.GET)
	POB findOne(@PathVariable("expertID")int expertID){
		return pobService.findOne(expertID);
	}
	
	@RequestMapping(value="/rest/pob", method = RequestMethod.POST)
	boolean save(@RequestBody POB pob){
		return pobService.save(pob);
	}
	
	@RequestMapping(value="/rest/pob", method = RequestMethod.PUT)
	boolean update(@RequestBody POB pob){
		return pobService.update(pob);
	}
	
	@RequestMapping(value="/rest/pob/{expertID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID){
		return pobService.delete(expertID);
	}
	
}