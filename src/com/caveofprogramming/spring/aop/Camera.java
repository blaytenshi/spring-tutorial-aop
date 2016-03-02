package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	// point cut defines where a join point is
	public void snap() {
		System.out.println("snap!");
	}
}
