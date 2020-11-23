package com.quiz.challenge.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.challenge.application.entity.User;
import com.quiz.challenge.application.repositories.UserRepository;
import com.quiz.challenge.application.service.UserService;
import com.quiz.challenge.application.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired 
	private UserRepository userRepository;
	

	// GET /users
	@GetMapping(path ="/users") //Maps this URI and returns User instance
	public Iterable<User> retrieveAllUsers(){
		User users = new User(); 
		users.setId(1);
		users.setEmailAddress("bradrollings123@gmail.com");
		users.setRole("Admin");
		return userServiceImpl.findAll();
	}	
	
	@GetMapping(path ="/create") 
	public Iterable<User> retrieveUser() {
		User users = new User(); 
		users.setId(1);
		users.setEmailAddress("bradrollings123@gmail.com");
		users.setRole("Admin");
		
		userRepository.save(users); 
		return userRepository.findAll(); 
	}
}
