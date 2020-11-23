package com.quiz.challenge.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.challenge.application.entity.Question;
import com.quiz.challenge.application.repositories.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository QuestionRepository;
	
	@Override
	public Iterable<Question> findAll() {
		return QuestionRepository.findAll();
	}
}
