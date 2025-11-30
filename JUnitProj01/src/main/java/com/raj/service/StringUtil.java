package com.raj.service;

public class StringUtil {

	public boolean isPalindrome(String str) {
		
		System.out.println("StringUtil.isPalindrome()");
		String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equalsIgnoreCase(revStr);
	}
	
	public int showLength(String str) {

		return str.length();//gives given String lengths

	}
	
}
