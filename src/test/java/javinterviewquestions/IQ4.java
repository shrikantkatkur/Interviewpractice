package javinterviewquestions;

public class IQ4 {
//SWAP 5 AND 1, SWAP 8 AND 7 OP=5,1,8,7,33,2,13,11
	public static void main(String[] args) {
		int x[] = { 1, 5, 7, 8, 2, 33, 11, 13 };
		int temp;
		for (int i = 0; i < x.length; i = i + 2) {
			temp = x[i];
			x[i] = x[i + 1];
			x[i + 1] = temp;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}
	}

}
