package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	// targets any bean with the name camera (in Component in this case) the asterisk means 0 or more characters before the camera word. You can get it to target the car bean with *a*
	@Pointcut("bean(*camera)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}

}
