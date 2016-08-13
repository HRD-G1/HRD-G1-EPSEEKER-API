package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;

public interface FileDocumentDetailService {

	ArrayList<ExpertDocumentDetail> findAll();
	
	ArrayList<ExpertDocumentDetail> findAllByExpertID(int expertID);
	
	ExpertDocumentDetail findOne(int expertID, int fileDocumentID, String filePath);
	
	boolean save(ExpertDocumentDetail expertDocumentDetail);
	
	boolean update(ExpertDocumentDetail expertDocumentDetail);
	
	boolean delete(int expertID, int fileDocumentID, String filePath);

}
