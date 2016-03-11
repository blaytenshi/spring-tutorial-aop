package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Aspect
public class Logger {
	
	// args() will match any method in our container that contains no arguments
	// args(int) will match any method that has an int as the argument
	// args(int, double) will match any method that has an int and then a double (in that order)
	// args(com.caveofprogramming.spring.aop.Car) will match any method that matches a Car type (regular java objects do not require fully qualified path)
	// args(int, *) will match any method that has first an int and then any class type as argument
	// args(int, ..) will match any method that has first an int and then zero or more arguments of any class type
	// Use this with caution because it looks like it's not just using class type to do the isolation but anything that can be cast to that type too (in this example
	//   by putting in only double will match the int as well as the double method calls in camera. If you want to target double type you can use the Autoboxed Double
	//   class type because it can't be autocasted to any other type.
	// The args PCD is usually used in a binding form where we use it to bind values from our target methods to our advice arguments that enable us to get the values of arguments from our target methods
	@Pointcut("args(int, ..)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	// Advice
	public void somePointcutDemo() {
		System.out.println("********** Before demo **********");
	}

}
