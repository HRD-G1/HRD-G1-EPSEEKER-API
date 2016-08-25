package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Role;
import org.khmeracademy.epseeker.repositories.RoleRepository;
import org.khmeracademy.epseeker.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepostitory;

	@Override
	public ArrayList<Role> findAll() {
		try{
			return roleRepostitory.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
