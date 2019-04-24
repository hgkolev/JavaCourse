package homework3;
import java.util.Scanner;

public class Task3d_BracketMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string of brackets: ");
		String str = sc.nextLine();

		System.out.println(isValid(str));

	}

	/** This code is not mine! I have another logic, 
	but i could not find the way to implement it.
	My idea was to replace all "()", "{}", "[]" with "" 
	and at the end to check what's left. 
	If it is "" we have matching else we have not. */ 
	public static boolean isValid(String str) {
		char[] chArr = new char[str.length()];
		int k = -1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(') {
				chArr[++k] = ')';
			} else if (ch == '[') {
				chArr[++k] = ']';
			} else if (ch == '{') {
				chArr[++k] = '}';
			} else if (k >= 0) {
				char top = chArr[k];

				if (top == ch) {
					k--;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}

		return k < 0;
	}

}
