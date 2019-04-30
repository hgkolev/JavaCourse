package homework5.credentialsmanager;
import java.util.Scanner;

public class Task2_CredentialsManager{

	private Credentials[] credentials = new Credentials[200];
	private int credentialCount = 0;

	public Task2_CredentialsManager() {
	}

	public static void main(String[] args){
		
		Task2_CredentialsManager manager = new Task2_CredentialsManager();
		Scanner sc = new Scanner(System.in);
		String row;



		while( ! (row = sc.nextLine()).equalsIgnoreCase(("END"))){

			String[] split = row.split(" ");
			
			if(split.length < 3) {
				System.out.println("Enter 3 params");
				continue;
			}
			String command = split[0];
			String target = split[1].trim();
			String targetPass = split[2].trim();

			String newPass = null;

			if(split.length == 4) {
				newPass = split[3].trim();
			}

			switch(command.toUpperCase()){
			case "ENROLL":
				manager.enroll(target, targetPass);
				break;
			case "CHPASS":
				manager.changePassword(target, targetPass, newPass);
				break;
			case "AUTH":
				manager.auth(target, targetPass);
				break;
			default:
				// wrong command
				break;
			}
		}
		
		sc.close();
	}

	private void auth(String target, String targetPass) {
		for (int i = 0; i < credentialCount; i++) {
			String source = credentials[i].getUsername();

			if( source.equalsIgnoreCase(target) ){
				if(credentials[i].matchPassword(targetPass)) {
					System.out.println("User " + source + " authenticated");
				} else{
					System.out.println("User " + source + " authentication failed");
				}

				break;
			}
		}
	}

	private void changePassword(String username, String oldPassword, String newPassword) {
		for (int i = 0; i < this.credentialCount; i++) {
			String source = credentials[i].getUsername();

			if( source.equalsIgnoreCase(username) ){

				boolean changePasswordSuccessful = credentials[i].tryChangePassword(oldPassword, newPassword);

				if( changePasswordSuccessful ){
					System.out.println("CHPASS success");
				} else{
					System.out.println("CHPASS fail");
				}

				break;
			}
		}
	}

	private void enroll(String target, String targetPass) {
		this.credentials[this.credentialCount++] = new Credentials(target, targetPass);
		System.out.println("ENROLL success");
		System.out.println("Total users: " + this.credentialCount);
	}



}