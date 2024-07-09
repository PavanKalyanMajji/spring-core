package com.pk.spring.automobile;

public class Car {
	
	private Engine engine;
	
	public void drive() {
		engine.start();
		System.out.println("Plss... Drive the car");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
