package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.SubjectCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectCategoryRepository {

	
	@Select("SELECT * FROM exp_subject_category")
	@Results({
		@Result(property="subjectCategoryID", column="subject_category_id"),
		@Result(property="subjectCategoryName", column="subject_category_name")
	})
	ArrayList<SubjectCategory> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="subjectCategoryID", column="subject_category_id"),
		@Result(property="subjectCategoryName", column="subject_category_name")
	})
	SubjectCategory findOne(@Param("subjectCategoryID")int subjectCategoryID);
	
	@Select(SQL.SELECTONEBYNAME)
	@Results({
		@Result(property="subjectCategoryID", column="subject_category_id"),
		@Result(property="subjectCategoryName", column="subject_category_name")
	})
	SubjectCategory findOneByName(@Param("subjectCategoryName")String subjectCategoryName);
	
	@Insert(SQL.INSERT)
	boolean save(SubjectCategory sub);
	
	@Update(SQL.UPDATE)
	boolean update(SubjectCategory sub);
	
	@Delete(SQL.DELETE)
	boolean delete(int subjectCategoryID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_subject_category";
		
		String SELECTONE = "SELECT * FROM exp_subject_category WHERE subject_category_id = #{subjectCategoryID}";
		
		String SELECTONEBYNAME = "SELECT * FROM exp_subject_category WHERE subject_category_name = #{subjectCategoryName}";
		
		String INSERT = "INSERT	INTO exp_subject_category (subject_category_name) values(#{subjectCategoryName})";
		
		String UPDATE = "UPDATE exp_subject_category SET subject_category_name = #{subjectCategoryName} WHERE subject_category_id = #{subjectCategoryID}";
		
		String DELETE = "DELETE FROM exp_subject_category WHERE subject_category_id = #{subjectCategoryId}";
	}
	
}

