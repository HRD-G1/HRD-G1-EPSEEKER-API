package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.JobExpectation;

public interface JobExpectationService {

	ArrayList<JobExpectation> findAll();
	
	boolean save(JobExpectation jobExpectation);
	
	boolean update(JobExpectation jobExpectation);
	
	boolean delete(int expertID, int positionID);

}
