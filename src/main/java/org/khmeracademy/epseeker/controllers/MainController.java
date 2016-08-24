package org.khmeracademy.epseeker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	
	/*@RequestMapping(value="/api/epseeker-ws")
	public String webService()
	{
		return "swagger";
	}
	*/
	/*error*/
	@RequestMapping(value="/401")
	public String notFoundPage()
	{
		return "/error/401";
	}
	@RequestMapping(value="/access-denied")
	public String accessDenied()
	{
		return "/error/403";
	}
	
	
}
