package com.demo.sampleapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateTest {
	private  Calculate cObj;
	@BeforeEach
	public  void setup() {
		cObj=new Calculate();
	}
	@AfterEach
	public void clear() {
		cObj=null;
	}
	@Test
	  public void testAddNums() {
	
	    assertEquals(15, cObj.addNums(7, 8));
	  }
	@Test
	public void testIsOdd() {
	
		assertTrue(cObj.isOdd(7));
	}
	@Test
	public void testIsEven() {
		
		assertTrue(cObj.isEven(8));
	}
	@Test
	public void testDiv() {
		assertEquals(3,cObj.div(6, 2));
	}
	@Test
	public void testDivExep(){
		assertThrows(ArithmeticException.class, ()->cObj.div(7, 0));
	}
}
