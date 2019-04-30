package homework5.bankmanagement;

import homework5.credentialsmanager.Credentials;

public class Bank {
	private String bankName;
	private final int MAX_ACCOUNTS_NUMBER = 5;

	private Account[] accounts;
	private int accountCounter;

	public Bank(String bankName, int accounts) {
		this.bankName = bankName;
		this.accounts = new Account[accounts];
		this.accountCounter = 0;

	}

	public Bank() {

		this.accounts = new Account[MAX_ACCOUNTS_NUMBER];
		this.accountCounter = 0;

	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccountCounter() {
		return accountCounter;
	}

	public Account[] getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void openAccount(String name, String govId, String username, String password) {
		if (accountCounter == MAX_ACCOUNTS_NUMBER) {
			System.out.println("Open failed!");
			return;
		}
		Account account = new Account(name, govId, new Credentials(username, password));
		this.accounts[accountCounter++] = account;
		System.out.println("Open success!");

	}

	public void closeAccount(String username, String password) {
		for (int i = 0; i < accountCounter;) {
			String sourceUserName = accounts[i].getUserAccount().getUsername();

			if (sourceUserName.equals(username)) {
				if (accounts[i].hasAccess(password)) {
					accounts[i] = null;
					while (i + 1 < accountCounter) {
						accounts[i] = accounts[i + 1];
						i++;
					}
					accounts[accountCounter - 1] = null;
					accountCounter--;
					System.out.println("Close success!");

				} else {
					System.out.println("Close failed!");

				}
				
			}
			i++;
		}

	}

	public void deposit(String username, double amount) {
		if (amount < 0) {
			System.out.println("Deposit failed!");
		} else {

			for (int i = 0; i < accountCounter; i++) {
				String sourceUserName = accounts[i].getUserAccount().getUsername();
				if (sourceUserName.equals(username)) {
					accounts[i].deposit(amount);
					System.out.println("Deposit success!");
					break;
				}
			}
		}
	}

	public void withdraw(String username, String password, double amount) {
		if (amount > 0) {
			for (int i = 0; i < accountCounter; i++) {
				String sourceUserName = accounts[i].getUserAccount().getUsername();

				if (sourceUserName.equals(username)) {
					if (accounts[i].hasAccess(password)) {
						if (amount < accounts[i].getBalance()) {
							accounts[i].withdraw(amount);
							System.out.println("Withdraw success!");
							break;
						} else {
							System.out.println("Withdraw less money!");
						}
					}
				}
			}

		} else {
			System.out.println("Withdraw failed");
		}

	}

	public void transfer(String username, String password, double amount, String recipient) {
		Account sourceAccount = null;
		Account recipientAccount = null;
		for (int i = 0; i < accountCounter; i++) {
			String sourceUserName = accounts[i].getUserAccount().getUsername();

			if (sourceUserName.equals(username)) {
				if (accounts[i].hasAccess(password)) {
					sourceAccount = accounts[i];
				}
			}
		}

		for (int i = 0; i < accountCounter; i++) {
			if (accounts[i].getUserAccount().getUsername().equals(recipient)) {
				recipientAccount = accounts[i];
			}
		}

		if (sourceAccount != null && recipientAccount != null && amount > 0 && amount <= sourceAccount.getBalance()) {
			sourceAccount.withdraw(amount);
			recipientAccount.deposit(amount);
			System.out.println("Transfer success!");

		} else {
			System.out.println("Transfer failed!");
		}
	}

	public double getAssets() {
		double bankAssets = 0;
		for (int i = 0; i < accountCounter; i++) {
			bankAssets += accounts[i].getBalance();
		}
		return bankAssets;
	}

}
