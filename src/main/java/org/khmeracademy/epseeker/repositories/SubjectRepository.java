package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Subject;

public interface SubjectRepository {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="subjectID", column="subject_id"),
		@Result(property="subjectName", column="subject_name"),
		@Result(property="subjectCategoryID", column="subject_category_id")
	})
	ArrayList<Subject> findAll();
	
	@Select(SQL.SELECTWITHCONDITION)
	@Results({
		@Result(property="subjectID", column="subject_id"),
		@Result(property="subjectName", column="subject_name"),
		@Result(property="subjectCategoryID", column="subject_category_id")
	})
	ArrayList<Subject> findAllBySubjectCategory(@Param("subjectCategoryID")int subjectCategoryID);
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="subjectID", column="subject_id"),
		@Result(property="subjectName", column="subject_name"),
		@Result(property="subjectCategoryID", column="subject_category_id")
	})
	Subject findOne();
	
	@Insert(SQL.INSERT)
	boolean save(Subject sub);
	
	@Update(SQL.UPDATE)
	boolean update(Subject sub);
	
	@Delete(SQL.DELETE)
	boolean delete(int subjectID);
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_subject";
		
		String SELECTONE = "SELECT * FROM exp_subject WHERE subject_name = #{subjectID}";
		
		String SELECTWITHCONDITION = "SELECT * FROM exp_subject WHERE subject_category_id = #{subjectCategoryID}";
		
		String INSERT = "INSERT	INTO exp_subject (subject_name, subject_category_id) VALUES(#{subjectName}, #{subjectCategoryID})";
		
		String UPDATE = "UPDATE exp_subject SET subject_name = #{subjectName}, subject_category_id = #{subjectCategoryID} WHERE subject_id = #{subjectID}";
		
		String DELETE = "DELETE FROM exp_subject WHERE subject_id = #{subjectID}";
	}
	
}
