package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Education;
import org.khmeracademy.epseeker.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

	@Autowired
	EducationService educationService;
	
	@RequestMapping(value="/rest/education", method = RequestMethod.GET)
	ArrayList<Education> findAll(){
		if(educationService.findAll() != null){
			System.out.println("Yes");
		}
		return educationService.findAll();
	}
	
	@RequestMapping(value="/rest/education", method = RequestMethod.POST)
	boolean save(@RequestBody Education edu){
		return educationService.save(edu);
	}
	
	@RequestMapping(value="/rest/education", method = RequestMethod.PUT)
	boolean update(@RequestBody Education edu){
		return educationService.update(edu);
	}
	
	@RequestMapping(value="/rest/education/{expertID}/{universityID}/{majorID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID, @PathVariable("universityID")int universityID, @PathVariable("majorID")int majorID){
		return educationService.delete(expertID, universityID, majorID);
	}
	
}
