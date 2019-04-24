package homework2;
import java.util.Scanner;

public class Task4c_PrintEverySentence {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter sentences here: ");

		str = input.nextLine();

		input.close();

		String[] number = str.split("(?<=[.!?])\\s");
		for (String s : number) {
			System.out.println(s.trim());
		}
	}
}
