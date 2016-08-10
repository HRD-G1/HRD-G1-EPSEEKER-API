package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.ExperienceDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceDetailRepository {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="institutionID", column="institution_id"),
		@Result(property="majorID", column="major_id"),
		@Result(property="experienceStartYear", column="experience_start_year"),
		@Result(property="experienceEndYear", column="experience_end_year")
	})
	ArrayList<ExperienceDetail> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(ExperienceDetail experienceDetail);
	
	@Update(SQL.UPDATE)
	boolean update(ExperienceDetail experienceDetail);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("institutionID")int institutionID, @Param("majorID")int majorID);
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_experience_detail";
		
		String INSERT = "INSERT INTO exp_experience_detail "
				+ "(expert_id, institution_id, major_id, experience_start_year, experience_end_year) "
				+ "VALUES(#{expertID}, #{institutionID}, #{majorID}, to_date(#{experienceStartYear}, 'YYYY-MM-DD'), to_date(#{experienceEndYear}, 'YYYY-MM-DD'))";
		
		String UPDATE = "UPDATE exp_experience_detail SET "
				+ "experience_start_year = to_date(#{experienceStartYear}, 'YYYY-MM-DD'), "
				+ "experience_end_year = to_date(#{experienceEndYear}, 'YYYY-MM-DD') "
				+ "WHERE "
				+ "expert_id = #{expertID} AND "
				+ "institution_id = #{institutionID} AND "
				+ "major_id = #{majorID}";
		
		String DELETE = "DELETE FROM exp_experience_detail "
				+ "WHERE "
				+ "expert_id = #{expertID} AND "
				+ "institution_id = #{institutionID} AND "
				+ "major_id = #{majorID}";
	}
	
}
