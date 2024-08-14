package rdautomationprograms;

public class I6SwapTwoNumbers {
	
	public static void swapUsing3rdVariable(int a,int b) {
		System.out.println("Before swapping "+a+","+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping "+a+","+b);
	}
	
	public static void swapUsingWithout3rdVariable(int a,int b) {
		System.out.println("Before swapping "+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+","+b);
	}

	public static void main(String[] args) {
		swapUsing3rdVariable(10,20);
		swapUsingWithout3rdVariable(30,40);
	}

}
