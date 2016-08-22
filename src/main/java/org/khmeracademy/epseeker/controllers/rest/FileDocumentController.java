package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.FileDocument;
import org.khmeracademy.epseeker.services.FileDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDocumentController {
	
	@Autowired
	FileDocumentService fileDocumentService;
	
	@RequestMapping(value="/rest/filedocument", method = RequestMethod.GET)
	 Map<String, Object>  findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentService.findAll());
		return map;
	}
	
	@RequestMapping(value="/rest/filedocument/{fileID}", method = RequestMethod.GET)
	 Map<String, Object>  findOne(@PathVariable("fileID")int fileID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentService.findOne(fileID));
		return map;
	}
	
	@RequestMapping(value="/rest/filedocument", method = RequestMethod.POST)
	 Map<String, Object>  save(@RequestBody FileDocument fileDocument){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentService.save(fileDocument));
		return map;
	}
	
	@RequestMapping(value="/rest/filedocument", method = RequestMethod.PUT)
	 Map<String, Object>  update(@RequestBody FileDocument fileDocument){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentService.update(fileDocument));
		return map;
	}
	
	@RequestMapping(value="/rest/filedocument/{fileID}", method = RequestMethod.DELETE)
	 Map<String, Object>  delete(@PathVariable("fileID")int fileID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentService.delete(fileID));
		return map;
	}

}
