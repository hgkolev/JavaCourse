package homework4.task3;

import java.util.Scanner;

public class Task3_VehicleMonitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double fuelPrice = 0.0;
		System.out.print("Enter N (number of vehicles): ");
		n = sc.nextInt();
		System.out.print("Enter fuel price: ");
		fuelPrice = sc.nextDouble();
		sc.nextLine();

		Vehicle[] vehicleArr = new Vehicle[n];

		for (int i = 0; i < n; i++) {
			System.out.println("<type>, <model>, <power>, <fule consumption>, "
					+ "<year produced>, <distance>,<weight>[, <color>]: ");
			String row = sc.nextLine();
			String licenseNo = generateLicenseNo(i + "");

			String[] fields = row.split(",");
			String type = fields[0].trim();
			String model = fields[1].trim();
			int power = Integer.parseInt(fields[2].trim());
			float fuelConsumption = Float.parseFloat(fields[3].trim());
			int yearProduced = Integer.parseInt(fields[4].trim());
			int distance = Integer.parseInt(fields[5].trim());
			int weight = 0;
			if (fields.length > 6) {
				weight = Integer.parseInt(fields[6].trim());
			}
			String color = "N/A";
			if (fields.length > 7) {
				color = fields[7].trim();
			}

			vehicleArr[i] = new Vehicle(type, model, power, fuelConsumption, yearProduced, licenseNo, distance, weight,
					color);

		}

		for (Vehicle vehicle : vehicleArr) {
			vehicle.printInfo(fuelPrice);

		}
		System.out.println();
		sc.close();
	}

	public static String generateLicenseNo(String str) {
		if (str.length() < 4) {
			return generateLicenseNo(0 + str);
		} else {
			return str;
		}

	}

}
