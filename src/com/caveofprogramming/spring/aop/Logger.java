package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	// We've chosen the names to match what they are with the method that is being called but this is purely for consistencies sake with the method they're being called from. They don't have to match the names of the arguments.
	@Pointcut("args(exposure, aperture)")
	// this is where we're telling them what types they are...
	public void somePointcut(int exposure, double aperture) {
		
	}
	
	// We now need to match the names we declared in the @PointCut annotation
	@Before("somePointcut(exposure, aperture)")
	// Advice
	// The arguments names that you supply in the advice arguments need to match what's in the @Before annotation but they don't need to be in order. You don't even need the JoinPoint object anymore.
	public void somePointcutDemo(double aperture, int exposure) {
		System.out.println("********** Before demo **********");
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}

}
