package com.raj.service;

public class StringUtil {

	public boolean isPalindrome(String str) {
		
		String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equalsIgnoreCase(revStr);
	}
}
