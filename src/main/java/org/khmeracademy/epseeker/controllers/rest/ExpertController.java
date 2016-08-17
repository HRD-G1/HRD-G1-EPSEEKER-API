package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.CurrentAddress;
import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.entities.Subject;
import org.khmeracademy.epseeker.services.ExpertService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
public class ExpertController {
	
	@Autowired
	ExpertService expertService;
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.GET)
	public ArrayList<Expert> findAll(){
		return expertService.findAll();
	}
		
	@RequestMapping(value="/rest/expertbyrandom", method = RequestMethod.GET)
	public ArrayList<Expert> findAllByRandom(){
		return expertService.findAllByRandom();
	}
	
	@RequestMapping(value="/rest/findExpertsBySubjectID/{subjectID}", method = RequestMethod.GET)
	@ApiImplicitParams({
		@ApiImplicitParam(name="page", paramType="query", defaultValue="1"),
		@ApiImplicitParam(name="limit", paramType="query", defaultValue="1")
	})
	
	public Map<String, Object> replaceAllExpertsBySubjectID(@PathVariable("subjectID")int subjectID, Pagination pagination){
		System.out.println(pagination.getLimit());
		System.out.println(pagination.getPage());
		System.out.println(pagination.offset());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PAGINATION", pagination);
		map.put("DATA", expertService.findExpertsBySubjectID(subjectID, pagination));
		return map;
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.GET)
	public Expert findOne(@PathVariable("expertID") int expertID){
		return expertService.findOne(expertID);
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.POST)
	public boolean save(@RequestBody Expert exp){
		return expertService.save(exp);
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.PUT)
	public boolean update(@RequestBody Expert exp){
		return expertService.update(exp);	
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("expertID") int expertID){
		return expertService.delete(expertID);
	}
		
	@RequestMapping(value="/rest/expert/advance", method = RequestMethod.POST)
	public ArrayList<Expert> advanceSearch(@RequestBody Expert expert){
		System.out.println(expert.getCurrentJobs().get(0).getInstitutionAddress());
		System.out.println(expert.getSubjects().get(1).getSubjectID() );
		return null;
	}
	
}
	
