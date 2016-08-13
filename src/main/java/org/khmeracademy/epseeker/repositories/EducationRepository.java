package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Education;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository {
	

	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="universityID", column="university_id"),
		@Result(property="educationStartYear", column="education_start_year"),
		@Result(property="educationEndYear", column="education_end_year"),
		@Result(property="majorID", column="major_id"),
	})
	ArrayList<Education> findAll();
	
	@Select(SQL.SELECT_ALL_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="universityID", column="university_id"),
		@Result(property="educationStartYear", column="education_start_year"),
		@Result(property="educationEndYear", column="education_end_year"),
		@Result(property="majorID", column="major_id"),
		@Result(property="majorName", column="major_name"),
		@Result(property="universityName", column="university_name")
	})
	ArrayList<Education> findAllByExpertID(@Param("expertID")int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(Education edu);
	
	@Update(SQL.UPDATE)
	boolean update(Education edu);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("universityID")int universityID, @Param("majorID")int majorID);

	interface SQL{
		String SELECT = "SELECT * "
				+ "FROM exp_education";
		
		String SELECT_ALL_BY_EXPERT_ID = "SELECT edu.expert_id, uni.university_id, uni.university_name, maj.major_id, maj.major_name, edu.education_start_year, edu.education_end_year " 
								+ "from exp_universities as uni " 
								+ "INNER JOIN exp_education as edu ON uni.university_id = edu.university_id " 
								+ "INNER JOIN exp_major as maj on edu.major_id = maj.major_id "
								+ "WHERE edu.expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO exp_education "
				+ "(expert_id, university_id, education_start_year, education_end_year, major_id) "
				+ "VALUES(#{expertID}, #{universityID}, to_date(#{educationStartYear}, 'YYYY-MM-DD'), to_date(#{educationEndYear},'YYYY-MM-DD'),#{majorID})";
		
		String UPDATE = "UPDATE exp_education SET "
				+ "education_start_year = to_date(#{educationStartYear}, 'YYYY-MM-DD'),"
				+ "education_end_year = to_date(#{educationEndYear},'YYYY-MM-DD') "
				+ "WHERE expert_id = #{expertID} "
				+ "AND university_id = #{universityID} "
				+ "AND major_id = #{majorID}";
		
		String DELETE = "DELETE FROM exp_education "
				+ "WHERE expert_id = #{expertID} "
				+ "AND university_id = #{universityID} "
				+ "AND major_id = #{majorID}";
	}
	
}
