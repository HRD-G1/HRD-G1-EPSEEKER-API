package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Institution;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="institutionID", column="institution_id"),
		@Result(property="institutionName", column="institution_name"),
		@Result(property="institutionAddress", column="institution_address")
	})
	ArrayList<Institution> findAll(@Param("limit")int limit, @Param("offset")int offset);
	
	@Select(SQL.SELECT_COUNT)
	long findAllAndCount();
	
	@Insert(SQL.INSERT)
	boolean save(Institution institution);
	
	@Update(SQL.UPDATE)
	boolean update(Institution institution);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("institutionID")int institutionID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_institutions LIMIT #{limit} OFFSET #{offset}";
		
		String SELECT_COUNT = "SELECT COUNT(*) FROM exp_institutions";
		
		String INSERT = "INSERT INTO exp_institutions "
				+ "(institution_name, institution_address) "
				+ "VALUES(#{institutionName}, #{institutionAddress})";
		
		String UPDATE = "UPDATE exp_institutions SET "
				+ "institution_name = #{institutionName}, "
				+ "institution_address = #{institutionAddress} "
				+ "WHERE institution_id = #{institutionID}";
		
		String DELETE = "DELETE FROM exp_institutions "
				+ "WHERE institution_id = #{institutionID}";
	}
	
}
