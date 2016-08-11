package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Commune;
import org.khmeracademy.epseeker.services.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommuneController {

	@Autowired
	CommuneService communeService;
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.GET)
	ArrayList<Commune> findAll(){
		return communeService.findAl();
	}
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.POST)
	boolean save(@RequestBody Commune commune){
		return communeService.save(commune);
	}
	
	@RequestMapping(value="/rest/commune", method = RequestMethod.PUT)
	boolean update(@RequestBody Commune commune){
		return communeService.update(commune);
	}
	
	@RequestMapping(value="/rest/commune/{communeID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("communeID")int communeID){
		return communeService.delete(communeID);
	}
}
