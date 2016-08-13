package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertSubjectDetail;
import org.khmeracademy.epseeker.services.ExpertSubjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpertSubjectDetailController {

	@Autowired
	ExpertSubjectDetailService expertSubjectDetailService;
	
	@RequestMapping(value="/rest/expertsubjectdetail", method = RequestMethod.GET)
	ArrayList<ExpertSubjectDetail> findAll(){
		return expertSubjectDetailService.findAll();
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail/{expertID}", method = RequestMethod.GET)
	ArrayList<ExpertSubjectDetail> findAllByExpertID(@PathVariable("expertID")int expertID){
		return expertSubjectDetailService.findAllByExpertID(expertID);
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail", method = RequestMethod.POST)
	boolean save(@RequestBody ExpertSubjectDetail expertSubjectDetail){
		return expertSubjectDetailService.save(expertSubjectDetail);
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail", method = RequestMethod.PUT)
	boolean update(@RequestBody ExpertSubjectDetail expertSubjectDetail){
		return expertSubjectDetailService.update(expertSubjectDetail);
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail/{expertID}/{subjectID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int exertID, @PathVariable("subjectID")int subjectID){
		return expertSubjectDetailService.delete(exertID, subjectID);
	}
	
}
