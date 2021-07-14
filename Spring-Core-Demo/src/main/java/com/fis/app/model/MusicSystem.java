package com.fis.app.model;

public class MusicSystem {

	private String name;

	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusicSystem(String name) {
		super();
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MusicSystem [name=" + name + "]";
	}
	
	
}
