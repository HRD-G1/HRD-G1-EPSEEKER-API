package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.JobExpectation;
import org.khmeracademy.epseeker.repositories.JobExpectationRepository;
import org.khmeracademy.epseeker.services.JobExpectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobExpectationServiceImpl implements JobExpectationService{

	@Autowired
	JobExpectationRepository jobExpectationRepository;
	
	@Override
	public ArrayList<JobExpectation> findAll() {
		try{
			return jobExpectationRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(JobExpectation jobExpectation) {
		try{
			return jobExpectationRepository.save(jobExpectation);
		}catch(Exception e){
			e.printStackTrace();
		}		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(JobExpectation jobExpectation) {
		try{
			return jobExpectationRepository.update(jobExpectation);
		}catch(Exception e){
			e.printStackTrace();
		}		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int expertID, int positionID) {
		try{
			return jobExpectationRepository.delete(expertID, positionID);
		}catch(Exception e){
			e.printStackTrace();
		}		// TODO Auto-generated method stub
		return false;
	}

}
