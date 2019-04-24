package homework3;

//import java.util.Arrays;
import java.util.Scanner;

public class Task0b_ReadArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int myArray : arr) {
			System.out.print(myArray + ", ");
		}
		sc.close();
	}

}
