package homework4.personcharacteristics;

import java.util.Calendar;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	private float weight;
	private int height;
	private String occup;
	private char gender;
	private float grade1;
	private float grade2;
	private float grade3;
	private float grade4;
	// private float[] arrMarks = new float[4];
	// private float average = 0f;

	public Person() {

	}

	public Person(String firstName, String lastName, int birthYear, float weight, int height, String occup, char gender,
			float grade1, float grade2, float grade3, float grade4) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.weight = weight;
		this.height = height;
		this.occup = occup;
		this.gender = gender;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getOccup() {
		return occup;
	}

	public void setOccup(String occup) {
		this.occup = occup;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	public float getGrade3() {
		return grade3;
	}

	public void setGrade3(float grade3) {
		this.grade3 = grade3;
	}

	public float getGrade4() {
		return grade4;
	}

	public void setGrade4(float grade4) {
		this.grade4 = grade4;
	}

	public int calcAge() {
		int now = Calendar.getInstance().get(Calendar.YEAR);
		return now - this.getBirthYear();
	}

	public float calcAverage() {
		return (this.getGrade1() + this.getGrade2() + this.getGrade3() + this.getGrade4()) / 4;
	}

	public void printInfo() {
		if (this.calcAge() < 18) {
			if (Character.toString(this.getGender()).matches("M|m")) {
				System.out.printf(
						this.getFirstName() + " " + this.getLastName() + " is %d years old. "
								+ "His weight is %.1f and he is %d cm tall. He is a %s with an average grade of %.3f.",
						this.calcAge(), this.getWeight(), this.getHeight(), this.getOccup(), this.calcAverage());
				System.out.println();
				System.out.println(this.getFirstName() + " " + this.getLastName() + " is under-aged.");
			}
			if (Character.toString(this.getGender()).matches("F|f")) {
				System.out.printf(this.getFirstName() + " " + this.getLastName() + " is %d years old. "
						+ "Her weight is %.1f and she is %d cm tall. She is a %s with an average grade of %.3f.",
						this.calcAge(), this.getWeight(), this.getHeight(), this.getOccup(), this.calcAverage());
				System.out.println();
				System.out.println(this.getFirstName() + " " + this.getLastName() + " is under-aged.");
			}

		} else {
			if (Character.toString(this.getGender()).matches("M|m")) {
				System.out.printf(
						this.getFirstName() + " " + this.getLastName() + " is %d years old. "
								+ "His weight is %.1f and he is %d cm tall. He is a %s with an average grade of %.3f.",
						this.calcAge(), this.getWeight(), this.getHeight(), this.getOccup(), this.calcAverage());
				System.out.println();
			}
			if (Character.toString(this.getGender()).matches("F|f")) {
				System.out.printf(
						this.getFirstName() + " " + this.getLastName() + " is %d years old. "
								+ "Her weight is %.1f and he is %d cm tall. She is a %s with an average grade of %.3f.",
						this.calcAge(), this.getWeight(), this.getHeight(), this.getOccup(), this.calcAverage());
				System.out.println();
			}
		}
	}

}
