package homework2;
import java.util.Scanner;

public class Task0a_ReadInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter an integer: ");
		a = sc.nextInt();
		
		System.out.printf("a+1 = %d", (a+1));
		
		sc.close();

	}

}
