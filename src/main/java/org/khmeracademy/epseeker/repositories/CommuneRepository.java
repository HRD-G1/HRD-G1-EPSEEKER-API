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
	@Results({
		@Result(property="communeID", column="commune_id"),
		@Result(property="communeName", column="commune_name"),
		@Result(property="districtID", column="district_id")
	})
	ArrayList<Commune> findAll();
	
	@Insert(SQL.INSERT)
	boolean save(Commune commune);
	
	@Update(SQL.UPDATE)
	boolean update(Commune commune);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("communeID")int communeID);

	interface SQL{
		String SELECT = "SELECT * FROM "
				+ "exp_communes";
		
		String INSERT = "INSERT INTO exp_communes "
				+ "(commune_name, district_id) "
				+ "VALUES(#{communeName}, #{districtID})";
		
		String UPDATE = "UPDATE exp_communes SET "
				+ "commune_name = #{communeName}, "
				+ "district_id = #{districtID} "
				+ "WHERE commune_id = #{communeID}";
		
		String DELETE = "DELETE FROM exp_communes "
				+ "WHERE commune_id = #{communeID}";
	}
	
}
