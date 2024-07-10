package arrayprograms;

public class BasicArrayMethods1 {

	public static void main(String[] args) {
		// two method of defining array
		// 1.Creating Array using literal
		int x[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");

		}
		System.out.println();
		// 2 Creating Array using New keyword
		int []y = new int[5];
		y[0] = 6;//Adding element in to array
		y[1] = 7;
		y[2] = 8;
		y[3] = 9;
		y[4] = 10;
		for (int j = 0; j < y.length; j++) {
			System.out.print(y[j] + ",");
		}
		System.out.println();

	}

}
