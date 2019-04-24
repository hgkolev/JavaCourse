package homework2;
import java.util.Scanner;

public class Task1a_PrintFirstDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
		    while (number >= 10) {
		        number /= 10;
		    }
		    System.out.printf("First Digit is %d: ", number);
			
		sc.close();
	}
	}
}
