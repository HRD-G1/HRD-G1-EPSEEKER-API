package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CurrentJob;
import org.khmeracademy.epseeker.services.CurrentJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentJobController {
	
	@Autowired
	CurrentJobService currentJobService;

	@RequestMapping(value="/rest/currentjob", method = RequestMethod.GET)
	ArrayList<CurrentJob> findAll(){
		return currentJobService.findAll();
	}
	
	@RequestMapping(value="/rest/currentjob", method = RequestMethod.POST)
	boolean save(@RequestBody CurrentJob currentJob){
		System.out.println("FUcCK");
		System.out.println(currentJob.getInstitutionPhone());
		return currentJobService.save(currentJob); 
	}
	
	@RequestMapping(value="/rest/currentjob", method = RequestMethod.PUT)
	boolean update(@RequestBody CurrentJob currentJob){
		return currentJobService.update(currentJob);
	}
	
	@RequestMapping(value="/rest/currentjob/{expertID}/{institutionID}/{positionID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID, @PathVariable("institutionID")int institutionID,@PathVariable("positionID")int positionID){
		return currentJobService.delete(expertID, institutionID, positionID);
	}
}


