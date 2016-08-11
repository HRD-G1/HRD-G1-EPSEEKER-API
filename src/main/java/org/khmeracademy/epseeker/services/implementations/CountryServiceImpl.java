package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Country;
import org.khmeracademy.epseeker.repositories.CountryRepository;
import org.khmeracademy.epseeker.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public ArrayList<Country> findAll() {
		try{
			return countryRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Country country) {
		try{
			return countryRepository.save(country);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Country country) {
		try{
			return countryRepository.update(country);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int countryID) {
		try{
			return countryRepository.delete(countryID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
