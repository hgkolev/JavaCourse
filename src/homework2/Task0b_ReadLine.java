package homework2;
import java.util.Scanner;

public class Task0b_ReadLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String yourText;
		System.out.print("Enter your text: ");
		yourText = scanner.nextLine();
		
		System.out.print("Your text is :" + yourText);
		
		scanner.close();

	}

}
