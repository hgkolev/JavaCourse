package homework3;

public class Task0d_Print2dArray {

	public static void main(String[] args) {

		int[][] ma3x = new int[4][4];
		int one = 0;

		for (int i = 0; i < ma3x.length; i++) {
			for (int j = 0; j < ma3x[i].length; j++) {
				ma3x[i][j] = ++one;
			}
		}

		for (int[] row : ma3x) {
			for (int element : row) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
