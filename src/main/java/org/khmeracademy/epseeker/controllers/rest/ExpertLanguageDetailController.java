package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;
import org.khmeracademy.epseeker.services.ExpertLanguageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpertLanguageDetailController {
	
	@Autowired
	ExpertLanguageDetailService expertLanguageDetailService;

	@RequestMapping(value="/rest/expertlanguagedetail", method = RequestMethod.GET)
	public ArrayList<ExpertLanguageDetail> findAll(){
		return expertLanguageDetailService.findAll();
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail/{expertID}", method = RequestMethod.GET)
	public ArrayList<ExpertLanguageDetail> findAllByExpertID(@PathVariable("expertID")int expertID){
		return expertLanguageDetailService.findAllByExpertID(expertID);
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail", method = RequestMethod.POST)
	public boolean save(@RequestBody ExpertLanguageDetail expertLanguageDetail){
		return expertLanguageDetailService.save(expertLanguageDetail);
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail", method = RequestMethod.PUT)
	public boolean update(@RequestBody ExpertLanguageDetail expertLanguageDetail){
		return expertLanguageDetailService.update(expertLanguageDetail);
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail/{expertID}/{languageID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("expertID")int expertID, @PathVariable("languageID")int languageID){
		return expertLanguageDetailService.delete(expertID, languageID);
	}
	
}
