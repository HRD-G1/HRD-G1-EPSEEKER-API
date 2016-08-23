package org.khmeracademy.epseeker.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.epseeker.entities.Role;
import org.khmeracademy.epseeker.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
	@Select("SELECT * FROM exp_user_ka WHERE user_email=#{userEmail}" )	
	@Results(value={
			@Result(property="id",column="user_id"),
			@Result(property="password",column="user_password"),
			@Result(property="email",column="user_email"),
			@Result(property="username",column="user_username"),
			@Result(property="status",column="user_status"),
			@Result(property="roles",column="user_id",
				many=@Many(select="findUserByUserID"))
	})
public User loadUserByUsername(@Param("userEmail") String userEmail);
		
@Select("SELECT * FROM exp_user_role WHERE role_id=#{roleID}")
@Results({
		@Result(property="id",column="role_id"),
		@Result(property="roleName",column="role_name")
})
public List<Role> findUserByUserID(@Param("roleID") int roleID);


}

