package homework3;
import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		Arrays.sort(arr);
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i + 1];
			} else {
				temp = arr[i];
			}

		}

//		System.out.println("The biggest number is : " + arr[N-1]);
		System.out.println("The biggest number is : " + temp);

		sc.close();

	}

}
