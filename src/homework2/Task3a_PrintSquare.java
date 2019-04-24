package homework2;
import java.util.Scanner;

public class Task3a_PrintSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		sc.close();

		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			int[][] ma3x = new int[number][number];
			for (int i = 0; i < ma3x.length; i++) {
				for (int j = 0; j < ma3x[i].length; j++) {
					if ((i == 0 || j == 0) || (i == (ma3x.length - 1) || (j == ma3x.length - 1))) {
						ma3x[i][j] = 1;
					} else {
						ma3x[i][j] = 0;
					}
				}
			}

			for (int i = 0; i < ma3x.length; i++) {
				for (int j = 0; j < ma3x.length; j++) {
					System.out.print((ma3x[i][j]==1) ? "* " : "  ");
					if (j == ma3x[i].length - 1) {
						System.out.println();
					}
				}
			}
		}
	}
}
