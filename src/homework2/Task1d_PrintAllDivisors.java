package homework2;
import java.util.Scanner;

public class Task1d_PrintAllDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			for (int i=1; i<=number; i++){
				if (number%i == 0) {
					System.out.print(i+" ");
				}
			}
			
		sc.close();
		}

	}

}
