package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.District;
import org.khmeracademy.epseeker.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {

	@Autowired
	DistrictService districtService;
	
	@RequestMapping(value="/rest/district", method = RequestMethod.GET)
	ArrayList<District> findAll(){
		return districtService.findAl();
	}
	
	@RequestMapping(value="/rest/district", method = RequestMethod.POST)
	boolean save(@RequestBody District district){
		System.out.println(district.getDistrictName());
		return districtService.save(district);
	}
	
	@RequestMapping(value="/rest/district", method = RequestMethod.PUT)
	boolean update(@RequestBody District district){
		return districtService.update(district);
	}
	
	@RequestMapping(value="/rest/district/{districtID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("districtID")int districtID){
		return districtService.delete(districtID);
	}
}
