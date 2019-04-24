package homework4.personcharacteristics;

import java.util.Scanner;



public class Task4_PersonCharacteristics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("Enter N (number of persons): ");
		n = sc.nextInt();
		sc.nextLine();
		
		Person[] personArr = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println(
					"Enter person info in format: <first name>, <last name>, <birth year>, <weight>, <height>, "
							+ "<occupation>, <gender(M|F)>, " + "<garde1>, <garde2>, <garde3>, <garde4>");
			String row = sc.nextLine();

			String[] fields = row.split(",");
			String firstName = fields[0].trim();
			String lastName = fields[1].trim();
			int birthYear = Integer.parseInt(fields[2].trim());
			float weight = Float.parseFloat(fields[3].trim());
			int height = Integer.parseInt(fields[4].trim());
			String occup = fields[5].trim();
			char gender = fields[6].trim().charAt(0);
			float grade1 = Float.parseFloat(fields[7].trim());
			Float grade2 = Float.parseFloat(fields[8].trim());
			Float grade3 = Float.parseFloat(fields[9].trim());
			Float grade4 = Float.parseFloat(fields[10].trim());

			personArr[i] = new Person(firstName, lastName, birthYear, weight, height, 
					occup, gender, grade1, grade2, grade3, grade4 );
		}
		for (Person person: personArr) {
			person.printInfo();

		}
		System.out.println();
		sc.close();
	}

}
