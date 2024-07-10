package javaBasicMathCoding;

public class SquareRoot {
	public static void squareRoot(int number) {
		int output=0;
		while(output*output<=number) {
			output++;
		}
		output=output-1;
		System.out.println(output);
	}

	public static void main(String[] args) {
		SquareRoot.squareRoot(49);
	}

}
