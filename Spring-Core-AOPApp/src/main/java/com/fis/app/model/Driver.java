package com.fis.app.model;

import org.springframework.stereotype.Component;

@Component
public class Driver {
	
	private String driverName;
	private int id;
	private int starRatings;
	private int age;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(String driverName, int id, int starRatings, int age) {
		super();
		this.driverName = driverName;
		this.id = id;
		this.starRatings = starRatings;
		this.age = age;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStarRatings() {
		return starRatings;
	}
	public void setStarRatings(int starRatings) {
		this.starRatings = starRatings;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result + id;
		result = prime * result + starRatings;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		if (age != other.age)
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (id != other.id)
			return false;
		if (starRatings != other.starRatings)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", id=" + id + ", starRatings=" + starRatings + ", age=" + age
				+ "]";
	}
	
	
	
	

}
