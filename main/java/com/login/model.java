package com.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class model {
	@Id
	@Column
	private String username;
	@Column
	private String password;



	public String getUsername() {
	return username;
	}



	public void setUsername(String username) {
	this.username = username;
	}



	public String getPassword() {
	return password;
	}



	public void setPassword(String password) {
	this.password = password;
	}

}
