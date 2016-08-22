package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Language;
import org.khmeracademy.epseeker.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
	
	@Autowired
	LanguageService languageService;

	@RequestMapping(value="/rest/language", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", languageService.findAll());
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
