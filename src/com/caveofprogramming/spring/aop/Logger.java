package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	// This is now a reusable aspect method! :D
	@Pointcut("execution(void com.caveofprogramming.spring.aop.Camera.snap())")
	public void cameraSnap() {
		
	}
	
	@Before("cameraSnap()")
	// Advice
	public void aboutToTakePhoto() {
		System.out.println("About to take Photo...");
	}
}
