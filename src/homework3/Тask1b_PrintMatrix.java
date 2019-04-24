package homework3;

public class Òask1b_PrintMatrix {

	public static void main(String[] args) {

		int[][] ma3x = new int[4][4];
		int one = 0;

		for (int col = 0; col < ma3x.length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < ma3x[col].length; row++) {
					ma3x[row][col] = ++one;
				}
			} else {
				for (int row = ma3x.length - 1; row >= 0; row--)
					ma3x[row][col] = ++one;
			}
		}

		for (int[] rows : ma3x) {
			for (int element : rows) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
