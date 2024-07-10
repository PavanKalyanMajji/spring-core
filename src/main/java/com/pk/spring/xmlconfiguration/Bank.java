package com.pk.spring.xmlconfiguration;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bank {

	private int accountNumber;
	private String accountName;
	private Account account;
	private List<String> listOfBanks;
	private Map<Integer, String> rateOfInterestBank;

	public Bank() {
		// Empty Constructor
	}

	public Bank(int accountNumber, String accountName, Account account) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.account = account;
	}

	public Bank(Account account) {
		this.account = account;
	}

	public Bank(List<String> lisOfBanks) {
		this.listOfBanks = lisOfBanks;
	}

	public Bank(Map<Integer, String> rateOfInterestBank) {
		this.rateOfInterestBank = rateOfInterestBank;
	}

	public void getLoan() {
		account.createAccount(accountNumber, accountName);
		System.out.println("Loan Approved..");
	}

	public void listOfBanks() {
		Iterator<String> iterator = this.listOfBanks.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void getRateOfInterestOfBank() {
		Set<Map.Entry<Integer, String>> entry = this.rateOfInterestBank.entrySet();
		Iterator<Map.Entry<Integer, String>> eachEntry = entry.iterator();
		while (eachEntry.hasNext()) {
			System.out.println(eachEntry.next());
		}
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

	public Account getAccount() {
		return account;
	}

	public Map<Integer, String> getRateOfInterestBank() {
		return rateOfInterestBank;
	}

	public void setRateOfInterestBank(Map<Integer, String> rateOfInterestBank) {
		this.rateOfInterestBank = rateOfInterestBank;
	}

	public void setListOfBanks(List<String> listOfBanks) {
		this.listOfBanks = listOfBanks;
	}

	public List<String> getListOfBanks() {
		return listOfBanks;
	}
}
