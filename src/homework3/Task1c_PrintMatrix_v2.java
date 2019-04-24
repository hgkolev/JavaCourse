package homework3;

public class Task1c_PrintMatrix_v2 {
	
	public static void main(String[] args) {

		int[][] ma3x = new int[4][4];
		int i = 1; //rows
		int j = 1; //cols
		
		for (int k = 1; k <= ma3x.length * ma3x.length; k++) {
			ma3x[i - 1][j - 1] = k;
			if ((i + j) % 2 == 0) {
				// Even stripes
				if (j < ma3x.length) {
					j++;
				} else {
					i += 2;
				}
				if (i > 1) {
					i--;
				}
			} else {
				// Odd stripes
				if (i < ma3x.length) {
					i++;
				} else {
					j += 2;
				}
				if (j > 1) {
					j--;
				}
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
