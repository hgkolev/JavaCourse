package homework2;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5_PersonCharacteristics {

	public static void main(String[] args) {
		// Enter a positive number in loop
		Scanner sc = new Scanner(System.in);
		String number;
		int intInputValue = 0;

		do {
			System.out.print("Please, enter a positive number: ");
			number = sc.next();
			try {
				intInputValue = Integer.parseInt(number);
				continue;
			} catch (NumberFormatException ne) {

			}
		} while (intInputValue <= 0);
		for (int i = 1; i <= intInputValue; i++) {
			PersonCharacteristics();// Here is the method
		}
		sc.close();

	}

	public static void PersonCharacteristics() {

		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String birthYear;
		String weight;
		String height;
		String occup;

		do {
			System.out.print("First name: ");
			firstName = input.nextLine();
		} while (!firstName.matches("[a-zA-Z]+"));

		do {
			System.out.print("Last name: ");
			lastName = input.nextLine();
		} while (!lastName.matches("[a-zA-Z]+"));

		int birthYearValue = 0;
		do {
			System.out.print("Birth year: ");
			birthYear = input.nextLine();
			try {
				birthYearValue = Integer.parseInt(birthYear);
				continue;
			} catch (NumberFormatException ne) {
			}
		} while (birthYearValue <= 0);

		float weightValue = 0;
		do {
			System.out.print("Weight: ");
			weight = input.nextLine();
			try {
				weightValue = Float.parseFloat(weight);
				continue;
			} catch (NumberFormatException ne) {
			}
		} while (weightValue <= 0);
		
		short heightValue = 0;
		do {
			System.out.print("Height: ");
			height = input.nextLine();
			try {
				heightValue = (short) Integer.parseInt(height);
				continue;
			} catch (NumberFormatException ne) {
			}
		} while (heightValue <= 0);

		do {
			System.out.print("Occupation: ");
			occup = input.nextLine();
		} while (!occup.matches("[a-zA-Z]+"));

		int now = Calendar.getInstance().get(Calendar.YEAR);
		int age = now - birthYearValue;
		
	//	input.close();
		
		if (age < 18) {
			System.out.printf(firstName + " " + lastName + " is %d years. "
					+ "His weight is %f and he is %d cm tall. He is a %s."
					, age, weightValue, heightValue, occup);
			System.out.println();
			System.out.println(firstName + " " + lastName + " is under-aged.");
		} else {
			System.out.printf(firstName + " " + lastName + " is %d years. "
					+ "His weight is %f and he is %d cm tall. He is a %s."
					, age, weightValue, heightValue, occup);
		}
		}

	}

