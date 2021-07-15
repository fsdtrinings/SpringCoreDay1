package com.fis.app.model;

import org.springframework.stereotype.Component;

@Component
public class Cab {

	private Car car;
	private Driver driver;
	private int cabLicence;
	private String operatorName;
	
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cab(Car car, Driver driver, int cabLicence, String operatorName) {
		super();
		this.car = car;
		this.driver = driver;
		this.cabLicence = cabLicence;
		this.operatorName = operatorName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public int getCabLicence() {
		return cabLicence;
	}
	public void setCabLicence(int cabLicence) {
		this.cabLicence = cabLicence;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	@Override
	public String toString() {
		return "Cab [car=" + car + ", driver=" + driver + ", cabLicence=" + cabLicence + ", operatorName="
				+ operatorName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cabLicence;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + ((operatorName == null) ? 0 : operatorName.hashCode());
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
		Cab other = (Cab) obj;
		if (cabLicence != other.cabLicence)
			return false;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		if (operatorName == null) {
			if (other.operatorName != null)
				return false;
		} else if (!operatorName.equals(other.operatorName))
			return false;
		return true;
	}
	
	
	
	
}
