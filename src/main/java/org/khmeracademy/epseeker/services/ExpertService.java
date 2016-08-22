package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.utils.Pagination;

public interface ExpertService {

	ArrayList<Expert> findAll();
	
	ArrayList<Expert> findAllByRandom();
	
	ArrayList<Expert> advanceSearch(Expert expert, Pagination pagination);
	
	ArrayList<Expert> findExpertsBySubjectID(int subjectID, Pagination pagination);
	
	Expert findOne(int expertID);
	
	boolean save(Expert exp);
	
	boolean update(Expert exp);
	
	boolean delete(int experID);
	
}
