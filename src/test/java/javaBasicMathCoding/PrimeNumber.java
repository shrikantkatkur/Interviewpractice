package javaBasicMathCoding;

public class PrimeNumber {
	static int count=0;
	public static void printPrimeNumberRange(int Number) {
		
		System.out.println("all prime numbers upto " + Number + " are");
		for (int i = 0; i <=Number; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
				System.out.print(i+",");
			}
		}
		System.out.println(count);
	}

	public static void checkPrimeNumber(int Number) {
		int temp = 0;
			for (int j = 2; j <Number; j++) {
				
				if (Number % j == 0) {
					temp++;
				}
			}
			
		if (temp == 0) {
			System.out.println(Number + " is Prime ");
		} else
			System.out.println(Number + " is NOT Prime ");

	}

	public static void main(String[] args) {
		printPrimeNumberRange(97);
		checkPrimeNumber(97);
	}
}
