package javaBasicMathCoding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 407;//9774,153,1634,407
		int length=0;
		while(number>0) {
			number=number/10;
			length++;
		}
		System.out.println(length);
		int rem = 0;
		int sum = 0;
		int temp = number;
		while (temp > 0) {
			rem = temp % 10;
			for(int i=0;i<length;i++) {
			rem=rem*rem;
			}
			sum=sum+rem;
			temp = temp / 10;
		}
		if(sum==number) {
			System.out.println("Given no is Armstrong Number");
		}else
			System.out.println("Given no is Armstrong NOT Number");
	}

}
