package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<ExpertDocumentDetail> findAll(){
		return fileDocumentDetailService.findAll();
	}
	
	@RequestMapping(value="rest/allexpertdocumentdetail/{expertID}", method = RequestMethod.GET)
	ArrayList<ExpertDocumentDetail> findAllByExpertID(@PathVariable("expertID")int expertID){
		return fileDocumentDetailService.findAllByExpertID(expertID);
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.GET)
	ExpertDocumentDetail findOne(@RequestParam("expertID")int expertID, @RequestParam("fileDocumentID")int fileDocumentID, @RequestParam("filePath")String filePath){
		System.out.println(filePath);
		return fileDocumentDetailService.findOne(expertID, fileDocumentID, filePath);
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.POST)
	boolean save(@RequestBody ExpertDocumentDetail expertDocumentDetail){
		return fileDocumentDetailService.save(expertDocumentDetail);
	}
	
	@RequestMapping(value="rest/expertdocumentdetail", method = RequestMethod.PUT)
	boolean update(@RequestBody ExpertDocumentDetail expertDocumentDetail){
		return fileDocumentDetailService.update(expertDocumentDetail);
	}
	
	@RequestMapping(value="rest/expertdocumentdetail/{expertID}/{fileDocumentID}/{filePath}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("expertID")int expertID, @PathVariable("fileDocumentID")int fileDocumentID, @PathVariable("filePath")String filePath){
		return fileDocumentDetailService.delete(expertID, fileDocumentID, filePath);
	}
	
}
