package com.tnsif.Interface;

public class Bankmain {

	public static void main(String[] args) {


		BankImpl ob=new BankImpl(0);
		ob.withdraw(500);
		ob.deposit(2345);
		if(ob instanceof BankImpl) {
		   
	        ob.deposit(6767);
		}	
		
	}
	
	
	
}

	
