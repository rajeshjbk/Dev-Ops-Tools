package com.raj.main;

import com.raj.service.ArithmeticOperations;

public class AppTest {

	public static void main(String[] args) {
		
		ArithmeticOperations ops = new ArithmeticOperations();
		System.out.println("Result (Sum) is : "+ops.sum(10,20));
		System.out.println("Result (Sub) is : "+ops.sub(40,20));
	}
}
