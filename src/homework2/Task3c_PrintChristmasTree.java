package homework2;
import java.util.Scanner;

public class Task3c_PrintChristmasTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		System.out.print("Enter a heigth of the Christmas tree: ");
		height = sc.nextInt();
		sc.close();

		if (height < 0) {
			System.err.println("This number is negative!");
		} else {
			for (int i = 0; i < height - 2; i++) {
				for (int j = 1; j <= height - i - 1; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i * 2 + 1; j++) {
					System.out.print("* ");
				}

				System.out.println();
			}

			for (int i = 0; i < 2; i++) {
				for (int j = 1; j <= height - i - 1; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i * 2 + 1; j++) {
					System.out.print("* ");
				}

				System.out.println();
			}
		}
	}
}