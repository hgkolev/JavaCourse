package homework2;
import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int mirroredNumber = 0;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			while(number != 0)
		      {
		          mirroredNumber = mirroredNumber * 10;
		          mirroredNumber = mirroredNumber + number%10;
		          number = number/10;
		      }
		    System.out.printf("Mirrored number is %d: ", mirroredNumber);
			
		sc.close();
		}
	}

}
