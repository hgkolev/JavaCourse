package homework1;

public class Task6_SecondsInBiggerIntervals {

	public static void main(String[] args) {
		/* Convert Seconds to Days, Hours, Minutes and Seconds*/
		
			int s = 3600;
			int rs = s%60;
			int m = s/60;
			int rm = m%60;
			int h = m/60;
			int rh = h%24;
			int d = h/24;
	
			System.out.println(s + " Seconds = " + d + " Days and " + rh + " Hours and " + rm + " Minutes and " + rs + " Seconds.");

			int S = 1234567;
			int RS = S%60;
			int M = S/60;
			int RM = M%60;
			int H = M/60;
			int RH = H%24;
			int D = H/24;
	
			System.out.println(S + " Seconds = " + D + " Days and " + RH + " Hours and " + RM + " Minutes and " + RS + " Seconds.");

			int S1 = 129600;
			int RS1 = S1%60;
			int M1 = S1/60;
			int RM1 = M1%60;
			int H1 = M1/60;
			int RH1 = H1%24;
			int D1 = H1/24;
	
			System.out.println(S1 + " Seconds = " + D1 + " Days and " + RH1 + " Hours and " + RM1 + " Minutes and " + RS1 + " Seconds.");

			// Idea from Internet. Shorter!
			int sec = s % 60;
		    int min = (s / 60)%60;
		    int hours = (s/60)/60;
		    int days = ((s/60)/60)/24;
		    
		    System.out.println(s + " Seconds = " + days + " Days and " + hours + " Hours and " + min + " Minutes and " + sec + " Seconds.");
		    
	}

}
