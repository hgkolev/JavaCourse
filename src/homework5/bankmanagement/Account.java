
package homework5.bankmanagement;

import homework5.credentialsmanager.Credentials;

public class Account {
	private String name;
	private String govId;
	private Credentials credential;
	private double balance = 0;

	
	public Account(String name, String govId, Credentials userAccount) {
		super();
		this.name = name;
		this.govId = govId;
		this.credential = userAccount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGovId() {
		return govId;
	}

	public void setGovId(String govId) {
		this.govId = govId;
	}

	public Credentials getUserAccount() {
		return credential;
	}

	public void setUserAccount(Credentials userAccount) {
		this.credential = userAccount;
	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public boolean hasAccess(String password) {
		return credential.matchPassword(password);
	}
	
	

}
