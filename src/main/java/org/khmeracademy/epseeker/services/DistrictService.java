package org.khmeracademy.epseeker.services;

import java.util.ArrayList;
import org.khmeracademy.epseeker.entities.District;

public interface DistrictService {

ArrayList<District> findAl();
	
	boolean save(District district);
	
	boolean update(District district);
	
	boolean delete(int districtID);

	
}
