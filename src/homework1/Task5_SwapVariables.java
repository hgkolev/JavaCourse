package homework1;

public class Task5_SwapVariables {

	public static void main(String[] args) {
		/* Exchange values of two variables */
		
			int a = 5;
			int b = 9;
			int c = a;
			a = b;
			b = c;
			System.out.println("exchanged values of 5 9 are " + a + " " + b);
 
			int d = 7;
			int e = 11;
			int f = a;
			d = e;
			e = f;
			System.out.println("exchanged values of 7 11 are " + d + " " + e);
		
		//Using XOR
			int x = 5;
			int y = 9;
			x = x ^ y; 
			y = y ^ x; 
			x = x ^ y;
			System.out.println("exchanged values of 5 9 are " + x + " " + y);
			
			int p = 7;
			int q = 11;
			p = p ^ q; 
			q = q ^ p; 
			p = p ^ q;
			System.out.println("exchanged values of 7 11 are " + p + " " + q);
			
			int r = 7;
			int s = 11;
			r = r + s; 
			s = r - s; 
			r = r - s;
			System.out.println("exchanged values of 7 11 are " + r + " " + s);
	}

}
