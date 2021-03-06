package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Commune;
import org.khmeracademy.epseeker.repositories.CommuneRepository;
import org.khmeracademy.epseeker.services.CommuneService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommuneServiceImpl implements CommuneService{

	@Autowired
	CommuneRepository communeRepository;
	
	

	@Override
	public boolean save(Commune commune) {
		try{
			return communeRepository.save(commune);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Commune commune) {
		try{
			return communeRepository.update(commune);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int communeID) {
		try{
			return communeRepository.delete(communeID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Commune> findAllByDistrictID(int districtID) {
		try{
			return communeRepository.findAllByDistrictID(districtID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Commune> findAl(Pagination pagination) {
		try{
			pagination.setTotalCount(communeRepository.findAllAndCount());
			int limit = pagination.getLimit();
			int offset = pagination.getOffset();
			return communeRepository.findAll(limit, offset);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}



}
