package com.raj.nb;

public class NetBankingService {

	public String transferMoney(long srcAcno,long destAcno, double amt) {
		
		return amt+" amount is transfered from "+srcAcno+" to "+destAcno;
	}
}
