package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.khmeracademy.epseeker.entities.Subject;
import org.khmeracademy.epseeker.entities.SubjectCategory;
import org.khmeracademy.epseeker.repositories.provider.SubjectCategoryProvider;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectCategoryRepository {

	
	@Select("SELECT * FROM exp_subject_category")
	@Results({
		@Result(property="subjectCategoryID", column="subject_category_id"),
		@Result(property="subjectCategoryName", column="subject_category_name"),
		@Result(property="subjects", javaType=List.class, column="subject_category_id", //new
			many = @Many(select="findAllBySubjectCategory"))//new
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
	
	@UpdateProvider(type=SubjectCategoryProvider.class, method="updateSubject")
	boolean update(SubjectCategory sub);
	
	@Delete(SQL.DELETE)
	boolean delete(int subjectCategoryID);
	
	
	//new
	@Select(SQL.SELECT_WITH_CONDITION)
	@Results({
		@Result(property="subjectID", column="subject_id"),
		@Result(property="subjectName", column="subject_name"),
		@Result(property="subjectCategoryID", column="subject_category_id")
	})
	ArrayList<Subject> findAllBySubjectCategory(@Param("subject_category_id")int subjectCategoryID);
	//new
	
	
	interface SQL{
		
		String SELECT_WITH_CONDITION = "SELECT * FROM exp_subject WHERE subject_category_id = #{subject_category_id}";
		
		String SELECT = "SELECT * FROM exp_subject_category";
		
		String SELECTONE = "SELECT * FROM exp_subject_category WHERE subject_category_id = #{subjectCategoryID}";
		
		String SELECTONEBYNAME = "SELECT * FROM exp_subject_category WHERE subject_category_name = #{subjectCategoryName}";
		
		String INSERT = "INSERT	INTO exp_subject_category (subject_category_name) values(#{subjectCategoryName})";
		
		String UPDATE = "UPDATE exp_subject_category SET subject_category_name = #{subjectCategoryName} WHERE subject_category_id = #{subjectCategoryID}";
		
		String DELETE = "DELETE FROM exp_subject_category WHERE subject_category_id = #{subjectCategoryId}";
	}
	
}

