package com.fis.app.service;

import org.springframework.stereotype.Component;

import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

@Component
public class ClientService {

	public void doBookCab()
	{
		
		System.out.println(" cab booking code executing .... ");
		
	}
	
	public void doMakePayment()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doMakePayment(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}
	
	
	
}
