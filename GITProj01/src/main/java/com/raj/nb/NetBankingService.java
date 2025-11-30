package com.raj.nb;

public class NetBankingService {

	public String transferMoney(long srcAcno,long destAcno, double amt, String gateway) {
		
		return amt+" amount is transfered from "+srcAcno+" to "+destAcno+" using gateway... "+gateway;
	}
}
