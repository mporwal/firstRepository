package com.yash.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController{
	//in value url pattern we give what we want
	@RequestMapping(value="/registration.htm" ,method= RequestMethod.GET)
	protected ModelAndView registerHere(){
		ModelAndView modelAndView=new ModelAndView("registration");//this is secured page name
		return modelAndView;
	}
	
	@RequestMapping(value="/showUserDetails.htm", method=RequestMethod.POST)
	protected ModelAndView showUserdetails(@RequestParam("userName")String userName,@RequestParam("email")String email,@RequestParam("contact")String contact){
		
			User user=new User();
			user.setUserName(userName);
			user.setEmail(email);
			user.setContact(contact);
			ModelAndView modelAndView=new ModelAndView("showUserDetails");
			modelAndView.addObject("user", user);
		
		return modelAndView;
		
	}
	



}
