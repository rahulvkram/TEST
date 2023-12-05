package com.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() {
		System.out.println("Constructor : Car");	
	}
	
	private Engine eng;
	@Autowired
	/*If we remove @Autowired, then Setter Injection won't be performed. Then eng carries null as default value and 
	 then we will get NPE at eng.start() as we're performing operation on null value*/
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		System.out.println(eng.start());
		Integer status = eng.start();
		//System.out.println(status);
		if(status == 0) {
			System.out.println("Journey has started");
		}
	}
}
	

