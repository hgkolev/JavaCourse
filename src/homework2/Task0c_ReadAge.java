package homework2;
import java.util.Scanner;

public class Task0c_ReadAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte personAge;
		System.out.print("Enter your age: ");
		personAge = scanner.nextByte();

		if (personAge < 18) {
			System.out.println("You are under-age.");
		} else {
			System.out.println("You are adult.");
		}
		scanner.close();
	}

}
