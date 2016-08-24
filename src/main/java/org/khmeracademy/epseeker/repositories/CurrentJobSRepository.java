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
	
	@Select(SQL.SELECT_ALL_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="institutionID", column="institution_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="salary", column="salary"),
		@Result(property="institutionPhone", column="institution_phone"),
		@Result(property="institutionEmail", column="institution_email"),
		@Result(property="institutionName", column="institution_name"),
		@Result(property="institutionAddress", column="institution_address"),
		@Result(property="positionName", column="position_name")
	})
	ArrayList<CurrentJob> findAllByExpertID(@Param("expertID")int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(CurrentJob currentJob);
	
	@Update(SQL.UPDATE)
	boolean update(CurrentJob currentJob);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("institutionID")int institutionID, @Param("positionID")int positionID);

	interface SQL{
		
		String SELECT = "SELECT * FROM exp_current_job";
		
		String SELECT_ALL_BY_EXPERT_ID = "SELECT * "
				+ "FROM exp_current_job as cur "
				+ "INNER JOIN exp_institutions as ints ON cur.institution_id = ints.institution_id "
				+ "INNER JOIN exp_positions as pos ON cur.position_id = pos.position_id "
				+ "WHERE cur.expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO exp_current_job "
				+ "(expert_id, institution_id, position_id, salary, institution_phone, institution_email, institution_address) "
				+ "VALUES(#{expertID}, #{institutionID}, #{positionID}, #{salary}, #{institutionPhone}, #{institutionEmail}, #{institutionAddress})";
		
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