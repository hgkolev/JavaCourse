package homework1;

public class Task2_LeapYear {

/*  The leap year is when the number can be divided by 4 without residue.
	If numbers are multiples of 100 the years are not leaping, 
	but they are leaping if numbers are multiplies of 400. */
	
	public static void main(String[] args) {
		int y1 = 2016;
		System.out.println("Year 2016 is leap year: " + (((y1%4==0 && y1%100!=0) || (y1%400==0)) ? true : false));
		
		int y2 = 1992;
		System.out.println("Year 1992 is leap year: " + (((y2%4==0 && y2%100!=0) || (y2%400==0)) ? true : false));
		
		int y3 = 2001;
		System.out.println("Year 2001 is leap year: "+ (((y3%4==0 && y3%100!=0) || (y3%400==0)) ? true : false));
		
		int y4 = 1900;
		System.out.println("Year 1900 is leap year: " + (((y4%4==0 && y4%100!=0)  || (y4%400==0)) ? true : false));
		
		int y5 = 2400;
		System.out.println("Year 2400 is leap year: " + (((y5%4==0 && y5%100!=0)  || (y5%400==0)) ? true : false));
		

	}

}
