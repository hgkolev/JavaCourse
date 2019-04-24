package homework1;
import java.util.Calendar;

public class Task7_PersonCharacteristics {

	public static void main(String[] args) {
		/* Use proper data type to characterize a person 
		  Georgi Georgiev is 12 years old. His weight is 48.3 and he is
				156 cm tall. He is a student.  */
		
		String firstName = "Georgi";
		String lastName = "Georgiev";
		short birthYear = 2002;
		int now = Calendar.getInstance().get(Calendar.YEAR);
		int age = now - birthYear;
		float w =  48.3f;
		short h = 156;
		String occup = "student";
		
		System.out.println(firstName + " " + lastName + " is " + age + " years old. "
				+ "His weight is " + w + " and he is " + h + " cm tall. "
						+ "He is a " + occup);

	}

}
