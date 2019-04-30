package homework5.bankmanagement;

import java.util.Scanner;

public class Task3_BankManagement {

	public static void main(String[] args) {

		Bank bank = new Bank("ItsoBank", 5); 
//		Bank bank = new Bank(); 
		Scanner sc = new Scanner(System.in);
		String row;


		while( ! (row = sc.nextLine()).equalsIgnoreCase(("END"))){

			String[] split = row.split(" ");
			
			if(split.length < 3) {
				System.out.println("Enter proper numbers of params");
				continue;
			}
			String command = split[0];
			String username = split[1].trim();
			String password = split[2].trim();
			
			String name = "";
			if (split.length > 3) {
				name = split[3].trim();
			}

			String str = "";
			if(split.length > 4) {
				str = split[4].trim();
			}

			switch(command.toUpperCase()){
			case "OPEN":
				bank.openAccount(name, str, username, password);
				break;
			case "CLOSE":
				bank.closeAccount(username, password);
				break;
			case "DEPOSIT":
				bank.deposit(username, Double.parseDouble(password));
				break;
			case "WITHDRAW":
				bank.withdraw(username, password, Double.parseDouble(name));
				break;
			case "TRANSFER":
				bank.transfer(username, password, Double.parseDouble(name), str);
				break;	
				
			default:
				System.out.println("Wrong command");
				break;
			}
		}
		
		for (int i = 0; i < bank.getAccountCounter(); i++ ) {
			String name = bank.getAccounts()[i].getName();
			String id = bank.getAccounts()[i].getGovId();
			double money = bank.getAccounts()[i].getBalance();
			System.out.printf("Name:%s, GovID: %s, Balance: %.2f\n", name, id, money);
			
		}
		System.out.println("Bank assets:" + bank.getAssets());
		
		sc.close();
	}


	}

