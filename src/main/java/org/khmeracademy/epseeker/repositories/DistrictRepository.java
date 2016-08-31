package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.District;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository {

	@Select(SQL.SELECT)
	@Results({ @Result(property = "districtID", column = "district_id"),
			@Result(property = "districtName", column = "district_name"),
			@Result(property = "cityOrProvinceID", column = "province_id"),
			@Result(property = "cityOrProvinceName", column = "city_or_province_name"),
			@Result(property = "countryName", column = "country_name"),
			@Result(property="countryID", column="country_id")
	})
	ArrayList<District> findAll(@Param("limit")int limit, @Param("offset")int offset);
	
	@Select(SQL.SELECT_COUNT)
	long findAllAndCount();
	
	@Select(SQL.SELECT_ALL_BY_PROVINCE_ID)
	@Results({ @Result(property = "districtID", column = "district_id"),
			@Result(property = "districtName", column = "district_name"),
			@Result(property = "cityOrProvinceID", column = "province_id"),
			@Result(property = "cityOrProvinceName", column = "city_or_province_name"),
			@Result(property = "countryName", column = "country_name"),
			@Result(property="countryID", column="country_id")
	})
	ArrayList<District> findAllByProvinceID(@Param("provinceID")int provinceID);

	@Insert(SQL.INSERT)
	boolean save(District district);

	@Update(SQL.UPDATE)
	boolean update(District district);

	@Delete(SQL.DELETE)
	boolean delete(@Param("districtID") int districtID);

	interface SQL {
		String SELECT = "SELECT di.*, ci.city_or_province_name, co.* "
				+ "FROM exp_countries co " + "INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+ "INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id LIMIT #{limit} OFFSET #{offset}";
		
		String SELECT_COUNT = "SELECT COUNT(*) "
				+ "FROM exp_countries co " + "INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+ "INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id";
		
		String SELECT_ALL_BY_PROVINCE_ID = "SELECT di.*, ci.city_or_province_name, co.* "
				+"FROM exp_countries co "
				+"INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+"INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id "
				+"WHERE ci.city_or_province_id = #{provinceID}";

		String INSERT = "INSERT INTO exp_districts " + "(district_name, province_id) "
				+ "VALUES(#{districtName}, #{cityOrProvinceID})";

		String UPDATE = "UPDATE exp_districts SET " + "district_name = #{districtName}, "
				+ "province_id = #{cityOrProvinceID} " + "WHERE " + "district_id = #{districtID}";

		String DELETE = "DELETE FROM exp_districts " + "WHERE district_id = #{districtID}";
	}

}
