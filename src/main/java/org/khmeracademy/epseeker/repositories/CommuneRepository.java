package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Commune;
import org.springframework.stereotype.Repository;

@Repository
public interface CommuneRepository {

	@Select(SQL.SELECT)
	@Results({ @Result(property = "communeID", column = "commune_id"),
			@Result(property = "communeName", column = "commune_name"),
			@Result(property = "districtID", column = "district_id"),
			@Result(property = "districtName", column = "district_name"),
			@Result(property = "cityOrProvinceID", column = "city_or_province_id"),
			@Result(property = "cityOrProvinceName", column = "city_or_province_name"),
			@Result(property = "countryID", column = "country_id"),
			@Result(property = "countryName", column = "country_name") })
	ArrayList<Commune> findAll(@Param("limit")int limit, @Param("offset")int offset);
	
	@Select(SQL.SELECT_COUNT)
	Long findAllAndCount();

	@Select(SQL.SELECT_ALL_BY_DISTRICT_ID)
	@Results({ @Result(property = "communeID", column = "commune_id"),
			@Result(property = "communeName", column = "commune_name"),
			@Result(property = "districtID", column = "district_id"),
			@Result(property = "districtName", column = "district_name"),
			@Result(property = "cityOrProvinceID", column = "city_or_province_id"),
			@Result(property = "cityOrProvinceName", column = "city_or_province_name"),
			@Result(property = "countryID", column = "country_id"),
			@Result(property = "countryName", column = "country_name") })
	ArrayList<Commune> findAllByDistrictID(@Param("districtID") int districtID);

	@Insert(SQL.INSERT)
	boolean save(Commune commune);

	@Update(SQL.UPDATE)
	boolean update(Commune commune);

	@Delete(SQL.DELETE)
	boolean delete(@Param("communeID") int communeID);

	interface SQL {
		String SELECT = "SELECT com.*, di.district_name, ci.city_or_province_id, ci.city_or_province_name, co.* "
				+ "FROM exp_countries co " + "INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+ "INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id "
				+ "INNER JOIN exp_communes com ON com.district_id = di.district_id " + " LIMIT #{limit} " // 10
				+ "OFFSET #{offset} "; // 40;

		String SELECT_COUNT = "SELECT COUNT(*) " + "FROM exp_countries co "
				+ "INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+ "INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id "
				+ "INNER JOIN exp_communes com ON com.district_id = di.district_id";

		String SELECT_ALL_BY_DISTRICT_ID = "SELECT " + "com.*, di.district_name, " + "ci.city_or_province_id, "
				+ "ci.city_or_province_name, " + "co.* " + "FROM " + "exp_countries co "
				+ "INNER JOIN exp_city_or_provinces ci ON co.country_id = ci.country_id "
				+ "INNER JOIN exp_districts di ON di.province_id = ci.city_or_province_id "
				+ "INNER JOIN exp_communes com ON com.district_id = di.district_id "
				+ "WHERE di.district_id = #{districtID}";

		String INSERT = "INSERT INTO exp_communes " + "(commune_name, district_id) "
				+ "VALUES(#{communeName}, #{districtID})";

		String UPDATE = "UPDATE exp_communes SET " + "commune_name = #{communeName}, " + "district_id = #{districtID} "
				+ "WHERE commune_id = #{communeID}";

		String DELETE = "DELETE FROM exp_communes " + "WHERE commune_id = #{communeID}";
	}

}
