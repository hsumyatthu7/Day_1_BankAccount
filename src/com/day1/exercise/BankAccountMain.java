package com.day1.exercise;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount bank_acc = new BankAccount(1000.00);
		
		bank_acc.deposit(500.00);
		
		System.out.println("My balance: $" + bank_acc.getBalance());

		bank_acc.deposit(500.00);
		bank_acc.withdraw(200.00);
	}
}
