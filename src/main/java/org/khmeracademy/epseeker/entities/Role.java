package org.khmeracademy.epseeker.entities;


public class Role{

	/*@JsonProperty("ROLE_ID")*/
	private int id;
	/*@JsonProperty("ROLE_NAME")*/
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
