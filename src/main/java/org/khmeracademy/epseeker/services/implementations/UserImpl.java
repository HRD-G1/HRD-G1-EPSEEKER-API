package org.khmeracademy.epseeker.services.implementations;

import java.util.List;

import org.khmeracademy.epseeker.entities.Role;
import org.khmeracademy.epseeker.entities.User;
import org.khmeracademy.epseeker.repositories.UserRepository;
import org.khmeracademy.epseeker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public User findUserById(int userId) {
	
		return userRepository.findUserByID(userId);
	}

	@Override
	@Transactional
	public boolean save(User user) {
		try{
			//TODO: 1- INSERT INTO TABLE USER
			userRepository.save(user);
			//TODO: 2- LOOP INSERT INTO TABLE USER ROLE DETAILS
			for(Role role: user.getRoles()){
				userRepository.saveUserRoleDetails(user.getId(), role.getId());
			}
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}


}
