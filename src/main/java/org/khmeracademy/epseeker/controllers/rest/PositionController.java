package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<Position> findAll(){
		return positionService.findAll();
	}
	
	@RequestMapping(value="/rest/position", method = RequestMethod.POST)
	boolean save(@RequestBody Position position){
		return positionService.save(position);
	}
	
	@RequestMapping(value="/rest/position", method = RequestMethod.PUT)
	boolean update(@RequestBody Position position){
		return positionService.update(position);
	}
	
	@RequestMapping(value="/rest/position/{positionID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("positionID")int positionID){
		return positionService.delete(positionID);
	}
	
	
}
