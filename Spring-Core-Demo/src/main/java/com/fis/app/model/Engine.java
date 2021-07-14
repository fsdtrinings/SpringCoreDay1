package com.fis.app.model;


public class Engine {
	
	private String engineName;
	private int power;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String engineName, int power) {
		super();
		this.engineName = engineName;
		this.power = power;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", power=" + power + "]";
	}
	

	
}
