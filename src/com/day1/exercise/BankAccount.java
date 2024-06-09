package com.day1.exercise;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Successfully deposited "+ amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= balance && amount > 0) {
			this.balance -= amount;
			System.out.println("Successfully withdrawal "+ amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}
}
