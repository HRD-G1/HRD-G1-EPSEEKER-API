package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.CityOrProvince;
import org.springframework.stereotype.Repository;

@Repository
public interface CityOrProvinceReposity {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="cityOrProvinceName", column="city_or_province_name"),
		@Result(property="countryID", column="country_id")
	})
	ArrayList<CityOrProvince> findAll();
	
	@Select(SQL.SELECTAllBYCOUNTRY)
	@Results({
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="cityOrProvinceName", column="city_or_province_name"),
		@Result(property="countryID", column="country_id")
	})
	ArrayList<CityOrProvince> findAllByCountry(@Param("countryID")int countryID);
	
	@Insert(SQL.INSERT)
	boolean save(CityOrProvince cityOrProvince);
	
	@Update(SQL.UPDATE)
	boolean update(CityOrProvince cityOrProvince);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("cityOrProvinceID")int cityOrProvinceID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_city_or_provinces";
		
		String SELECTAllBYCOUNTRY = "SELECT * FROM exp_city_or_provinces "
				+ "WHERE country_id = #{countryID}";
		
		String INSERT = "INSERT INTO exp_city_or_provinces "
				+ "(city_or_province_name, country_id) "
				+ "VALUES(#{cityOrProvinceName}, #{countryID})";
		
		String UPDATE = "UPDATE exp_city_or_provinces SET "
				+ "city_or_province_name = #{cityOrProvinceName},"
				+ "country_id = #{countryID} "
				+ "WHERE city_or_province_id = #{cityOrProvinceID}";
		
		String DELETE = "DELETE FROM exp_city_or_provinces "
				+ "WHERE city_or_province_id = #{cityOrProvinceID}";
	}
	
}
