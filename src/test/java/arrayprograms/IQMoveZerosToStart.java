package arrayprograms;

public class IQMoveZerosToStart {

	public static void main(String[] args) {
		int x[] = { 2, 4, 0, 5, 0, 3, 11, 0, -4, 0, 0 };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}
		System.out.println("------");
		for (int i = x.length-1; i >=0; i--) {
			for (int j = i - 1; j >=0; j--) {
				if (x[i] == 0) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}

	}

}
