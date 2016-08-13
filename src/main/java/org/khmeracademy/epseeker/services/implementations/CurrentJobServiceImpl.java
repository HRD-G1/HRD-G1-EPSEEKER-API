package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CurrentJob;
import org.khmeracademy.epseeker.repositories.CurrentJobSRepository;
import org.khmeracademy.epseeker.services.CurrentJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentJobServiceImpl implements CurrentJobService {

	@Autowired
	CurrentJobSRepository currentJobRepository;
	
	@Override
	public ArrayList<CurrentJob> findAll() {
		try{
			return currentJobRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(CurrentJob currentJob) {
		try{
			return currentJobRepository.save(currentJob);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CurrentJob currentJob) {
		try{
			return currentJobRepository.update(currentJob);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID, int institutionID, int positionID) {
		try{
			return currentJobRepository.delete(expertID, institutionID, positionID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<CurrentJob> findAllByExpertID(int expertID) {
		try{
			System.out.println(expertID);
			return currentJobRepository.findAllByExpertID(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
