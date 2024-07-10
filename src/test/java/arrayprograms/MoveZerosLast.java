package arrayprograms;

public class MoveZerosLast {
	public static void moveZeroLast(int x[]) {
		int x1[] = new int[x.length];
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				x1[count] = x[i];
				count++;
			}
		}
		for (int i = 0; i < x1.length; i++) {
			System.out.print(x1[i] + ",");
		}
	}

	public static void main(String[] args) {
		int x[] = { 1, 2, 0, 5, 0, 3, 9, 0, 8, 0 };
		MoveZerosLast.moveZeroLast(x);
	}

}
