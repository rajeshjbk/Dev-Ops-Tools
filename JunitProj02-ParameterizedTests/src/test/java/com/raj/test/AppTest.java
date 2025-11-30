//AppTest.java
package com.raj.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.raj.service.OperationsService;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private static  OperationsService  ops;
	
	@BeforeAll
	public static void  setupOnce() {
		System.out.println("AppTest.setupOnce()");
		ops=new OperationsService();
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","racecar","malayalam","mom"})
	public void  test1Pallendrome(String str) {
		System.out.println("AppTest.test1Pallendrome()");
		assertTrue(ops.isPallendrome(str));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"raj","rascal","idiot"})
	public void  test2Pallendrome(String str) {
		System.out.println("AppTest.test2Pallendrome()");
		assertFalse(ops.isPallendrome(str));
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30","-20,-40,-60","-30,10,-20","0,0,0"})
	public void testAdd(double x, double y,double expected) {
		System.out.println("AppTest.testAdd()");
		double actual=ops.add(x, y);
		assertEquals(expected, actual);
	}
	
	
	@AfterAll
	public static void  tearDownOnce() {
		System.out.println("AppTest.tearDownOnce()");
		ops=null;
	}


}
