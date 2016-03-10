package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	/*
	// Creates a pointcut that targets any annotation specified Annotation. If it's a Spring annotation you need to give it the full path name. If not, just the annotation will do.
	@Pointcut("within(@org.springframework.stereotype.Component com.caveofprogramming.spring..*)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}
	
	
	// Creates a pointcut for all methods in all classes with the Component annotation.
	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}
	
	// Creates a pointcut for all methods with the Component annotation.
	@Pointcut("@annotation(java.lang.Deprecated)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}
	
	*/
	
	// Creates a pointcut for all argument classes (see snapCar()) that is annotated with the specified annotation.
	@Pointcut("@args(java.lang.Deprecated)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}

}
