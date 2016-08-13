package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Major;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="majorID", column="major_id"),
		@Result(property="majorName", column="major_name")
	})
	ArrayList<Major> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(Major maj);
	
	@Update(SQL.UPDATE)
	boolean update(Major maj);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("majorID")int majorID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_major";
		
		String INSERT = "INSERT INTO exp_major "
				+ "(major_name) "
				+ "VALUES(#{majorName})";
		
		String UPDATE = "UPDATE exp_major SET "
				+ "major_name = #{majorName} "
				+ "WHERE major_id = #{majorID}";
		
		String DELETE = "DELETE FROM exp_major "
				+ "WHERE major_id = #{majorID}";
	}
	
}
