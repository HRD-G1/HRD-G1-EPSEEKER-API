package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CityOrProvince;
import org.khmeracademy.epseeker.services.CityOrProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityOrProvinceController {
	
	@Autowired
	CityOrProvinceService cityOrProvinceService;
	
	@RequestMapping(value="/rest/cityorprovince", method = RequestMethod.GET)
	ArrayList<CityOrProvince> findAll(){
		return cityOrProvinceService.findAll();
	}
	
	@RequestMapping(value="/rest/cityorprovince/findAllBy/{countryID}", method = RequestMethod.GET)
	ArrayList<CityOrProvince> findAllByCountry(@PathVariable("countryID")int countryID){
		return cityOrProvinceService.findAllByCountry(countryID);
	}
	
	@RequestMapping(value="/rest/cityorprovince", method = RequestMethod.POST)
	boolean save(@RequestBody CityOrProvince cityOrProvince){
		return cityOrProvinceService.save(cityOrProvince);
	}
	
	@RequestMapping(value="/rest/cityorprovince", method = RequestMethod.PUT)
	boolean update(@RequestBody CityOrProvince cityOrProvince){
		return cityOrProvinceService.update(cityOrProvince);
	}
	
	@RequestMapping(value="/rest/cityorprovince/{cityOrProvinceID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("cityOrProvinceID")int cityOrProvinceID){
		return cityOrProvinceService.delete(cityOrProvinceID);
	}

}
