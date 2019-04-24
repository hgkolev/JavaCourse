package homework2;
import java.util.Scanner;

public class Task2b_PrintReversedSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		
			int[] numbers = new int[number];
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			System.out.printf("Enter a string of %d numbers :", number);

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}
					
				for (int i=numbers.length -1; i >= 0; i--) {					
					System.out.print(numbers[i] + " ");
				}
				sc.close();
		}
	}

}
