package homework3;
import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		System.out.printf("Eneter %d numbers: ", N);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int maxLen = 1;
		int count = 1;
		int indS = 0;
		int indE = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				count++;
				if (count > maxLen) {
					indS = i - count + 2;
					indE = i + 2;
					maxLen = count;
				}
			} else {

				count = 1;

			}
		}

		for (int i = indS; i < indE; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
