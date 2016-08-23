package org.khmeracademy.epseeker.controllers.rest;

import org.khmeracademy.epseeker.entities.User;
import org.khmeracademy.epseeker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/getuser")
public class UserController {

	@Autowired 
	private UserService userService;
	
	//@Secured({"ROLE_ADMIN", "ROLE_USER"})
		@RequestMapping(value="", method = RequestMethod.GET)
		public User findUserByEmail(@RequestParam("email") String email){
			
			System.out.println("=>api: " + email);
			User user = userService.loadUserByUsername(email);
			System.out.println(user);
			return user;
		}
	/*
	@RequestMapping(value="/rest/getuser/{email}",method =  RequestMethod.GET)
	public User getUser(@RequestParam("email") String email)
	{
		return userService.loadUserByUsername(email);
	}
	
	@RequestMapping(value="/rest/getrolebyid/{roleid}",method = RequestMethod.GET)
	public List<Role> getRole(@RequestParam("roleID")int roleID)
	{
		return userService.findUserByUserID(roleID);
	}*/
}
