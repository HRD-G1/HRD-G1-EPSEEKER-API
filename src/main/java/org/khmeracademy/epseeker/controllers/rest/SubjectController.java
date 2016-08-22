package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Subject;
import org.khmeracademy.epseeker.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;

	@RequestMapping(value="/rest/subject", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectService.findAll());
		return map; 
	}
	
	@RequestMapping(value="/rest/subject/count", method = RequestMethod.GET)
	public Map<String, Object> countSkill(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectService.countSkill());
		return map;
	}
	
	@RequestMapping(value="/rest/subject/bysubjectcategory/{subjectCategoryID}", method = RequestMethod.GET)
	public Map<String, Object> findAllBySubjectCotegory(@PathVariable("subjectCategoryID")int subjectCategoryID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectService.findAllBySubjectCategory(subjectCategoryID));
		return map;
	}
	
	@RequestMapping(value="/rest/subject", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody Subject sub){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectService.save(sub)); 
		return map;
	}
	
	@RequestMapping(value="/rest/subject", method = RequestMethod.PUT)
	public Map<String, Object> update(@RequestBody Subject sub){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectService.update(sub)); 
		return map;
	}
	
	@RequestMapping(value="/rest/subject/{subjectID}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable("subjectID") int subjectID){
		Map<String, Object> map = new HashMap<>();
		boolean delete = subjectService.delete(subjectID);
		System.out.println("Delete: " + delete);
		if(!delete){
			map.put("MESSAGE", "UNSUCCESSFULLY");
			map.put("CODE", "444");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY");
			map.put("CODE", "200");
		}		
		map.put("DATA", delete); 
		return map;
	}
	
}
