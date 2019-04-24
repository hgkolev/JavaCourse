package homework2;
import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int sumNumberDigits = 0;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			while(number != 0)
		      {
				sumNumberDigits = sumNumberDigits + number%10;
		          number = number/10;
		      }
		    System.out.printf("Sum of number digits is %d. ", sumNumberDigits);
			
		sc.close();
		}
	}

}
