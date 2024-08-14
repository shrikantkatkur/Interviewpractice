package julyinterviewpractice;

public class MoveZerosFirst {

	public static void main(String[] args) {
		int[] x = { 10, 1, 0, 45, 0, 12, 0, 23, 0 };

		for (int i = x.length-1; i >=0; i--) {
			for (int j = i - 1; j >=0; j--) {
				if (x[i] == 0) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for(int x1:x) {
			System.out.print(x1+",");
		}
	}

}
