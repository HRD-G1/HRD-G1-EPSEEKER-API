package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExperienceDetail;
import org.khmeracademy.epseeker.services.ExperienceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {

	@Autowired
	ExperienceDetailService experienceDetailService;
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.GET)
	ArrayList<ExperienceDetail> findAll(){
		return experienceDetailService.findAll();
	}
	
	@RequestMapping(value="/rest/experiencedetail/{expertID}", method = RequestMethod.GET)
	ArrayList<ExperienceDetail> findAllByExpertID(@PathVariable("expertID")int expertID){
		return experienceDetailService.findAllByExpertID(expertID);
	}
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.POST)
	boolean save(@RequestBody ExperienceDetail experienceDetail){
		return experienceDetailService.save(experienceDetail);
	}
	
	@RequestMapping(value="/rest/experiencedetail", method = RequestMethod.PUT)
	boolean update(@RequestBody ExperienceDetail experienceDetail){
		return experienceDetailService.update(experienceDetail);
	}
	
	@RequestMapping(value="/rest/experiencedetail/{expertID}/{institutionID}/{majorID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID, @PathVariable("institutionID")int institutionID, @PathVariable("majorID")int majorID){
		return experienceDetailService.delete(expertID, institutionID, majorID);
	}
	
}
