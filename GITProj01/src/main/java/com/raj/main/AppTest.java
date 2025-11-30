package com.raj.main;

import com.raj.service.ArithmeticOperations;
import com.raj.upi.UPIPayment;

public class AppTest {

	public static void main(String[] args) {
		
		ArithmeticOperations ops = new  ArithmeticOperations();
		
		System.out.println("Result (Sum) is: "+ops.sum(10, 20));
		System.out.println("Result (Sub) is: "+ops.sub(30, 20));
        System.out.println("================================");
		
        UPIPayment upip = new UPIPayment();
        System.out.println(upip.doUPIPayment(8797654567l,6000));
		
	}

}
