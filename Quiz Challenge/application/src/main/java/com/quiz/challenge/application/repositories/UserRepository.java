package com.quiz.challenge.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.challenge.application.entity.User;


@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Long> {

}
