package homework3;
import java.util.Scanner;

public class Task3e_ConvertibleStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter string to check if it is contained in the first one: ");
		String input = sc.nextLine();
		
		char[] Arr1 = str.toCharArray();
		char[] Arr2 = input.toCharArray();
		int i = 0;
		int j = 0;
		while (j < Arr2.length && i < Arr1.length) {
			if (Arr1[i] == Arr2[j]) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		if (j < Arr2.length) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		sc.close();
}
		
}


