package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Value("Ramesh Kumar")
	private String username;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Client [username=" + username + "]";
	}
	
	// payment 
	
	
	
	
}



















