package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.services.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpertController {
	
	@Autowired
	ExpertService expertService;
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.GET)
	public ArrayList<Expert> findAll(){
		return expertService.findAll();
	}
		
	@RequestMapping(value="/rest/expertbyrandom", method = RequestMethod.GET)
	public ArrayList<Expert> findAllByRandom(){
		return expertService.findAllByRandom();
	}
	
	@RequestMapping(value="/rest/findExpertsBySubjectID/{subjectID}", method = RequestMethod.GET)
	public ArrayList<Expert> replaceAllExpertsBySubjectID(@PathVariable("subjectID")int subjectID){
		return expertService.findExpertsBySubjectID(subjectID);
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.GET)
	public Expert findOne(@PathVariable("expertID") int expertID){
		return expertService.findOne(expertID);
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.POST)
	public boolean save(@RequestBody Expert exp){
		return expertService.save(exp);
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.PUT)
	public boolean update(@RequestBody Expert exp){
		return expertService.update(exp);	
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("expertID") int expertID){
		return expertService.delete(expertID);
	}
	
}
	
