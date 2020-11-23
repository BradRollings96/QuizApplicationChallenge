package com.quiz.challenge.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quiz.challenge.application.entity.Question;

@Repository("QuestionRepository")
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
