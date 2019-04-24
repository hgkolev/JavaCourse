package homework2;
import java.util.Scanner;

public class Task4b_PrintCountOfWords {

	public static void main(String[] args) {
		String str;
		char[] digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter your text here: ");

		str = input.nextLine();

		input.close();

		String[] number = str.trim().split(" ");

		int p = number.length;
		for (String s : number) {
			char[] charArray = s.toCharArray();

			for (char c : charArray) {
				for (char d : digit) {
					for (int i = 0; i < charArray.length; i++) {
						if (c == d) {
							p -= 1;
							break;
						}

					}

				}
			}
		}
		System.out.printf("Words are %d", p);

	}

}
