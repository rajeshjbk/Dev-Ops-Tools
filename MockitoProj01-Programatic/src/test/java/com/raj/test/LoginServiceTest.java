package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.raj.dao.ILoginDAO;
import com.raj.service.ILoginMgmtService;
import com.raj.service.LoginMgmtServiceImpl;


public class LoginServiceTest {
	private static ILoginMgmtService  loginService;
	private static  ILoginDAO   mockDAO;
	private  static  ILoginDAO  spyDAO;
	private static ILoginMgmtService  spyLoginService;
	
	
	@BeforeAll
	public static  void setupOnce() {
		System.out.println("LoginServiceTest.setupOnce()");
		// create Mock DAO class object
		mockDAO=Mockito.mock(ILoginDAO.class);
		 //create  Spy DAO class object
		spyDAO=Mockito.spy(ILoginDAO.class);
		//create  Service class obj having mockDAO object
		loginService=new LoginMgmtServiceImpl(mockDAO);
		//create  Service class obj having spyDAO object
		spyLoginService=new LoginMgmtServiceImpl(spyDAO);
	}
	
	@Test
	public  void testLoginWithValidCredentials() {
		System.out.println("LoginServiceTest.testLoginWithValidCredentials()");
		// convert mock object to stub object by providing dummy functionality to mock object methods
		Mockito.when(mockDAO.authenticate("raja", "rani")).thenReturn(true);
		//get actual result
		String result=loginService.login("raja", "rani");
		assertEquals("Valid Credentials",result);
	
		
	}
	
	@Test
	public  void testLoginWithInValidCredentials() {
		System.out.println("LoginServiceTest.testLoginWithInValidCredentials()");
		// convert mock object to stub object by providing dummy functionality to mock object methods
		Mockito.when(mockDAO.authenticate("raja", "rani1")).thenReturn(false);
		//get actual result
		String result=loginService.login("raja", "rani1");
		assertEquals("Invalid Credentials",result);
		
	}
	
	@Test
	public  void testLoginWithNoCrendetials() {
		System.out.println("LoginServiceTest.testLoginWithNoCredentials()");
		
		assertThrows(IllegalArgumentException.class, ()->loginService.login("", ""));
			
	}
	
	
	@Test
	public  void testStubVsSpy() {
		  //Mock object
		ArrayList<String>  listMock=Mockito.mock(ArrayList.class);
		listMock.add("table");
		ArrayList<String>  listSpy=Mockito.spy(ArrayList.class);
		listSpy.add("table");
		// Convert  Both mock and  Spy objects as  Stub objects by providing dummy functionality
		//Mockito.when(listMock.size()).thenReturn(10);
		//Mockito.when(listSpy.size()).thenReturn(20);
		System.out.println(listMock.size()+"........"+listSpy.size());
		
	}
	
	
	@Test
	public   void   testRegiserUserWithValidData() {
		//provide dummy functionality to addUser method
		Mockito.when(spyDAO.addUser("raja", "rani")).thenReturn(1);
		//get actual result
		String msg=spyLoginService.registerUser("raja", "rani");
		//check   add user method is called or not
		Mockito.verify(spyDAO,Mockito.times(1)).addUser("raja","rani");
				
	
		assertEquals("User Added", msg);
		
	}
	
	@Test
	public   void   testRegiserUserWithInValidData() {
		//check   add user method is called or not
		assertThrows(IllegalArgumentException.class, ()->spyLoginService.registerUser("raja", ""));
		Mockito.verify(spyDAO,Mockito.never()).addUser("raja","");
			
	}
	
	
	
	
	
	@AfterAll
	public  static  void tearDownOnce() {
		System.out.println("LoginServiceTest.tearDownOnce()");
		mockDAO=null;
		loginService=null;
		
	}
	
	
	

}
