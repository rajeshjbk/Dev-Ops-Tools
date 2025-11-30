package com.raj.service;

public class StringUtil {

	public boolean isPalindrome(String str) {
		
		System.out.println("StringUtil.isPalindrome()");
		String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equalsIgnoreCase(revStr);
	}
	
}
