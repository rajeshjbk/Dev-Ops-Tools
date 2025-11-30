package com.raj.service;


public class BankService {
	
	public  double  calcSimpleIntrestAmount(double pamt,double rate,double time) {
		  //validation of the inputs
		if(pamt<=0 ||  rate<=0 || time<=0)
			throw new IllegalArgumentException("Invalid Inputs");
		//giving the result
		return  pamt*rate*time/100.0;
	}
   
}
