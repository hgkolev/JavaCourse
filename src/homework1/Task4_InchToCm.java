package homework1;

public class Task4_InchToCm {

	public static void main(String[] args) {
		/* Conversion of Inch to centimeter */
		
		final float in = 2.54f; // 1 inch = 2.54 cm.
		float a = 12.00f;
		float b = 23.23f;
		float r1 = a * in;
		float r2 = b * in;
			
		System.out.println("12 inches are equal to " + r1 + " cm.");
		System.out.println("23.23 inches are equal to " + r2 + " cm.");

	}

}
