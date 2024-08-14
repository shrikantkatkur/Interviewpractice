package arrayprograms;

public class Interview {

	
	public static void method(int []x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				x[count] = x[i];
				count++;
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}
		
	}
	public static void main(String[] args) {
		int x[] = { 1, 2, 0, 5, 0, 3, 9, 0, 8, 0 };
		method(x);

	}

}
