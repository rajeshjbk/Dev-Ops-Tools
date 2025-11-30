package com.raj.service;

import com.raj.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	private  ILoginDAO loginDAO;
	
	public LoginMgmtServiceImpl(ILoginDAO loginDAO) {
		this.loginDAO=loginDAO;
		
	}

	@Override
	public String login(String username, String pwd) {
		  //validation
	   if(username.equals("")|| username.length()==0 ||  pwd.equals("")  || pwd.length()==0)
		   throw new IllegalArgumentException("Invalid  inputs");
	   //use DAO
	   boolean flag=loginDAO.authenticate(username, pwd);
	   if(flag)
		   return "Valid Credentials";
	   else
		   return  "Invalid Credentials";
	   
	   
	}

	@Override
	public String registerUser(String user, String pwd) {
	   // validation
		if(user.equals("")|| user.length()==0 ||  pwd.equals("")  || pwd.length()==0)
	      throw new IllegalArgumentException("Invalid  inputs");
		
	   //use DAO
		int count=loginDAO.addUser(user, pwd);
		   
		return count==0?"User Not Added":"User Added";
	}

}
