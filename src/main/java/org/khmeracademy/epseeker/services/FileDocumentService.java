package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.FileDocument;

public interface FileDocumentService {

	ArrayList<FileDocument> findAll();
	
	FileDocument findOne(int fileID);
	
	boolean save(FileDocument fileDocument);
	
	boolean update(FileDocument fileDocument);
	
	boolean delete(int fileID);
	
}
