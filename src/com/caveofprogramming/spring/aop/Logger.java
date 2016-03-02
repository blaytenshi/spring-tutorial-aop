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
	// The .. means takes any arguments! The .. is a wildcard.
	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.*(..))")
	public void cameraSnap() {
		
	}
	
	// Pointcut will execute with any return type
	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap(String))")
	public void cameraSnapName() {
		
	}
	
	// Pointcut will execute with any return type of any class in any package with any method and any argument
	@Pointcut("execution(* *.*(..))")
	public void cameraRelatedAction() {
		
	}
	
	@Before("cameraSnap()")
	// Advice
	public void aboutToTakePhoto() {
		System.out.println("About to take Photo...");
	}
	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName() {
		System.out.println("About to take photo with name...");
	}
	
	@Before("cameraRelatedAction()")
	public void aboutToDoCameraRelatedAction() {
		System.out.println("Doing something related to cameras...");
	}
}
