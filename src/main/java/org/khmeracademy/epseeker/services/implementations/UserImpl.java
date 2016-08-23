package org.khmeracademy.epseeker.services.implementations;

import java.util.List;

import org.khmeracademy.epseeker.entities.Role;
import org.khmeracademy.epseeker.entities.User;
import org.khmeracademy.epseeker.repositories.UserRepository;
import org.khmeracademy.epseeker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User loadUserByUsername(String userEmail) {
		
		return userRepository.loadUserByUsername(userEmail);
	}

	@Override
	public List<Role> findUserByUserID(int roleID) {
	
		return userRepository.findUserByUserID(roleID);
	}


}
