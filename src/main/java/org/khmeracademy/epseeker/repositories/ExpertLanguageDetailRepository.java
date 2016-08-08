package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertLanguageDetailRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="languageID", column="language_id"),
		@Result(property="mention", column="mention")
	})
	ArrayList<ExpertLanguageDetail> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(ExpertLanguageDetail expertLanguageDetail);
	
	@Update(SQL.UPDATE)
	boolean update(ExpertLanguageDetail expertLanguageDetail);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("languageID")int languageID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_expert_language_detail";
		
		String INSERT = "INSERT INTO exp_expert_language_detail "
				+ "(expert_id, language_id, mention) "
				+ "VALUES(#{expertID}, #{languageID}, #{mention})";
		
		String UPDATE = "UPDATE exp_expert_language_detail"
				+ " SET "
				+ "mention = #{mention}"
				+ " WHERE expert_id = #{expertID} AND language_id = #{languageID}";
		
		String DELETE = "DELETE FROM exp_expert_language_detail"
				+ " WHERE expert_id = #{expertID} AND language_id = #{languageID}";
	}
	
}
