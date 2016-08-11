package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.FileDocument;
import org.khmeracademy.epseeker.repositories.FileDocumentReposity;
import org.khmeracademy.epseeker.services.FileDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileDocumentServiceImpl implements FileDocumentService{

	@Autowired
	FileDocumentReposity fileDocumentReposity;
	
	@Override
	public ArrayList<FileDocument> findAll() {
		try{
			return fileDocumentReposity.findAll(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public FileDocument findOne(int fileID) {
		try{
			return fileDocumentReposity.findOne(fileID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(FileDocument fileDocument) {
		try{
			return fileDocumentReposity.save(fileDocument);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(FileDocument fileDocument) {
		try{
			return fileDocumentReposity.update(fileDocument);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int fileID) {
		try{
			return fileDocumentReposity.delete(fileID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	
}
