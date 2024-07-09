package com.pk.spring.bankingsector;

public class Bank {
	
	private int accountNumber;
	private String accountName;
	private Account account;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getLoan() {
		account.createAccount(accountNumber, accountName);
		System.out.println("Loan Approved..");
	}
}
