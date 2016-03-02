package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap())")
	public void cameraSnap() {
		
	}
	
	@Before("cameraSnap()")
	// Advice
	public void aboutToTakePhoto() {
		System.out.println("Before advice ...");
	}
	
	@After("cameraSnap()")
	public void afterAdvice() {
		System.out.println("After advice...");
	}
	
	
	// Will only execute if there are no exceptions thrown and returns normally
	@AfterReturning("cameraSnap()") 
	public void afterReturningAdvice() {
		System.out.println("After returning advice...");
	}
	
	// Will only execute if an exception is encountered
	@AfterThrowing("cameraSnap()")
	public void afterThrowingAdvice() {
		System.out.println("After throwing advice...");
	}
	
	// like a combination of a @before and @after. The p will tell this pointcut to continue executing. 
	// If an exception is thrown, it will throw it and continue to execute... but will not be caught by the @afterthrowing aspect
	@Around("cameraSnap()")
	public void aroundAdvice(ProceedingJoinPoint p) {
		System.out.println("Around advice (before)...");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("In around advice: " + e.getMessage());
		}
		System.out.println("Around advice (after)");
	}
}
