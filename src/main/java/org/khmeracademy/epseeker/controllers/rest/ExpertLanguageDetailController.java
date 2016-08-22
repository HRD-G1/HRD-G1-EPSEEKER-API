package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertLanguageDetailService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail/{expertID}", method = RequestMethod.GET)
	public Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertLanguageDetailService.findAllByExpertID(expertID));
		return map;
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody ExpertLanguageDetail expertLanguageDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertLanguageDetailService.save(expertLanguageDetail));
		return map;
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail", method = RequestMethod.PUT)
	public Map<String, Object> update(@RequestBody ExpertLanguageDetail expertLanguageDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertLanguageDetailService.update(expertLanguageDetail)); 
		return map;
	}
	
	@RequestMapping(value="/rest/expertlanguagedetail/{expertID}/{languageID}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("languageID")int languageID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertLanguageDetailService.delete(expertID, languageID));
		return map;
	}
	
}
