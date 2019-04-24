package homework2;
import java.util.Scanner;

public class Task1e_IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean isPrime = true;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		sc.close();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if ((number % i) == 0) {
					isPrime = false;
					break;
				}
			}
				if (isPrime) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}

		}
	}
}
