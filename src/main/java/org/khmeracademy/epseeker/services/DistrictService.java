package org.khmeracademy.epseeker.services;

import java.util.ArrayList;
import org.khmeracademy.epseeker.entities.District;
import org.khmeracademy.epseeker.utils.Pagination;

public interface DistrictService {

	ArrayList<District> findAl(Pagination pagination);
	
	ArrayList<District> findAllByProvinceID(int provinceID);
	
	boolean save(District district);
	
	boolean update(District district);
	
	boolean delete(int districtID);

	
}
