package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExperienceDetail;

public interface ExperienceDetailService {

	ArrayList<ExperienceDetail> findAll();
	
	ArrayList<ExperienceDetail> findAllByExpertID(int expertID);
	
	boolean save(ExperienceDetail experienceDetail);
	
	boolean update(ExperienceDetail experienceDetail);
	
	boolean delete(int expertID, int institutionID, int majorID);
	
}
