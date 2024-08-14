package javaBasicMathCoding;

public class FibonachiSeries {

	public static void printFibonachi(int number) {
		int a=0,b=1;
		System.out.print(a+","+b);
		int c;
		for (int i = 0; i <=number; i++) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}

	}

	public static void main(String[] args) {
	
		printFibonachi(10);

	}

}
