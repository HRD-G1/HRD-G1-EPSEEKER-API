package org.khmeracademy.epseeker.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Role{

	private static final long serialVersionUID = 1L;
	//@JsonProperty("ROLE_ID")
	private int id;
	//@JsonProperty("ROLE_NAME")
	private String roleName;
	

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
