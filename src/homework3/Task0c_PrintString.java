package homework3;
import java.util.Scanner;

public class Task0c_PrintString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string: ");
		String str = sc.next();
		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			System.out.println(c);
		}
		sc.close();
	}
}
