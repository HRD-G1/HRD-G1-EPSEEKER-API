package org.khmeracademy.epseeker.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
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
			@Result(property="gender",column="user_gender"),
			@Result(property="dob",column="user_dob"),
			@Result(property="phone",column="user_phone"),
			@Result(property="roles",column="user_id",
				many=@Many(select="findUserByUserID"))
	})
public User loadUserByUsername(@Param("userEmail") String userEmail);
		
@Select("SELECT r.role_id,r.role_name FROM exp_user_role r INNER JOIN exp_user_ka_detail u ON r.role_id = u.role_id  WHERE u.user_id=#{userid}")
@Results({
		@Result(property="id",column="role_id"),
		@Result(property="roleName",column="role_name")
})
public List<Role> findUserByUserID(@Param("userid") int userid);

@Select("SELECT * FROM exp_user_ka WHERE user_id=#{userId}" )	
@Results(value={
		@Result(property="id",column="user_id"),
		@Result(property="password",column="user_password"),
		@Result(property="email",column="user_email"),
		@Result(property="username",column="user_username"),
		@Result(property="status",column="user_status"),
		@Result(property="gender",column="user_gender"),
		@Result(property="dob",column="user_dob"),
		@Result(property="phone",column="user_phone")
		/*@Result(property="image",column="user_image")*/
})
public User findUserByID(@Param("userId") int userId);


@Insert("INSERT INTO "
		+ " exp_user_ka"
		+ " ("
		+ " user_username,"
		+ " user_email,"
		+ " user_password,"
		+ " user_status,"
		+ " user_gender,"
		+ " user_dob,"
		+ "	user_phone"
		+ " ) "
		+ " VALUES(#{username}, #{email},#{password},#{status},#{gender},#{dob},#{phone})")
/*		+ " user_image"*/
		/*+ "VALUES(#{username}, #{email},#{password},#{status},#{image})")*/
@SelectKey(statement="SELECT last_value FROM exp_user_ka_user_id_seq", keyProperty="id", before=false, resultType=int.class)
public boolean save(User user);

@Insert("INSERT INTO "
		+ "exp_user_ka_detail"
		+ "(user_id,role_id) "
		+ "VALUES(#{userId},#{roleId})")
public boolean saveUserRoleDetails(@Param("userId") int userId,@Param("roleId") int roleId);

@Update("UPDATE exp_user_ka SET "
		+ " user_username = #{username}, "
		+ " user_email= #{email}, "
		+ " user_password = #{password}, "
		+ " user_status='true',"
		+ " user_gender=#{gender},"
		+ " user_dob = #{dob},"
		+ " user_phone = #{phone}"
		/*+ " user_image = #{image}"*/
		+ " WHERE user_id = #{id}")
public boolean update(User user);
}

