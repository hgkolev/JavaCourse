package homework2;
import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer: ");
		number = sc.nextInt();
		sc.close();

		if (number < 0) {
			System.err.println("This number is negative!");
		} else {
			String binaryNumber = "";
			String hexNumber = Integer.toHexString(number);
			while (number > 0) {
				binaryNumber = ((number % 2) == 0 ? "0" : "1") + binaryNumber;
				number = number / 2;
			}
			System.out.printf("Binary number of %d is %s \n", number, binaryNumber);
//			System.out.printf("Binary number of %d is %s", number, Integer.toString(number, 2));
			System.out.printf("Hex number of %d is %S \n", number, hexNumber);
		}
	}
}
