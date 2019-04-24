package homework2;

import java.util.Scanner;

public class Task0d_ReadNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {

			int[] numbers = new int[number];

			System.out.printf("Enter a string of %d numbers :", number);

			for (int i = 0; i < number; i++) {
				numbers[i] = sc.nextInt();
			}
			for (int takenNumber : numbers) {
				System.out.println(takenNumber);
			}
		}
		sc.close();
		}
	

}
