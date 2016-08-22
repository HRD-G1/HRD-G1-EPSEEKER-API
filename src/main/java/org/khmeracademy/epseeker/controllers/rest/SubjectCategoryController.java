	package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.SubjectCategory;
import org.khmeracademy.epseeker.services.SubjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectCategoryController {
	
	@Autowired
	SubjectCategoryService subjectCategoryService;

	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectCategoryService.findAll());
		return map; 
	}
	
	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody SubjectCategory subCate){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectCategoryService.save(subCate));
		return map;
	}
	
	@RequestMapping(value="/rest/subjectcategory/byname/{subjectCategoryName}", method = RequestMethod.GET)
	public Map<String, Object> findOneByName(@PathVariable("subjectCategoryName")String subjectCategoryName){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectCategoryService.findOneByName(subjectCategoryName)); 
		return map;
	}
	
	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.PUT)
	public Map<String, Object> update(@RequestBody SubjectCategory subCate){
		System.out.println("Name: " + subCate.getSubjectCategoryName());
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectCategoryService.update(subCate)); 
		return map;
	}
	
	@RequestMapping(value="/rest/subjectcategory/{subjectCategoryID}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable("subjectCategoryID") int subjectCategoryID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", subjectCategoryService.delete(subjectCategoryID));
		return map;
	}
	
}
