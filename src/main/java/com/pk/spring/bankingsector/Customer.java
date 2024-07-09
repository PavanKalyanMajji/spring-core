package com.pk.spring.bankingsector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext iocContainer= new ClassPathXmlApplicationContext("bankingsector.xml");
		Bank bank=iocContainer.getBean("bank",Bank.class);
		bank.getLoan();
	}
}
