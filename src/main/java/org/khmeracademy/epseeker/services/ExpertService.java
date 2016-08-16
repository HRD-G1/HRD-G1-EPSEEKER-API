package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Expert;

public interface ExpertService {

	ArrayList<Expert> findAll();
	
	ArrayList<Expert> findAllByRandom();
	
	ArrayList<Expert> findExpertsBySubjectID(int subjectID);
	
	Expert findOne(int expertID);
	
	boolean save(Expert exp);
	
	boolean update(Expert exp);
	
	boolean delete(int experID);
	
}
