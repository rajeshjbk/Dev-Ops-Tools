//Service class
package com.raj.service;

public class OperationsService {
	
	
	public double add(double a ,double b) {
		return a+b;
	}
	
	public  boolean  isPallendrome(String str) {
		//reverse the string
		String revStr=new StringBuffer(str).reverse().toString();
		return  str.equals(revStr);
		
	}

}
