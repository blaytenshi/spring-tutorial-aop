package com.caveofprogramming.spring.aop;

public interface ICamera {

	// point cut defines where a join point is
	void snap();

	void snap(int exposure);

	String snap(String name);

	void snapNightTime();

	void snapCar(Car car);

}