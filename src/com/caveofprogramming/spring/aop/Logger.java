package com.caveofprogramming.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo(JoinPoint jp) {
		System.out.println("********** Before demo **********");
		// Disadvantage of using JoinPoint object is that if you want to use the arguments in some way, you'll need to cast them to the right types coz you're just getting a bunch of objects.
		// If you want to use the Around Advice, you'll need to use the ProceedingJoinPoint class instead of the regular JoinPoint
		for(Object obj : jp.getArgs()) {
			System.out.println("ARG: " + obj);
		}
	}

}
