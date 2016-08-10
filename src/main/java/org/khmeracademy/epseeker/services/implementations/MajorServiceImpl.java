package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Major;
import org.khmeracademy.epseeker.repositories.MajorRepository;
import org.khmeracademy.epseeker.services.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorServiceImpl implements MajorService{

	@Autowired
	MajorRepository majorRepository;
	
	@Override
	public ArrayList<Major> findAll() {
		try{
			return majorRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Major maj) {
		try{
			return majorRepository.save(maj);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Major maj) {
		try{
			return majorRepository.update(maj);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int majorID) {
		try{
			return majorRepository.delete(majorID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
