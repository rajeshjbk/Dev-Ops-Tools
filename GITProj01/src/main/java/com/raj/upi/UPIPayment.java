package com.raj.upi;

public class UPIPayment {

	public String doUPIPayment(long mobileNo, float amount) {
		
		return amount+" amount is transfered to mobile number :: "+mobileNo+" Using BharatPay";
	}
	
	public String doUPIPaymentByAcno(long accNo, float amount) {
		
		return amount+" amount is transfered to account number :: "+accNo+" Using BharatPay";
	}
		
}
