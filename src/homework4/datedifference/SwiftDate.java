package homework4.datedifference;

import java.util.Scanner;

public class SwiftDate {
	private int year;
	private int month;
	private int day;

	public SwiftDate(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean isLeapYear(int y) {
		boolean leapYear = false;
		if ((y % 4 == 0 && y % 100 != 0 && y!=0) || (y % 400 == 0)) {
			leapYear = true;
		}
		return leapYear;
	}

	public int getCentury() {
		int century = 0;
		if (year % 100 == 0) {
			century = year / 100;
		} else {
			century = (year / 100) + 1;
		}
		return century;
	}

	public long upToYearsInDays(int year, int month, int day) {
		long yearInDays = 0l;
		int daysMonth = 0;
		int monthDays[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear(year)) {
			monthDays[1] = 29;
		}

		int leap = 0;
			for (int y = 0; y < year; y++) {
				if (isLeapYear(y)) {
					if(y == year &&(month ==1 ||( month == 2 && day != 29))) {
					} else {
					leap += 1;
					}
				}
			}
//		}

		for (int b = 0; b < month - 1; b++) {
			daysMonth = daysMonth + monthDays[b];
		}
		yearInDays = year * 365 + leap + daysMonth + day;

		return yearInDays;
	}

	public int getDaysDifference(SwiftDate other) {
		int difference = 0;

		difference = (int) (Math.abs(upToYearsInDays(this.year, this.month, this.day)
				- upToYearsInDays(other.year, other.month, other.day))+1);

		return difference;
	}

	public void printInfo() {
		System.out.printf("%d %02d %02d - %d century.", this.getYear(), this.getMonth(), this.getDay(),
				this.getCentury());
		if (isLeapYear(year)) {
			System.out.println("It is LEAP year.");
		} else {
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two dates formated \"yyyy mm dd\" : ");

		int year1 = sc.nextInt();
		int month1 = sc.nextInt();
		int day1 = sc.nextInt();
		int year2 = sc.nextInt();
		int month2 = sc.nextInt();
		int day2 = sc.nextInt();

		SwiftDate date1 = new SwiftDate(year1, month1, day1);
		SwiftDate date2 = new SwiftDate(year2, month2, day2);

		int diff = date2.getDaysDifference(date1);

		System.out.println(diff);
		date1.printInfo();
		date2.printInfo();

		sc.close();

	}

}
