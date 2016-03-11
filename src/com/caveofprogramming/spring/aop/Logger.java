package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	@Pointcut("args(exposure, aperture)")
	public void somePointcut(int exposure, double aperture) {
		
	}
	
	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
	public void targetCamera() {
		
	}
	
	@Before("targetCamera() && somePointcut(exposure, aperture)")
	// Advice
	public void somePointcutDemo(double aperture, int exposure) {
		System.out.println("********** Before demo **********");
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}
	
	@After("within(com.caveofprogramming.spring.aop.*) && !@annotation(Deprecated)")
	public void someAfterAdvice() {
		System.out.println("After Advice Running!!!!!!!!!!!!!!!!!!!");
	}

}
