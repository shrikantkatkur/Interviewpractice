package javaBasicMathCoding;

public class SwapNumber {

	public static void swapNumber1(int a,int b) {
		System.out.println("Values of a and b before swapping: "+a+ " "+b);
		int x;
		x=a;
		a=b;
		b=x;
		
		System.out.println("Values of a and b after swapping: "+a+ " "+b);
		

	}
	public static void swapNumber2(int a,int b) {
		System.out.println("Values of a and b before swapping: "+a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Values of a and b after swapping: "+a+ " "+b);
		

	}
	
	public static void main(String[] args) {
		//swapNumber1(10,20);
		swapNumber2(30,10);
	}

}
