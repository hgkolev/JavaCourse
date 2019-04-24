package homework3;
import java.util.Scanner;

public class Task3c_CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string to encode/decode: ");
		String str = sc.nextLine();
		System.out.print("Enter encode/decode depending on your wishes: ");
		String input = sc.nextLine();

		if (input.contentEquals("encode")) {
			System.out.println(encode(str));
		}
		if (input.contentEquals("decode")) {
			System.out.println(decode(str));
		}

		sc.close();

	}

	static String encode(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch==' ' || ch =='.' || ch=='!'
					|| ch=='?' || ch==',') {
				s=s+ch;
				continue;
			} else {
			if (Character.isUpperCase(ch)) {
				ch = (char) (((int) ch + 1 - 65) % 26 + 65);
				s = s + ch;
			} else {
				ch = (char) (((int) ch + 1 - 97) % 26 + 97);
				s = s + ch;
			}

		}
		}
		return s;
	}

	static String decode(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch==' ' || ch =='.' || ch=='!'
					|| ch=='?' || ch==',') {
				s=s+ch;
				continue;
			} else {
			if (Character.isUpperCase(ch)) {
				ch = (char) (((int) ch - 1 - 65) % 26 + 65);
				s = s + ch;
			} else {
				ch = (char) (((int) ch - 1 - 97) % 26 + 97);
				s = s + ch;
			}

		}
		}

		return s;
	}

}
