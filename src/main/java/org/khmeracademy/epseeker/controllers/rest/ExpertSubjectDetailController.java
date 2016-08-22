package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

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
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertSubjectDetailService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail/{expertID}", method = RequestMethod.GET)
	Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertSubjectDetailService.findAllByExpertID(expertID));
		return map;
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody ExpertSubjectDetail expertSubjectDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertSubjectDetailService.save(expertSubjectDetail));
		return map;
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody ExpertSubjectDetail expertSubjectDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertSubjectDetailService.update(expertSubjectDetail));
		return map;
	}
	
	@RequestMapping(value="/rest/expertsubjectdetail/{expertID}/{subjectID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("expertID")int exertID, @PathVariable("subjectID")int subjectID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertSubjectDetailService.delete(exertID, subjectID));
		return map;
	}
	
}
