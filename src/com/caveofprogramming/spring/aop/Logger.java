package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	// This will now insert the this pointcut which is a before pointcut into any method call within the Camera package
	@Pointcut("within(com.caveofprogramming.spring.aop.*)")
	public void cameraSnap() {
		
	}
	
	@Before("cameraSnap()")
	// Advice
	public void aboutToTakePhoto() {
		System.out.println("********** Before advice **********");
	}

}
