package javaBasicMathCoding;

public class Factorial {
	public static void printFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;//1*1,1*2,2*3,6*4,24*5=120
		}
		System.out.println(fact);

	}

	
	static int fact=1;
	public static void calFc(int number) {//using recursion
		if(number>1) {
			fact=fact*number;
			calFc(number-1);
		}
	}

	public static void main(String[] args) {
		printFactorial(5);
		calFc(5);
		System.out.println(fact);
		
	}

}
