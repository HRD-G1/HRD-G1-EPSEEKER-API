package org.khmeracademy.epseeker.controllers.rest;

import java.util.ArrayList;

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
	ArrayList<FileDocument> findAll(){
		return fileDocumentService.findAll();
	}
	
	@RequestMapping(value="/rest/filedocument/{fileID}", method = RequestMethod.GET)
	FileDocument findOne(@PathVariable("fileID")int fileID){
		return fileDocumentService.findOne(fileID);
	}
	
	@RequestMapping(value="/rest/filedocument", method = RequestMethod.POST)
	boolean save(@RequestBody FileDocument fileDocument){
		return fileDocumentService.save(fileDocument);
	}
	
	@RequestMapping(value="/rest/filedocument", method = RequestMethod.PUT)
	boolean update(@RequestBody FileDocument fileDocument){
		return fileDocumentService.update(fileDocument);
	}
	
	@RequestMapping(value="/rest/filedocument/{fileID}", method = RequestMethod.DELETE)
	boolean delete(@PathVariable("fileID")int fileID){
		return fileDocumentService.delete(fileID);
	}

}
