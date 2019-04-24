package homework2;
import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();

		if (number < 0) {
			System.err.println("This number is negative!");
		} else {

			int[] numbers = new int[number];

			for (int i = 1; i < (number + 1); i++) {
				System.out.printf("Enter %d number : ", i);
				numbers[i - 1] = sc.nextInt();
			}

			for (int takenNumber : numbers) {
				System.out.print(takenNumber + " ");
			}
		}

		sc.close();
	}
}
