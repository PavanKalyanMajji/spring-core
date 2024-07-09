package com.pk.spring.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext iocContainer= new ClassPathXmlApplicationContext("bankingsector.xml");
		Bank bank=iocContainer.getBean("bank",Bank.class);
		bank.getLoan();
		
		Bank bank1=iocContainer.getBean("bank1",Bank.class);
		bank1.getLoan();
		
		Bank bank2=iocContainer.getBean("bank2",Bank.class);
		bank2.getLoan();
		
		System.out.println("****List Of Banks that we have*****");
		Bank listOfBanks=iocContainer.getBean("listOfBanks",Bank.class);
		listOfBanks.getListOfBanks();
		
		System.out.println("****Rate Of Interest*****");
		Bank rateOfInterest=iocContainer.getBean("rateOfInterest",Bank.class);
		rateOfInterest.getRateOfInterestOfBank();
	}
}
