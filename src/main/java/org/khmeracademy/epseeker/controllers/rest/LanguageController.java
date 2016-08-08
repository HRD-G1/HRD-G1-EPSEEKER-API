package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	public ArrayList<Language> findAll(){
		return languageService.findAll();
	}
	
	@RequestMapping(value="/rest/language", method = RequestMethod.POST)
	public boolean save(@RequestBody Language lang){
		return languageService.save(lang);
	}
	
	@RequestMapping(value="/rest/language", method = RequestMethod.PUT)
	public boolean update(@RequestBody Language lang){
		return languageService.update(lang);
	}
	
	@RequestMapping(value="/rest/language/{languageID}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable("languageID") int languageID){
		return languageService.delete(languageID);
	}
	
}
