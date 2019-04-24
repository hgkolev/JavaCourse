package homework2;
import java.util.Scanner;

public class Task2a_PrintSumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		
			int[] numbers = new int[number];
			
			System.out.printf("Enter a string of these %d numbers :", number);
			int temp = 0;
			for (int i = 0; i < number; i++) {
				numbers[i] = sc.nextInt();
				temp = temp + numbers[i];
			}
				System.out.println("The sum of these numbers is : "+ temp);
				sc.close();
		}

}
