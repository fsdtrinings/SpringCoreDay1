package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("${engine.name}")
	private String engineName;
	@Value("1200")
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
