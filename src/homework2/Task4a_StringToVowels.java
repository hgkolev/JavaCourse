package homework2;
import java.util.Scanner;

public class Task4a_StringToVowels {

	public static void main(String[] args) {
		String str;
		System.out.println("Eneter your string : ");
		Scanner input = new Scanner(System.in);
		str = input.nextLine();

		input.close();

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] != 'a') && (charArray[i] != 'e') && (charArray[i] != 'o') && (charArray[i] != 'u')
					&& (charArray[i] != 'i') && (charArray[i] != 'y')) {
				char conChar = charArray[i];
				System.out.print(conChar);
			}
		}

	}

}
