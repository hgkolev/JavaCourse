package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string: ");
		String str = sc.nextLine();

		sc.close();
		str = str.toLowerCase();
		char[] cAr = str.toCharArray();
		int len = cAr.length;
		Arrays.sort(cAr);
//		char[] ch = new char[len];

//		for (char c : cArr) {
//			System.out.print(c);
//		}
//		
//		System.out.println();

		for (int i = 0; i < len;) {
			int count = 0;

			for (int j = 0; j < len; j++) {
				if (cAr[i] == cAr[j]) {
					count++;
				}

			}

			if (count >= 1) {
				System.out.println(cAr[i] + "(" + count + ")");
				i = i + count;
			} else {
				i++;
			}
		}

	}

}
