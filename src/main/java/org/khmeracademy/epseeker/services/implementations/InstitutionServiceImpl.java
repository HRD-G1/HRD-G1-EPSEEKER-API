package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Institution;
import org.khmeracademy.epseeker.repositories.InstitutionRepository;
import org.khmeracademy.epseeker.services.InstitutionService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionServiceImpl implements InstitutionService{
	
	@Autowired
	InstitutionRepository institutionRepository;

	@Override
	public ArrayList<Institution> findAll(Pagination pagination) {
		try{
			pagination.setTotalCount(institutionRepository.findAllAndCount());
			int limit = pagination.getLimit();
			int offset = pagination.getOffset();
			return institutionRepository.findAll(limit, offset);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Institution institution) {
		try{
			return institutionRepository.save(institution);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Institution institution) {
		try{
			return institutionRepository.update(institution);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int institutionID) {
		try{
			return institutionRepository.delete(institutionID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
