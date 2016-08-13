package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.POB;
import org.springframework.stereotype.Repository;

@Repository
public interface POBRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="districtID", column="district_id"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="countryID", column="country_id")
	})
	ArrayList<POB> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="districtID", column="district_id"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="countryID", column="country_id")
	})
	POB findOne(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ONE_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="communeName", column="commune_name"),
		@Result(property="districtID", column="district_id"),
		@Result(property="districtName", column="district_name"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="cityOrProvinceName", column="city_or_province_name"),
		@Result(property="countryID", column="country_id"),
		@Result(property="countryName", column="country_name")
	})
	POB findOneByExpertID(@Param("expertID")int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(POB pob);
	
	@Update(SQL.UPDATE)
	boolean update(POB pob);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_pob";
		
		String SELECTONE = "SELECT * FROM exp_pob "
				+ "WHERE expert_id = #{expertID}";
		
		String SELECT_ONE_BY_EXPERT_ID = "SELECT pob.*, ccc.country_name, cit.city_or_province_name, dis.district_name, com.commune_name "
				+"FROM exp_pob as pob " 
				+"INNER JOIN exp_city_or_provinces as cit ON pob.city_or_province_id = cit.city_or_province_id "
				+"INNER JOIN exp_districts as dis ON dis.district_id = pob.district_id "
				+"INNER JOIN exp_communes as com ON pob.commune_id = com.commune_id "
				+"INNER JOIN exp_countries as ccc ON ccc.country_id = pob.country_id "
				+"WHERE pob.expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO exp_pob "
				+ "(expert_id, commune_id, district_id, city_or_province_id, country_id) "
				+ "VALUES(#{expertID}, #{communeID}, #{districtID}, #{cityOrProvinceID}, #{countryID})";
		
		String UPDATE = "UPDATE exp_pob SET "
				+ "commune_id = #{communeID}, "
				+ "district_id = #{districtID},"
				+ "city_or_province_id = #{cityOrProvinceID},"
				+ "country_id = #{countryID} "
				+ "WHERE expert_id = #{expertID}";


		String DELETE = "DELETE FROM exp_pob "
				+ "WHERE expert_id = #{expertID}";
	}
	
}
