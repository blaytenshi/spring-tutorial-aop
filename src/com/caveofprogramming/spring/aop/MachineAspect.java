package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MachineAspect {
	
	// Declares which beans are going to implement that interface and where the implementation is going to come from
	@DeclareParents(value="com.caveofprogramming.spring.aop.*", defaultImpl=com.caveofprogramming.spring.aop.Machine.class)
	// Determines what interface the beans are going to implement
	private IMachine machineIntroductionMixin;
	
	@Around("within(com.caveofprogramming.spring.aop.*)")
	public void runMachine(ProceedingJoinPoint pjp) {
		System.out.println("Running ...");
		try {
			pjp.proceed(); 
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("... completed.");
	}
}
