package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.repositories.provider.ExpertProvider;

public interface ExpertRespository {

	
	//@SelectProvider(type=ExpertProvider.class, method="selectExpert")
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="expertFirstName", column="expert_firstname"),
		@Result(property="expertLastName", column="expert_lastname"),
		@Result(property="expertPhone1", column="expert_phone1"),
		@Result(property="expertPhoto", column="expert_photo"),
		@Result(property="expertStatus", column="expert_status"),
		@Result(property="expertPhone2", column="expert_phone2"),
		@Result(property="expertEmail", column="expert_email"),
		@Result(property="expertGeneration", column="expert_generation"),
		@Result(property="expertAdvanceCourse", column="expert_advance_course"),
		@Result(property="expertGender", column="expert_gender")
	})
	ArrayList<Expert> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="expertFirstName", column="expert_firstname"),
		@Result(property="expertLastName", column="expert_lastname"),
		@Result(property="expertPhone1", column="expert_phone1"),
		@Result(property="expertPhoto", column="expert_photo"),
		@Result(property="expertStatus", column="expert_status"),
		@Result(property="expertPhone2", column="expert_phone2"),
		@Result(property="expertEmail", column="expert_email"),
		@Result(property="expertGeneration", column="expert_generation"),
		@Result(property="expertAdvanceCourse", column="expert_advance_course"),
		@Result(property="expertGender", column="expert_gender")
	})
	Expert findOne(@Param("expertID") int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(Expert exp);
	
	@Update(SQL.UPDATE)
	boolean update(Expert exp);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID);
	
	@SelectProvider(type=ExpertProvider.class, method = "selectExpert")
	boolean test(@Param("a") int a, @Param("b") int b);
	
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_expert";
		
		String SELECTONE = "SELECT * FROM expert_expert WHERE expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO "
				+ "exp_expert "
				+ "(expert_firstname, expert_lastname, expert_phone1, expert_photo, expert_status, expert_phone2, expert_email, expert_generation, expert_advance_course, expert_gender) "
				+ "VALUES(#{expertFirstName}, #{expertLastName}, #{expertPhone1}, #{expertPhoto}, #{expertStatus}, #{expertPhone2}, #{expertEmail}, #{expertGeneration}, #{expertAdvanceCourse}, #{expertGender})";
		
		String UPDATE = "UPDATE exp_expert SET "
				+ "expert_firstname  = #{expertFirstName}, "
				+ "expert_lastname = #{expertLastName}, "
				+ "expert_phone1 = #{expertPhone1}, "
				+ "expert_photo = #{expertPhoto}, "
				+ "expert_status = #{expertStatus}, "
				+ "expert_phone2 = #{expertPhone2}, "
				+ "expert_email = #{expertEmail}, "
				
				
				+ "expert_generation  = #{expertGeneration}, "
				+ "expert_advance_course = #{expertAdvanceCourse}, "
				+ "expert_gender = #{expertGender} "
				+ "WHERE expert_id = #{expertID}";
		
		String DELETE = "DELETE FROM exp_expert "
				+ "WHERE expert_id = #{expertID}";
		
	}
	
}
