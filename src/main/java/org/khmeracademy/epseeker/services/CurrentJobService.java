package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.khmeracademy.epseeker.entities.CurrentJob;

public interface CurrentJobService {

	ArrayList<CurrentJob> findAll();
	
	boolean save(CurrentJob currentJob);
	
	boolean update(CurrentJob currentJob);
	
	boolean delete(@Param("expertID")int expertID, @Param("institutionID")int institutionID, @Param("positionID")int positionID);
	
}
