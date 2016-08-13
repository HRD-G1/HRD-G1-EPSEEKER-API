package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.POB;

public interface POBService {

	ArrayList<POB> findAll();
	
	POB findOne(int expertID);
	
	POB findOneByExpertID(int expertID);
	
	boolean save(POB pob);
	
	boolean update(POB pob);
	
	boolean delete(int expertID);
	
}
