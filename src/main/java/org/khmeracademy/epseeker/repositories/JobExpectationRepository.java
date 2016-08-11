package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.JobExpectation;
import org.springframework.stereotype.Repository;

@Repository
public interface JobExpectationRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="minSalary", column="min_salary"),
		@Result(property="location", column="location"),
		@Result(property="maxSalary", column="max_salary")
	})
	ArrayList<JobExpectation> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(JobExpectation jobExpectation);
	
	@Update(SQL.UPDATE)
	boolean update(JobExpectation jobExpectation);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("positionID")int positionID);
	

	interface SQL{
		
		String SELECT = "SELECT * FROM "
				+ "exp_job_expectation";
		
		String INSERT = "INSERT INTO "
				+ "exp_job_expectation "
				+ "(expert_id, position_id, min_salary, location, max_salary) "
				+ "VALUES(#{expertID}, #{positionID}, #{minSalary}, #{location}, #{maxSalary})";
		
		String UPDATE = "UPDATE exp_job_expectation SET "
				+ "min_salary = #{minSalary}, "
				+ "location = #{location}, "
				+ "max_salary = #{maxSalary} "
				+ "WHERE "
				+ "expert_id = #{expertID} AND "
				+ "position_id = #{positionID}";
		
		String DELETE = "DELETE FROM exp_job_expectation "
				+ "WHERE "
				+ "expert_id = #{expertID} AND "
				+ "position_id = #{positionID}";
		
	}
	
}
