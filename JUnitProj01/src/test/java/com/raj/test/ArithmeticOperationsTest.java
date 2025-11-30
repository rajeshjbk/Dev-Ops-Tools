package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.raj.service.ArithmeticOperations;

@DisplayName("Testing Arithemetic Operations")
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.Random.class)
public class ArithmeticOperationsTest {

	public static ArithmeticOperations ops;
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("ArithmeticOperationsTest.setUpOnce()");
		ops = new ArithmeticOperations();
	}
	@Test
//	@DisplayName("sumWith +ve")
//	@Tag("test")
//	@Order(20)
	public void sumWithPositiveValues() {
		System.out.println("ArithmeticOperationsTest.sumWithPositiveValues()");
		double a=100.0;
		double b=200.0;
		double expected = 300.0;
				
		double actual = ops.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	@Test
//	@DisplayName("sumWith -ve")
//	@Tag("test")
//	@Order(15)
	public void sumWithNegativeValues() {
		System.out.println("ArithmeticOperationsTest.sumWithNegativeValues()");
		double a=-100.0;
		double b=-200.0;
		double expected = -300.0;
		
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		
		double actual = arithmeticOperations.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
//	@DisplayName("sumWith zero")
//	@Tag("test")
//	@Order(10)
	public void sumWithZeroValues() {
		System.out.println("ArithmeticOperationsTest.sumWithZeroValues()");
		double a=0.0;
		double b=0.0;
		double expected = 0.0;
				
		double actual = ops.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
//	@Disabled
//	@DisplayName("sumWith Big value")
//	@Tag("prod")
//	@Order(30)
	public void sumWithBigValues() {
		System.out.println("ArithmeticOperationsTest.sumWithBigValues()");
		double a=1111111111.0;
		double b=2222222222.0;
		double expected = 3333333332.0;
		
		double actual = ops.sum(a, b);
		
		assertEquals(expected, actual,5,"Test Failed with Big values");
		
	}
	
	@AfterAll
	public static void tearDownOnce() {
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
		ops=null;
	}
}
