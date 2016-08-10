package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Major;
import org.khmeracademy.epseeker.services.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MajorController {
	
	@Autowired
	MajorService majorService;

	@RequestMapping(value="/rest/major", method = RequestMethod.GET)
	ArrayList<Major> findAll(){
		return majorService.findAll();
	}
	
	@RequestMapping(value="/rest/major", method = RequestMethod.POST)
	boolean save(@RequestBody Major maj){
		return majorService.save(maj);
	}
	
	@RequestMapping(value="/rest/major", method = RequestMethod.PUT)
	boolean update(@RequestBody Major maj){
		return majorService.update(maj);
	}
	
	@RequestMapping(value="/rest/major/majorID", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("majorID")int majorID){
		return majorService.delete(majorID);
	}
}
