package com.tnsif.Interface;

import com.tnsif.Interface.interfacebank.InterfaceBank;

public class BankImpl implements InterfaceBank {
	    private double balance;

	    public BankImpl(double balance) {
	        this.balance = balance;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("The amount after withdraw: " + balance);
	        } else {
	            System.err.println("Insufficient balance");
	        }
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount <= InterfaceBank.DEPOSIT_LIMIT) {
	            balance += amount;
	            System.out.println("The amount after deposit: " + balance);
	        } else {
	            System.err.println("Deposit limit exceeds");
	        }
	    }
}

