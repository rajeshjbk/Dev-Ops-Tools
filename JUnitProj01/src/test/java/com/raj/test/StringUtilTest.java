package com.raj.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.raj.service.StringUtil;

public class StringUtilTest {

  public static StringUtil util;
  
  @BeforeAll
  public static void setUpOnce() {
	  
	  System.out.println("StringUtilTest.setUpOnce()");
	  util=new StringUtil();
  }
  
  @Test
//  @DisplayName("Palindrome")
  public void test1IsPalindrome() {
	  
	  System.out.println("StringUtilTest.test1IsPalindrome()");
	  String expected = "madam";
	  
	   assertTrue(util.isPalindrome(expected));
  }
  
  @Test
//  @DisplayName("Not Palindrome")
  public void test2IsPalindrome() {
	  
	  System.out.println("StringUtilTest.test2IsPalindrome()");
	  String expected = "raj";
	  
	   assertFalse(util.isPalindrome(expected));
  }
  
  @AfterAll
  public static void tearDownOnce() {
	  System.out.println("StringUtilTest.tearDownOnce()");
	  util=null;
  }
}
