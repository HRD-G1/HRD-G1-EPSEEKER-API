package org.khmeracademy.epseeker.services;

import java.util.List;

import org.khmeracademy.epseeker.entities.Role;
import org.khmeracademy.epseeker.entities.User;

public interface UserService {
	public User loadUserByUsername(String userEmail);
	public List<Role> findUserByUserID(int roleID);
}
