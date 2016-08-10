package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.CurrentJob;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentJobSRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="institutionID", column="institution_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="salary", column="salary"),
		@Result(property="institutionPhone", column="institution_phone"),
		@Result(property="institutionEmail", column="institution_email")
	})
	ArrayList<CurrentJob> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(CurrentJob currentJob);
	
	@Update(SQL.UPDATE)
	boolean update(CurrentJob currentJob);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("institutionID")int institutionID, @Param("positionID")int positionID);

	interface SQL{
		
		String SELECT = "SELECT * FROM exp_current_job";
		
		String INSERT = "INSERT INTO exp_current_job "
				+ "(expert_id, institution_id, position_id, salary, institution_phone, institution_email) "
				+ "VALUES(#{expertID}, #{institutionID}, #{positionID}, #{salary}, #{institutionPhone}, #{institutionEmail})";
		
		String UPDATE = "UPDATE exp_current_job SET "
				+ "expert_id = #{expertID},"
				+ "institution_id = #{institutionID},"
				+ "position_id = #{positionID},"
				+ "salary = #{salary},"
				+ "institution_phone = #{institutionPhone},"
				+ "institution_email = #{institutionEmail} "
				+ "WHERE expert_id = #{expertID} "
				+ "AND institution_id = #{institutionID} "
				+ "AND position_id = #{positionID}";
		
		String DELETE = "DELETE FROM exp_current_job "
				+ "WHERE expert_id = #{expertID} "
				+ "AND institution_id = #{institutionID} "
				+ "AND position_id = #{positionID}";
	}
	
}