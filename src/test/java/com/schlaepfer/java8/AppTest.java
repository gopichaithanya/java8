package com.schlaepfer.java8;

import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private App myApp;

	@Before
	public void setup() {
		myApp = new App();
	}
	
	@Test
	public void test() {
		myApp.doList();
	}
	
	@Test
	public void test2() {
		myApp.doLambda();
	}

	
}
