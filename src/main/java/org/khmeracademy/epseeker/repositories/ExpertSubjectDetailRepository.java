package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.ExpertSubjectDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertSubjectDetailRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="subjectID", column="subject_id"),
		@Result(property="expertSubjectDetailLevel", column="expert_subject_detail_level")
	})
	ArrayList<ExpertSubjectDetail> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(ExpertSubjectDetail expertSubjectDetail);
	
	@Update(SQL.UPDATE)
	boolean update(ExpertSubjectDetail expertSubjectDetail);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID") int expertID, @Param("subjectID") int subjectID);
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_expert_subject_detail";
		
		String INSERT = "INSERT INTO exp_expert_subject_detail"
				+ "(expert_id, subject_id, expert_subject_detail_level)"
				+ "VALUES(#{expertID}, #{subjectID}, #{expertSubjectDetailLevel})";
		
		String UPDATE = "UPDATE exp_expert_subject_detail SET "
				+ "expert_subject_detail_level = #{expertSubjectDetailLevel} "
				+ "WHERE expert_id = #{expertID} AND subject_id = #{subjectID}" ;
		
		String DELETE = "DELETE FROM exp_expert_subject_detail "
				+ " WHERE expert_id = #{expertID} AND subject_id = #{subjectID}";
		
	}
	
}
