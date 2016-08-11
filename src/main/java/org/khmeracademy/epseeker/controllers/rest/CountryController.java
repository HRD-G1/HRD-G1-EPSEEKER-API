package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Country;
import org.khmeracademy.epseeker.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@RequestMapping(value="/rest/country", method = RequestMethod.GET)
	ArrayList<Country> findAll(){
		return countryService.findAll();
	}
	
	@RequestMapping(value="/rest/country", method = RequestMethod.POST)
	boolean save(@RequestBody Country country){
		return countryService.save(country);
	}
	
	@RequestMapping(value="/rest/country", method = RequestMethod.PUT)
	boolean update(@RequestBody Country country){
		return countryService.update(country);
	}
	
	@RequestMapping(value="/rest/country/{countryID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("countryID")int countryID){
		return countryService.delete(countryID);
	}
	
}
