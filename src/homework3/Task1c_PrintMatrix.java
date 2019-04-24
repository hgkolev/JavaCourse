package homework3;

public class Task1c_PrintMatrix {

	public static void main(String[] args) {
		int one = 1;
		int ma3x[][] = new int[4][4];
		int col = 0, row = 0;
		boolean isUp = true; // Direction changer

		// Traverse the matrix
		for (int k = 0; k < ma3x.length * ma3x.length;) {

			if (isUp) {
				for (; row >= 0 && col < ma3x.length; col++, row--) {
					ma3x[row][col] = one++;
					k++;
				}

				if (row < 0 && col <= ma3x.length - 1)
					row = 0;
				if (col == ma3x.length) {
					row = row + 2;
					col--;
				}
			} else {
				for (; col >= 0 && row < ma3x.length; row++, col--) {
					ma3x[row][col] = one++;
					k++;
				}
				if (col < 0 && row <= ma3x.length - 1) {
					col = 0;
				}
				if (row == ma3x.length) {
					col = col + 2;
					row--;
				}
			}

			isUp = !isUp; // direction revert
		}

		for (int[] rows : ma3x) {
			for (int element : rows) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
