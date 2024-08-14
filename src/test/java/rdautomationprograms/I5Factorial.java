package rdautomationprograms;

public class I5Factorial {
	
	public static void regMethod(int number) {
		int fact=1;
		for (int i = 1; i <=number; i++) {
			fact=i*fact;
		}
		System.out.println(fact);
	}
	 static int fact=1;
	 public static void usingRecusrion(int number) {
		 if(number>1) {
			 fact=fact*number;
			 usingRecusrion(number-1);
		 }
	}

	
	public static void main(String[] args) {
		regMethod(5);
		usingRecusrion(5);
		System.out.println(fact);

	}

}
