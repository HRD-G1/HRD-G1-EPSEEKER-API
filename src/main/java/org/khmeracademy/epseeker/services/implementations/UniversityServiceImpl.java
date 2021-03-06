package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.University;
import org.khmeracademy.epseeker.repositories.UniversityRepository;
import org.khmeracademy.epseeker.services.UniversityService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService{

	@Autowired
	UniversityRepository universityRepository;
	
	@Override
	public ArrayList<University> findAll(Pagination pagination) {
		try{
			pagination.setTotalCount(universityRepository.findAllAndAcount());
			int limit = pagination.getLimit();
			int offset = pagination.getOffset();
			return universityRepository.findAll(limit, offset);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(University uni) {
		try{
			return universityRepository.save(uni);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(University uni) {
		try{
			return universityRepository.update(uni);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int universityID) {
		try{
			return universityRepository.delete(universityID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	
}
