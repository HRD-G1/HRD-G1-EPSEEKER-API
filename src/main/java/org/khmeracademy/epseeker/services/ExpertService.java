package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Expert;

public interface ExpertService {

	ArrayList<Expert> findAll();
	
	Expert findOne(int expertID);
	
	boolean save(Expert exp);
	
	boolean update(Expert exp);
	
	boolean delete(int experID);
	
}
