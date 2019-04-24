package homework3;
import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		System.out.print("Enter subsequence number: ");
		int m = sc.nextInt();

		System.out.printf("Eneter %d numbers: ", N);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int max = 0;
		int indS = 0;
		int indE = 0;
		int[] sum = new int[N - m + 1];

		for (int i = 0; i <= arr.length - m; i++) {
			sum[i] = 0;
			for (int j = i; j <= i + m - 1; j++) {
				sum[i] = sum[i] + arr[j];

			}
	
			for (int k = 0; k < sum.length - 1; k++) {
				if (sum[k] >= sum[k + 1]) {
					max = sum[k];
					indS = i -1;
					indE = i + m - 1;
				} else {
					max = sum[k+1];
					indS = i ;
					indE = i + m ;
				}
			}
		}
		
		System.out.println(max);
		for (int i = indS; i < indE; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
