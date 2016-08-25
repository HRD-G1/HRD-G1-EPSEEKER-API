package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.epseeker.entities.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="id", column="role_id"),
		@Result(property="roleName", column="role_name")
	})
	ArrayList<Role> findAll();
	
	interface SQL{
		String SELECT = "SELECT "
						+ "* " 
						+ "FROM "
						+ "exp_user_role ";		
}

}