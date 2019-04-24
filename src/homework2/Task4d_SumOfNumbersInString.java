package homework2;
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text with numbers here: ");

		str = input.nextLine();

		input.close();

		String number = str.replaceAll("[^0-9]+", " ");

		String[] sNumber = number.trim().split(" ");
		int k = 0;
		for (String s : sNumber) {
			k = k + Integer.parseInt(s);
		}

		System.out.printf("The sum of numbers is %d.", k);

	}

}
