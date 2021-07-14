package com.fis.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Car;

public class MainRunner {

	public static void main(String[] args) {
		
		// Spring container 
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		Car car = (Car)spring.getBean("carNewCar2");
		System.out.println(car);
		
	}
}
