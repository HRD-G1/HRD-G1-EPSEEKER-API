package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Language;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="languageID", column="language_id"),
		@Result(property="languageName", column="language_name"),
		@Result(property="languageDescription", column="language_description")
	})
	ArrayList<Language> findAll(@Param("limit")int limit, @Param("offset")int offset);
	
	@Select(SQL.SELECT_COUNT)
	long findAllAndCount();
	
	@Insert(SQL.INSERT)
	boolean save(Language lang);
	
	@Update(SQL.UPDATE)
	boolean update(Language lang);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("languageID")int languageID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_language LIMIT #{limit} OFFSET #{offset}";
		
		String SELECT_COUNT = "SELECT COUNT(*) FROM exp_language";
		
		String SELECTONE = "SELECT * FROM exp_language WHERE language_id = #{languageID}";
		
		String INSERT = "INSERT INTO exp_language "
				+ "(language_name, language_description) "
				+ "VALUES(#{languageName}, #{languageDescription})";
		
		String UPDATE = "UPDATE exp_language SET "
				+ "language_name = #{languageName}, "
				+ "language_description = #{languageDescription} "
				+ "WHERE language_id = #{languageID}";
		
		String DELETE = "DELETE FROM exp_language "
				+ "WHERE language_id = #{languageID}";
		
	}
	
}
