package homework1;

public class Task3_CalculateExpression {

	public static void main(String[] args) {
		/* Calculate the following expression 
		( 3291 + 88581 ) / 14 + ( 1116 % 171 ) * 5 – 312 / ( 4 + 18 ) =
		  6562.285714285710   +      90 * 5        -  14.18181818
		*/

		float exp = ( 3291 + 88581 ) / 14f;
		exp+= ( 1116 % 171 ) * 5;
		exp-= 312f / ( 4 + 18 );
		System.out.println("The sxpression gives " + exp + " as a results");
		
	}

}
