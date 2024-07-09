package com.pk.spring.automobile;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 *ApplicationContext is an interface which is used to create a IOC container with the help of spring XML configuration.
 *IOC container will take care of creation of Object and dependence injection.
 *
 */
public class TestDrive {
	public static void main(String[] args) {
		ConfigurableApplicationContext iocContainer= new ClassPathXmlApplicationContext("automobile.xml");
		Car carObject=iocContainer.getBean(Car.class);
		carObject.drive();
		iocContainer.close();
	}
}
