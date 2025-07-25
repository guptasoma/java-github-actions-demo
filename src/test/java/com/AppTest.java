package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	
	@Test
	public void testAddPositive() {
		App app=new App();
		assertEquals(app.add(2,3),5);
	}
	
	@Test
	public void testAddNegative() {
		App app=new App();
		assertEquals(app.add(-2,-3),-5);
	}
	
	 @Test
	 void testGreet() {
	     assertEquals("Bless you, Soma!", App.greet("Soma"));
	 }
}
