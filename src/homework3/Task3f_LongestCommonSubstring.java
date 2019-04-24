package homework3;
import java.util.Scanner;

public class Task3f_LongestCommonSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter second : ");
		String input = sc.nextLine();

		char[] arr1 = str.toCharArray();
		char[] arr2 = input.toCharArray();
		int[][] T = new int[arr1.length][arr2.length];

		int max = 0;
		int indE = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if(i==0 || j==0){
						T[i][j]=1;
				} else {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				if (max < T[i][j]) {
					max = T[i][j];
					indE = i;
				}
			}
		}
		}
		for (int i = indE - max+1; i < indE+1; i++) {
			System.out.print(arr1[i]);
		}
		sc.close();

	}

}
