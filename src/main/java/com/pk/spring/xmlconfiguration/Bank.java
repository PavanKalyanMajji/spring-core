package com.pk.spring.xmlconfiguration;

import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private int accountNumber;
	private String accountName;
	private Account account;
	private List<String> listOfBanks;
	public Bank() {
		
	}

	public Bank(int accountNumber, String accountName,Account account) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.account=account;
	}
	public Bank(Account account) {
		this.account=account;
	}
	
	public Bank(List<String> lisOfBanks) {
		this.listOfBanks=lisOfBanks;
	}
	public void getLoan() {
		account.createAccount(accountNumber, accountName);
		System.out.println("Loan Approved..");
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getListOfBanks() {
		Iterator<String> iterator=this.listOfBanks.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
