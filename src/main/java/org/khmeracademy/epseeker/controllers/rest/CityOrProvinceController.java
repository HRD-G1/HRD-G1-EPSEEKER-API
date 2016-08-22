package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", cityOrProvinceService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/cityorprovince/findAllBy/{countryID}", method = RequestMethod.GET)
	Map<String, Object> findAllByCountry(@PathVariable("countryID")int countryID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", cityOrProvinceService.findAllByCountry(countryID));
		return map;
	}
	
	@RequestMapping(value="/rest/cityorprovince", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody CityOrProvince cityOrProvince){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", cityOrProvinceService.save(cityOrProvince));
		return map;
	}
	
	@RequestMapping(value="/rest/cityorprovince", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody CityOrProvince cityOrProvince){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", cityOrProvinceService.update(cityOrProvince));
		return map;
	}
	
	@RequestMapping(value="/rest/cityorprovince/{cityOrProvinceID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("cityOrProvinceID")int cityOrProvinceID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", cityOrProvinceService.delete(cityOrProvinceID)); 
		return map;
	}

}
