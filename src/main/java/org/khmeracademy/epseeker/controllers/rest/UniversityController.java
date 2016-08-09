package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<University> findAll(){
		return universityService.findAll();
	}
	
	@RequestMapping(value="/rest/university", method = RequestMethod.POST)
	boolean save(@RequestBody University uni){
		return universityService.save(uni);
	}
	
	@RequestMapping(value="/rest/university", method = RequestMethod.PUT)
	boolean update(@RequestBody University uni){
		return universityService.update(uni);
	}
	
	@RequestMapping(value="/rest/university/{universityID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("universityID") int universityID){
		return universityService.delete(universityID);
	}
	
}
