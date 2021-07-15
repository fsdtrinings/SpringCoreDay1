package com.fis.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Car;

public class MainRunner {

	public static void main(String[] args) {
		
		// Spring container 
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		/*Car car = (Car)spring.getBean("carNewCar");
		System.out.println(car);
		/*/
		
		
		Car car2 = (Car)spring.getBean("car");
		car2.setCarName("Wagon-R");
		System.out.println("First Call :- "+car2);
		
		
		Car car3 = (Car)spring.getBean("car");
		System.out.println(" Second Call "+car3);
		
		
		spring.close();
		
	}
}
