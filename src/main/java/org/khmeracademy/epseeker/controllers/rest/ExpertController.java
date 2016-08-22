package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Expert;
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
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findAll());
		return map;
	}
		
	@RequestMapping(value="/rest/expertbyrandom", method = RequestMethod.GET)
	public Map<String, Object> findAllByRandom(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findAllByRandom());
		return map;
	}
	
	@RequestMapping(value="/rest/findExpertsBySubjectID/{subjectID}", method = RequestMethod.GET)
	@ApiImplicitParams({
		@ApiImplicitParam(name="page", paramType="query", defaultValue="1"),
		@ApiImplicitParam(name="limit", paramType="query", defaultValue="1")
	})
	
	public Map<String, Object> replaceAllExpertsBySubjectID(@PathVariable("subjectID")int subjectID, Pagination pagination){
		System.out.println("Subject Page: ");
		System.out.println(pagination.getLimit());
		System.out.println(pagination.getPage());
		System.out.println(pagination.offset());
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", expertService.findExpertsBySubjectID(subjectID, pagination));
		return map;
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.GET)
	public  Map<String, Object> findOne(@PathVariable("expertID") int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findOne(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.POST)
	public  Map<String, Object> save(@RequestBody Expert exp){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.save(exp));
		return map;
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.PUT)
	public  Map<String, Object> update(@RequestBody Expert exp){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.update(exp)); 
		return map;	
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.DELETE)
	public  Map<String, Object> delete(@PathVariable("expertID") int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.delete(expertID));
		return map;
	}
		
	@RequestMapping(value="/rest/expert/advance", method = RequestMethod.POST)
	@ApiImplicitParams({
		@ApiImplicitParam(name="page", paramType="query", defaultValue="1"),
		@ApiImplicitParam(name="limit", paramType="query", defaultValue="1")
	})
	public Map<String, Object>  advanceSearch(@RequestBody Expert expert, Pagination pagination){
		System.out.println("Advance Page: ");
		System.out.println(pagination.getLimit());
		System.out.println(pagination.getPage());
		System.out.println(pagination.offset());
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", expertService.advanceSearch(expert, pagination));
		return map;
	}
	
}
	
