package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<Institution> findAll(){
		return institutionService.findAll();
	}
	
	@RequestMapping(value="/rest/institution", method = RequestMethod.POST)
	boolean save(@RequestBody Institution institution){
		return institutionService.save(institution);
	}
	
	@RequestMapping(value="/rest/institution", method = RequestMethod.PUT)
	boolean update(@RequestBody Institution institution){
		return institutionService.update(institution);
	}
	
	@RequestMapping(value="/rest/institution/{institutionID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("institutionID")int institutionID){
		return institutionService.delete(institutionID);
	}
	
}
