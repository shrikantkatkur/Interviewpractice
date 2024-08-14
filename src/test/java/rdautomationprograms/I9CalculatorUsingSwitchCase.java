package rdautomationprograms;

import java.util.Scanner;

public class I9CalculatorUsingSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1=sc.nextInt();
		System.out.println("Enter second Number");
		int num2=sc.nextInt();
		System.out.println("ENTER Operation +,-,*,/");
		String operator=sc.next();
		int res=0;
		switch(operator) {
		case "+":
			res=num1+num2;
		System.out.println(res);
		break;
		case "-":res=num1-num2;
		System.out.println(res);
		break;
		case"/":res=num1/num2;
		System.out.println(res);
		break;
		case"*":res=num1*num2;
		System.out.println(res);
		break;
		default:System.out.println("Invalid operation");
		break;
		}
		sc.close();

	}

}
