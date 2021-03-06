package org.khmeracademy.epseeker.entities;

import java.util.List;

public class User{

//@JsonProperty("USER_ID")
private int id;
//@JsonProperty("USER_EMAIL")
private String email;
//@JsonProperty("USER_PASSWORD")
private String password;
//@JsonProperty("USER_USERNAME")
private String username;
//@JsonProperty("USER_STATUS")
private boolean status;
//@JsonProperty("USER_IMAGE")
/*private String image;*/
private String gender;
private String dob;
private String phone; 
//@JsonProperty("USER_ROLES")
private List<Role> roles;

//@JsonProperty("ACCOUNT_NON_EXPIRED")
private boolean accountNonExpired=true;
//@JsonProperty("ACCOUNT_NON_LOCKED")
private boolean accountNonLocked=true;
//@JsonProperty("CREDENTIALS_NON_EXPIRED")
private boolean credentialsNonExpired=true;
//@JsonProperty("ENABLED")
private boolean enabled =true;

public List<Role> getRoles() {
	return roles;
}

public void setRoles(List<Role> roles) {
	this.roles = roles;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPassword(){
	return this.password;
}

public void setUsername(String username) {
	this.username = username;
}
public String getUsername()
{
	return username;
}

public boolean getStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}


/*
public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}
*/
@Override
public String toString() {
	return "User [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username + ", status="
			+ status + ", roles=" + roles + ", accountNonExpired=" + accountNonExpired
			+ ", accountNonLocked=" + accountNonLocked + ", credentialsNonExpired=" + credentialsNonExpired
			+ ", enabled=" + enabled + "]";
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

}
