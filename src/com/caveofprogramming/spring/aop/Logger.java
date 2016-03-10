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
	@Pointcut("within(com.caveofprogramming.spring..*)")
	public void withinDemo() {
		
	}
	
	// Cannot use wildcards here (ie, *)
	// Injected when the actual target class is run
	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
	public void targetDemo() {
		
	}
	
	// "This" targets the interfaces of the targetted class
	@Pointcut("this(com.caveofprogramming.spring.aop.ICamera)")
	public void thisDemo() {
		
	}
	
	@Before("withinDemo()")
	// Advice
	public void withinDemoAdvice() {
		System.out.println("********** Before demo **********");
	}
	
	@Before("withinDemo()")
	// Advice
	public void targetDemoAdvice() {
		System.out.println("********** Target demo **********");
	}
	
	@Before("withinDemo()")
	// Advice
	public void thisDemoAdvice() {
		System.out.println("********** This demo **********");
	}

}
