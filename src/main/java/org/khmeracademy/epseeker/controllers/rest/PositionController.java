package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Position;
import org.khmeracademy.epseeker.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositionController {

	@Autowired
	PositionService positionService;
	
	@RequestMapping(value="/rest/position", method = RequestMethod.GET)
	Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", positionService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/position", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody Position position){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA",positionService.save(position));
		return map;
	}
	
	@RequestMapping(value="/rest/position", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody Position position){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", positionService.update(position)); 
		return map;
	}
	
	@RequestMapping(value="/rest/position/{positionID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("positionID")int positionID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", positionService.delete(positionID));
		return map;
	}
	
	
}
