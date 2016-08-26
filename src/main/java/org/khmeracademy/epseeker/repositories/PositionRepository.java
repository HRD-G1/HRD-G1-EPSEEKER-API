package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.Position;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository {
	
	@Select(SQL.SELECT)
	@Results({
		@Result(property="positionID", column="position_id"),
		@Result(property="positionName", column="position_name")
	})
	ArrayList<Position> findAll(@Param("limit")int limit, @Param("offset") int offset);
	
	@Select(SQL.SELECT_COUNT)
	long findAllAndCount();
	
	@Insert(SQL.INSERT)
	boolean save(Position position);
	
	@Update(SQL.UPDATE)
	boolean update(Position position);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("positionID")int positionID);

	interface SQL{
		
		String SELECT = "SELECT * FROM exp_positions LIMIT #{limit} OFFSET #{offset}";
		
		String SELECT_COUNT = "SELECT COUNT(*) FROM exp_positions";
		
		String INSERT = "INSERT INTO exp_positions "
				+ "(position_name) VALUES(#{positionName})";
		
		String UPDATE = "UPDATE exp_positions SET "
				+ "position_name = #{positionName} "
				+ "WHERE position_id = #{positionID}";
		
		String DELETE = "DELETE FROM exp_positions "
				+ "WHERE position_id = #{positionID}";
	}
	
}
