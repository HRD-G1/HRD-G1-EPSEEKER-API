package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.khmeracademy.epseeker.entities.Country;

public interface CountryService {

	ArrayList<Country> findAll();
	
	boolean save(Country country);
	
	boolean update(Country country);
	
	boolean delete(@Param("countryID")int countryID);
	
}
