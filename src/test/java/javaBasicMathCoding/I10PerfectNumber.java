package javaBasicMathCoding;

public class I10PerfectNumber {
//perfect number-6,28
	//6 it is divisble by 1,2,3 and if 1+2+3=6 therefore 6 is perfect number
	//28 The next perfect number is 28, since 1 + 2 + 4 + 7 + 14 = 28.
	public static void main(String[] args) {
		
		int num=28;
		int sum=0;
		for (int i = 1; i <num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect Number");
		}else
			System.out.println("NOT Perfect Number");
	}
}
