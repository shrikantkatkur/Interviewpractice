package arrayprograms;

public class TwoDimensionalArray {

	public static void readCompleteTable(int[][] a, int rows, int cols) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + "|");
			}
			System.out.println();
		}
	}

	public static void readRow(int[][] a, int rowNumber) {
		int r = rowNumber;
		for (int c = 0; c < a[rowNumber].length; c++) {
			System.out.print(a[rowNumber][c]+"|");
		}
		System.out.println();
	}

	public static void readCol(int[][] a, int colNumber) {
		int c = colNumber;
		for (int r = 0; r < a.length; r++) {
			System.out.println(a[r][colNumber]);
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 50, 500 }, { 100, 10 }, { 3, 7 } };
		
		//readCompleteTable(a,4,2);
		//readRow(a,2);
		readCol(a,0);

	}

}
