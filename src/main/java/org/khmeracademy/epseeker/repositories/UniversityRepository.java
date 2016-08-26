package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.University;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="universityID", column="university_id"),
		@Result(property="universityName", column="university_name"),
		@Result(property="universityDescription", column="university_description")
	})
	ArrayList<University> findAll(@Param("limit")int limit, @Param("offset")int offset);
	
	@Select(SQL.SELECT_COUNT)
	Long findAllAndAcount();
	
	
	@Insert(SQL.INSERT)
	boolean save(University uni);
	
	@Update(SQL.UPDATE)
	boolean update(University uni);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("universityID")int universityID);

	interface SQL{
		String SELECT = "SELECT * "
				+ "FROM exp_universities LIMIT #{limit} OFFSET #{offset}";
		
		String SELECT_COUNT = "SELECT COUNT(*) "
				+ "FROM exp_universities";
		
		String INSERT = "INSERT INTO "
				+ "exp_universities "
				+ "(university_name, university_description) "
				+ "VALUES(#{universityName}, #{universityDescription})";
		
		String UPDATE = "UPDATE exp_universities SET "
				+ "university_name = #{universityName}, "
				+ "university_description = #{universityDescription} "
				+ "WHERE university_id = #{universityID}";
		
		String DELETE = "DELETE FROM exp_universities "
				+ "WHERE university_id = #{universityID}"; 
	}
	
}
