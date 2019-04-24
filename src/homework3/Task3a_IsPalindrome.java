package homework3;
import java.util.Scanner;

public class Task3a_IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string: ");
		String strIn = sc.nextLine();
		
		sc.close();

		char[] cArr = strIn.toCharArray();
		int len = cArr.length;
		String revStr = "";

		for (int i = len-1; i >= 0; i--) {
			revStr = revStr + cArr[i];
		}

		if (strIn.equals(revStr)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
