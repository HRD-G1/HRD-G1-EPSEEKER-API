package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CityOrProvince;

public interface CityOrProvinceService {

	ArrayList<CityOrProvince> findAll();
	
	ArrayList<CityOrProvince> findAllByCountry(int countryID);
	
	boolean save(CityOrProvince cityOrProvince);
	
	boolean update(CityOrProvince cityOrProvince);
	
	boolean delete(int cityOrProvinceID);
	
}
