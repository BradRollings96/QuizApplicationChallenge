package com.quiz.challenge.application.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question implements Serializable {

	private static final long serailVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;

	private String content; 
	
	public Question() {
		
	}
	
	public Question(String content) {
		this.content = content;
	}
	

	public static long getSerailversionuid() {
		return serailVersionUID;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + "]";
	}
}
