package com.quiz.challenge.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.challenge.application.entity.User;
import com.quiz.challenge.application.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

}
