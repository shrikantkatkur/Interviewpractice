package javaBasicMathCoding;

public class FibonachiSeries {

	public void printFibonachi(int number) {
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
		FibonachiSeries fb = new FibonachiSeries();
		fb.printFibonachi(10);

	}

}
