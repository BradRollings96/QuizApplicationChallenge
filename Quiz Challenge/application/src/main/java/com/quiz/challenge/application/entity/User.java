package com.quiz.challenge.application.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String emailAddress; 
	private String role;
	
	public User() {
		
	}
	
	public User(String emailAddress, String role) {
		super();
		this.emailAddress = emailAddress;
		this.role = role;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", emailAddress=" + emailAddress + ", role=" + role + "]";
	} 
}
