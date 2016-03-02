package com.caveofprogramming.spring.aop;


// Aspect
public class Logger {
	
	// Advice
	public void aboutToTakePhoto() {
		System.out.println("About to take Photo...");
	}
}
