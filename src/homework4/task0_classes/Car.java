package homework4.task0_classes;
import java.util.Calendar;

public class Car {
	private String brand;
	private String model;
	private int hp;
	private int year;

	public Car(String brand, String model, int hp, int year) {
		this.brand = brand;
		this.model = model;
		this.hp = hp;
		this.year = year;
	}

//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}

//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}

//	public int getHp() {
//		return hp;
//	}
//
//	public void setHp(int hp) {
//		this.hp = hp;
//	}

	public String insuranceCategory() {
		String cat = "";
		int now = Calendar.getInstance().get(Calendar.YEAR);
		int old = now - year;
		if (old > 0 && old <= 8) {
			cat = "Category 1";
		} else if (old > 8 && old <= 15) {
			cat = "Category 2";
		} else if (old > 15 && old <= 25) {
			cat = "Category 3";
		} else if (old > 25) {
			cat = "Category 4";
		}

		return cat;
	}

	public float tax(String cat) {
		float toPay = 0;
		if (cat.equals("Category 1") && this.hp < 80) {
			toPay = (float) (150 * 1.2);
		} else if (cat.equals("Category 1") && this.hp > 140) {
			toPay = (float) (150 * 1.45);
		} else if (cat.equals("Category 1") && this.hp > 80 && this.hp < 140) {
			toPay = (float) (150);
		} else if (cat.equals("Category 2") && this.hp < 80) {
			toPay = (float) (200 * 1.2);
		} else if (cat.equals("Category 2") && this.hp > 140) {
			toPay = (float) (200 * 1.45);
		} else if (cat.equals("Category 2") && this.hp > 80 && this.hp < 140) {
			toPay = (float) (200);
		} else if (cat.equals("Category 3") && this.hp < 80) {
			toPay = (float) (300 * 1.2);
		} else if (cat.equals("Category 3") && this.hp > 140) {
			toPay = (float) (300 * 1.45);
		} else if (cat.equals("Category 3") && this.hp > 80 && this.hp < 140) {
			toPay = (float) (300);
		} else if (cat.equals("Category 4") && this.hp < 80) {
			toPay = (float) (500 * 1.2);
		} else if (cat.equals("Category 4") && this.hp > 140) {
			toPay = (float) (500 * 1.45);
		} else if (cat.equals("Category 4") && this.hp > 80 && this.hp < 140) {
			toPay = (float) (500);
		}
		return toPay;
	}

	public static void main(String[] args) {

		Car c1 = new Car("Mercedes-Benz", "S220", 160, 2009);
		Car c3 = new Car("Bugatti", "Veyron ", 612, 2015);
		Car c2 = new Car("Opel", "Astra", 85, 1996);
		Car c4 = new Car("Lada", "5", 75, 1989);

		System.out.printf(c1.insuranceCategory() + " - " + c1.tax(c1.insuranceCategory()) + "\n");
		System.out.printf(c2.insuranceCategory() + " - " + c2.tax(c2.insuranceCategory()) + "\n");
		System.out.printf(c3.insuranceCategory() + " - " + c3.tax(c3.insuranceCategory()) + "\n");
		System.out.printf(c4.insuranceCategory() + " - " + c4.tax(c4.insuranceCategory()) + "\n");

	}
}
