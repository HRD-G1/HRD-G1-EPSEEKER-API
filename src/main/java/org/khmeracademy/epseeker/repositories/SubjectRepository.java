package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Subject;

public interface SubjectRepository {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="subject_id", column="subjectID"),
		@Result(property="subject_name", column="subjectName"),
		@Result(property="subject_category_id", column="subjectCategoryID")
	})
	ArrayList<Subject> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="subject_id", column="subjectID"),
		@Result(property="subject_name", column="subjectName"),
		@Result(property="subject_category_id", column="subjectCategoryID")
	})
	Subject findOne();
	
	@Insert(SQL.INSERT)
	boolean save(Subject sub);
	
	@Update(SQL.UPDATE)
	boolean update(Subject sub);
	
	@Delete(SQL.DELETE)
	boolean delete(Subject sub);
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_subject";
		
		String SELECTONE = "SELECT * FROM exp_subject WHERE subject_name = #{subjectID}";
		
		String INSERT = "INSERT	INTO exp_subject (subject_name, subject_cateogry_id) values(#{subjectName}, #{subjectCategoryID})";
		
		String UPDATE = "UPDATE exp_subject SET subject_name = #{subjectName}, subject_category_id = #{subjectCategoryID} WHERE subject_id = #{subjectID}";
		
		String DELETE = "DELETE exp_subject WHERE subject_id = #{subjectID}";
	}
	
}
