package patternprograms;

public class Sample4KajuKatli {

	public static void main(String[] args) {
		// to print lines
		for (int l = 0; l <= 4; l++) {
			for (int s = 3; s >= l; s--) {
				System.out.print(" ");
			}
			for (int ash = 0; ash <= l; ash++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int l = 3; l >= 0; l--) {
			for (int s = 3; s >= l; s--) {
				System.out.print(" ");
			}
			for (int ash = 0; ash <= l; ash++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
