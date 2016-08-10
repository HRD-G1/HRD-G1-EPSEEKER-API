package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	public ArrayList<SubjectCategory> findAll(){
		return subjectCategoryService.findAll(); 
	}
	
	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.POST)
	public boolean save(@RequestBody SubjectCategory subCate){
		return subjectCategoryService.save(subCate);
	}
	
	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.PUT)
	public boolean update(@RequestBody SubjectCategory subCate){
		return subjectCategoryService.update(subCate);
	}
	
	@RequestMapping(value="/rest/subjectcategory/{subjectCategoryID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("subjectCategoryID") int subjectCategoryID){
		return subjectCategoryService.delete(subjectCategoryID);
	}
	
}
