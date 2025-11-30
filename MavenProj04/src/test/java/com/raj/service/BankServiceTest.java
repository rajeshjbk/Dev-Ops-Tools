package com.raj.service;

import  static org.junit.jupiter.api.Assertions.*;  //static import
import org.junit.jupiter.api.Test;

import com.raj.service.BankService;

public class BankServiceTest {
	
	@Test
	public   void  testSimpleIntrestAmountWithBigValues() {
		double pamt=10000000.0;
		double rate=2.0;
		double time=12.0;
		// calculate expected result manually
		double expected=2400000.0;
		//get actual result
		BankService  service=new BankService();
		double actual=service.calcSimpleIntrestAmount(pamt, rate, time);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public   void  testSimpleIntrestAmountWithSmallValues() {
		double pamt=100000.0;
		double rate=2.0;
		double time=12.0;
		// calculate expected result manually
		double expected=24000.0;
		//get actual result
		BankService  service=new BankService();
		double actual=service.calcSimpleIntrestAmount(pamt, rate, time);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public   void  testSimpleIntrestAmountWithWrongValues() {
		double pamt=100000.0;
		double rate=-2.0;
		double time=12.0;
		BankService  service=new BankService();
		assertThrows(IllegalArgumentException.class,
				             ()->service.calcSimpleIntrestAmount(pamt, rate, time));
		
	}
	
	

}
