package com.raj.main;
import com.raj.service.*;

/**
 * Hello world!
 */
public class BankClientApp {
    public static void main(String[] args) {
    	System.out.println("BankClientApp.main() (from MavenProj05)");
    	//create  object for BankService and use the methods
    	BankService  service=new BankService();
    	System.out.println("Intrest amount::"+service.calcSimpleIntrestAmount(100000.0, 2.0, 12.0));
        
    }
}
