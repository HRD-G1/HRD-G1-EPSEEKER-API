package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertSubjectDetail;

public interface ExpertSubjectDetailService {

	ArrayList<ExpertSubjectDetail> findAll();
	
	boolean save(ExpertSubjectDetail expertSubjectDetail);
	
	boolean update(ExpertSubjectDetail expertSubjectDetail);
	
	boolean delete(int exertID, int sujectID);
	
}
