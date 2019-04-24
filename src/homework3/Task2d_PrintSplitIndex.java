package homework3;
import java.util.Scanner;

public class Task2d_PrintSplitIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int temp = 0;
		int leftSum = 0;
		int rigthSum = 0;
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr = sumArr + arr[i];
		}
		
		for (int i =0; i< arr.length -1; i++) {
			sumArr = sumArr - arr[i];
			rigthSum = sumArr;
			leftSum = leftSum + arr[i];
			
			if (rigthSum == leftSum) {
				temp = i;
				break;
			}
		}

		if (temp == 0) {
			System.out.println("NO");
		} else {
			System.out.println(temp);
		}
	}

}
