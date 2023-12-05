package com.example.DI;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Constructor : Engine");	
	}
	
	public Integer start() {
		return 0;
	}
}
