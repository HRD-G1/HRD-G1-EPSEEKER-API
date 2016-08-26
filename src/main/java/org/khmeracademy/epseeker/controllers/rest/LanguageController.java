package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Language;
import org.khmeracademy.epseeker.services.LanguageService;
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
public class LanguageController {
	
	@Autowired
	LanguageService languageService;

	@RequestMapping(value="/rest/language", method = RequestMethod.GET)
	@ApiImplicitParams({ @ApiImplicitParam(name = "page", paramType = "query", defaultValue = "1"),
		@ApiImplicitParam(name = "limit", paramType = "query", defaultValue = "1") })
	public Map<String, Object> findAll(Pagination pagination){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", languageService.findAll(pagination));
		return map;
	}
	
	@RequestMapping(value="/rest/language", method = RequestMethod.POST)
	public  Map<String, Object> save(@RequestBody Language lang){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", languageService.save(lang)); 
		return map;
	}
	
	@RequestMapping(value="/rest/language", method = RequestMethod.PUT)
	public  Map<String, Object> update(@RequestBody Language lang){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", languageService.update(lang)); 
		return map;
	}
	
	@RequestMapping(value="/rest/language/{languageID}", method = RequestMethod.DELETE)
	public  Map<String, Object> delete(@PathVariable("languageID") int languageID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", languageService.delete(languageID));
		return map;
	}
	
}
