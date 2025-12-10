package com.raj.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestApp {

	private static final Logger logger = Logger.getLogger("TestApp");
	
	public void m2() {
		logger.fine("from m2()");
//		System.out.println("TestApp.m2()");
	}
	
	public void m1() {
		
		logger.fine("from m1()");
//		System.out.println("TestApp.m1()");
		String s1="";
		
		List<Integer> list = new ArrayList<>();
		list.add(10); list.add(20);
		
//		list=null;
		
		list.add(40);
		logger.log(Level.FINE,"data is::{0}",list);
	}
	
	public static void main(String[] args) {
		
		System.out.println("TestApp.main() (start)");
		
		TestApp app = new TestApp();
		app.m1();
		System.out.println("TestApp.main() (end)");
	}
}
