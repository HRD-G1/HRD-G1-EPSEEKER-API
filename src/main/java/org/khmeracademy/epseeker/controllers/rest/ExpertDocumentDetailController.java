package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;
import org.khmeracademy.epseeker.services.FileDocumentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpertDocumentDetailController {

	@Autowired
	FileDocumentDetailService fileDocumentDetailService;
	
	@RequestMapping(value="rest/allexpertdocumentdetail", method = RequestMethod.GET)
	 Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.findAll());
		return map;
	}
	
	@RequestMapping(value="rest/allexpertdocumentdetail/{expertID}", method = RequestMethod.GET)
	 Map<String, Object> findAllByExpertID(@PathVariable("expertID")int expertID){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.findAllByExpertID(expertID)); 
		return map;
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.GET)
	 Map<String, Object> findOne(@RequestParam("expertID")int expertID, @RequestParam("fileDocumentID")int fileDocumentID, @RequestParam("filePath")String filePath){
		System.out.println(filePath);
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.findOne(expertID, fileDocumentID, filePath)); 
		return map;
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.POST)
	 Map<String, Object> save(@RequestBody ExpertDocumentDetail expertDocumentDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.save(expertDocumentDetail)); 
		return map;
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.PUT)
	 Map<String, Object> update(@RequestBody ExpertDocumentDetail expertDocumentDetail){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.update(expertDocumentDetail)); 
		return map;
	}
	
	@RequestMapping(value="rest/expertdocumentdetail/{expertID}/{fileDocumentID}/{filePath}", method = RequestMethod.DELETE)
	 Map<String, Object> delete(@PathVariable("expertID")int expertID, @PathVariable("fileDocumentID")int fileDocumentID, @PathVariable("filePath")String filePath){
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", fileDocumentDetailService.delete(expertID, fileDocumentID, filePath)); 
		return map;
	}
	
}
