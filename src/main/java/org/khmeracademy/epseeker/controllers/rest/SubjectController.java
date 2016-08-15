package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	public ArrayList<Subject> findAll(){
		return subjectService.findAll(); 
	}
	
	@RequestMapping(value="/rest/subject/count", method = RequestMethod.GET)
	public ArrayList<Subject> countSkill(){
		return subjectService.countSkill();
	}
	
	@RequestMapping(value="/rest/subject/bysubjectcategory/{subjectCategoryID}", method = RequestMethod.GET)
	public ArrayList<Subject> findAllBySubjectCotegory(@PathVariable("subjectCategoryID")int subjectCategoryID){
		return subjectService.findAllBySubjectCategory(subjectCategoryID);
	}
	
	@RequestMapping(value="/rest/subject", method = RequestMethod.POST)
	public boolean save(@RequestBody Subject sub){
		return subjectService.save(sub);
	}
	
	@RequestMapping(value="/rest/subject", method = RequestMethod.PUT)
	public boolean update(@RequestBody Subject sub){
		return subjectService.update(sub);
	}
	
	@RequestMapping(value="/rest/subject/{subjectID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("subjectID") int subjectID){
		return subjectService.delete(subjectID);
	}
	
	public boolean test(){
		return false;
	}
}
