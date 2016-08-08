package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.SubjectCategory;
import org.khmeracademy.epseeker.services.SubjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubjectCategoryController {
	
	@Autowired
	SubjectCategoryService subjectCategoryService;

	@RequestMapping(value="/rest/subjectcategory", method = RequestMethod.GET)
	public ArrayList<SubjectCategory> findAll(){
		return subjectCategoryService.findAll(); 
	}
	
}
