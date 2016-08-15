package org.khmeracademy.epseeker.repositories.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class ExpertProvider {
	
	public String selectOneExpertByID(Map<String, Object> obj){
		
		int expertID = (int) obj.get("param1");
		
		String sql = new SQL(){{			
			SELECT("*");
			FROM("exp_expert");
			WHERE("expert_id = " + expertID);
		}}.toString();
		
		return sql;
	}
	
	
}
