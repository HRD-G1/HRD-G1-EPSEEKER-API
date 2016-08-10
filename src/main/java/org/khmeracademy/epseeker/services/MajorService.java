package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Major;

public interface MajorService {

	ArrayList<Major> findAll();
	
	boolean save(Major maj);
	
	boolean update(Major maj);
	
	boolean delete(int majorID);
	
}
