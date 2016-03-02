package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;


// Problem: If you make your advised class implement a bunch of different classes
// Java will no longer detect it as a Camera class and instead it'll be an instance of a class it implements
// Because you are lifting the object from the Spring context. Casting it will have no effect. How to resolve this?

// setting proxy-target-class in beans configuration (usually set to false to true which will get spring to actually instantiate TWO camera classes.
// One the actual camera class and the other the proxy class with the camera as subclass.
// This solution creates two objects and will cause your constructor to be run twice which may not be desirable.

// the other solution is to make the camera implement itself as an interface and then use that interface to get the context.

@Component("camera")
public class Camera implements PhotoSnapper, Machine, ICamera {
	
	public Camera() {
		System.out.println("Hello from camera constructor");
	}
	
	// point cut defines where a join point is
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception {
		System.out.println("snap!");
		
		// throw new Exception("bye bye!");
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("snap! Exposure: " + exposure);
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		System.out.println("snap! Name: " + name);
		
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snapNightTime()
	 */
	@Override
	public void snapNightTime() {
		System.out.println("Snap night mode...");
	}
}
