package homework3;

public class Task1d_PrintMatrix {

	public static void main(String[] args) {
		int[][] ma3x = new int[4][4];
		int one = 1;
		int minCol = 0;  				//Starting column index
		int maxCol = ma3x.length - 1; 	//Ending column index
		int minRow = 0; 				//Starting row index
		int maxRow = ma3x.length - 1;	//Ending row index

		while (one <= ma3x.length * ma3x.length) {
			
			for (int i = minCol; i <= maxCol; i++) {
				ma3x[minRow][i] = one;
				++one;
			}

			for (int i = minRow + 1; i <= maxRow; i++) {
				ma3x[i][maxCol] = one;
				one++;
			}

			for (int i = maxCol - 1; i >= minCol; i--) {
				ma3x[maxRow][i] = one;
				one++;
			}

			for (int i = maxRow - 1; i >= minRow + 1; i--) {
				ma3x[i][minCol] = one;
				one++;
			}
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}

		for (int[] rows : ma3x) {
			for (int element : rows) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
