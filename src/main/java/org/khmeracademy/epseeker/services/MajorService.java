package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Major;
import org.khmeracademy.epseeker.utils.Pagination;

public interface MajorService {

	ArrayList<Major> findAll(Pagination pagination);
	
	boolean save(Major maj);
	
	boolean update(Major maj);
	
	boolean delete(int majorID);
	
}
