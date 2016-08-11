package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.CurrentAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentAddressRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="districtID", column="district_id"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="countryID", column="country_id")
	})
	ArrayList<CurrentAddress> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="districtID", column="district_id"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="countryID", column="country_id")
	})
	CurrentAddress findOne(@Param("expertID")int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(CurrentAddress currentAddress);
	
	@Update(SQL.UPDATE)
	boolean update(CurrentAddress currentAddress);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_current_address";
		
		String SELECTONE = "SELECT * FROM exp_current_address "
				+ "WHERE expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO exp_current_address "
				+ "(expert_id, commune_id, district_id, city_or_province_id, country_id) "
				+ "VALUES(#{expertID}, #{communeID}, #{districtID}, #{cityOrProvinceID}, #{countryID})";
		
		String UPDATE = "UPDATE exp_current_address SET "
				+ "commune_id = #{communeID}, "
				+ "district_id = #{districtID},"
				+ "city_or_province_id = #{cityOrProvinceID},"
				+ "country_id = #{countryID} "
				+ "WHERE expert_id = #{expertID}";


		String DELETE = "DELETE FROM exp_current_address "
				+ "WHERE expert_id = #{expertID}";
	}
	
}
