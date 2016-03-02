package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	// point cut defines where a join point is
	public void snap() {
		System.out.println("snap!");
	}
	
	public void snap(int exposure) {
		System.out.println("snap! Exposure: " + exposure);
	}
	
	public String snap(String name) {
		System.out.println("snap! Name: " + name);
		
		return name;
	}
	
	public void snapNightTime() {
		System.out.println("Snap night mode...");
	}
}
