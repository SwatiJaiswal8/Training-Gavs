package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String accountNumber;
    private double balance;
    public Account() {
    }
    
	public Account(int id, String accountNumber, double balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account( String accountNumber, double balance) {
		
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
    public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
	public void transfer(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount); // Withdraw from current account
            recipient.deposit(amount); // Deposit into recipient account
            System.out.println("Transfer successful. Transferred: " + amount);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

    
}
