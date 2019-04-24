package homework4.task3;

import java.util.Calendar;

public class Vehicle {
	private String type;
	private String model;
	private int power;
	private float fuelConsumption;
	private int yearProduced;
	private String licenseNo;
	private int distance;
	private int weight;
	private String color;
	
	
	public Vehicle() {
		
		this.color = "N/A";
		this.distance = 0;
		this.weight = -1;
	}
	
	public Vehicle(String type, String model, int power, 
			float fuelConsumption, int yearProduced, String licenseNo, 
			int distance, int weight, String color) {
	
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNo = licenseNo;
		this.distance = distance;
		this.weight = weight;
		this.color = color;
			
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(float fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getYearProduced() {
		return yearProduced;
	}

	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double calculateTripPrice (double fuelPrice, double distance) {
		
		return (fuelPrice*getFuelConsumption())*this.getDistance()/100;
	}
	
	
	public double getInsurancePrice() {
		
		double typeCoefficient = 0.0;
		
		int now = Calendar.getInstance().get(Calendar.YEAR);
		int carAge = now - this.getYearProduced();
		
		if (this.type.equals("car")) {
			typeCoefficient = 1.0;
		} else if (this.type.equals("suv")) {
			typeCoefficient = 1.12;
		} else if (this.type.equals("truck")) {
			typeCoefficient = 1.2;
		} else if (this.type.equals("motorcycle")) {
			typeCoefficient = 1.5;
		}
		
		return (0.16*this.getPower()) * (1.25 * carAge ) *  
				( 0.05 * this.getFuelConsumption() ) * typeCoefficient;

	}

	public void printInfo(double fuelPrice) {
		System.out.printf("%s - %s, %d, %s\n", this.getLicenseNo(), this.getModel(), this.getYearProduced(),
				this.getColor());
		System.out.printf("Insurance cost: %.2f - Travel cost: %.2f %n", this.getInsurancePrice(),
				this.calculateTripPrice(fuelPrice, this.getDistance()));
}


}
