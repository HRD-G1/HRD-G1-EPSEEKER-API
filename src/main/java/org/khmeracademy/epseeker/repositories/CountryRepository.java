package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="countryID", column="country_id"),
		@Result(property="countryName", column="country_name")
	})
	ArrayList<Country> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(Country country);
	
	@Update(SQL.UPDATE)
	boolean update(Country country);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("countryID")int countryID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_countries";
		
		String INSERT = "INSERT INTO exp_countries "
				+ "(country_name) "
				+ "VALUES(#{countryName})";
		
		String UPDATE = "UPDATE exp_countries SET "
				+ "country_name = #{countryName} "
				+ "WHERE country_id = #{countryID}";
		
		String DELETE = "DELETE FROM exp_countries "
				+ "WHERE country_id = #{countryID}";
	}
	
}
