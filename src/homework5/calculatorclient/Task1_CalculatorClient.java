package homework5.calculatorclient;

import java.util.Scanner;

public class Task1_CalculatorClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator();
		double res = 0;
		String row = sc.nextLine();
		while (!row.equals("END")) {

			String[] fields = row.split(" ");
			String command = fields[0].trim();
			double a = Double.parseDouble(fields[1].trim());
			double b = Double.parseDouble(fields[2].trim());

			if (command.equals("SUM")) {
				res = calc.sum(a, b);

			}
			if (command.equals("SUB")) {
				res = calc.subtract(a, b);
				}
			
			if (command.equals("MUL")) {
				res = calc.multiply(a, b);

			}
			if (command.equals("DIV")) {
				if (b == 0 ) {
					System.out.println("Devission by zero is forbiden!");
					row = sc.nextLine();
				} else {
				res = calc.devide(a, b);
				}
			}
			if (command.equals("PER")) {
				res = calc.percentage(a, b);

			}

			System.out.printf("\t%.3f\n", res);
			row = sc.nextLine();
		}
		sc.close();
	}

}
