package homework3;
import java.util.Scanner;

public class Task2c_PrintClusterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number of array items: ");
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		int countCluster = 0;
		boolean inCluster = false;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				if (!inCluster) {
					inCluster = true;
					countCluster++;
				}
			} else {
				inCluster = false;
			}

		}
		System.out.println("The number of clusters is : " + countCluster);
}
}



