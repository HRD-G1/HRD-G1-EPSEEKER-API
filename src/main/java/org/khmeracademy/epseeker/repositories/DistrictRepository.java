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
	@Results({
		@Result(property="districtID", column="district_id"),
		@Result(property="districtName", column="district_name"),
		@Result(property="cityOrProvinceID", column="province_id")
	})
	ArrayList<District> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(District district);
	
	@Update(SQL.UPDATE)
	boolean update(District district);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("distictID")int districtID);

	interface SQL{
		String SELECT = "SELECT * FROM exp_districts";
		
		String INSERT = "INSERT INTO exp_districts "
				+ "(district_name, province_id) "
				+ "VALUES(#{districtName}, #{cityOrProvinceID})";
		
		String UPDATE = "UPDATE exp_districts SET "
				+ "district_name = #{districtName}, "
				+ "province_id = #{cityOrProvinceID} "
				+ "WHERE "
				+ "district_id = #{districtID}";
		
		String DELETE = "DELETE FROM exp_districts "
				+ "WHERE district_id = #{districtID}";
	}
	
}
