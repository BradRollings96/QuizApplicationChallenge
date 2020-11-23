package com.quiz.challenge.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.quiz.challenge.application.service.QuestionServiceImpl;


@Controller
@RequestMapping("question")
public class QuestionController {

	
	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("questions", questionServiceImpl.findAll());
		return "question/index"; 
	}
}
