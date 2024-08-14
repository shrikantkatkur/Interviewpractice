package rdautomationprograms;

public class I13FibonachiSeries {
	
	public static int usingRecursion(int number) {
		if(number<=1){
	           return number;
	       }else{
	           return usingRecursion(number-1)+usingRecursion(number-2);
	       }
	}
	public static void printFibonaciSeries(int num) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + "," + b);
		for (int i = 0; i <= num; i++) {
			c = a + b;
			System.out.print(","+c);
			a=b;
			b=c;
		}

	}
	
	

	public static void main(String[] args) {
		//printFibonaciSeries(5);
		 int number=8;
	        for(int i=0;i<=number;i++){
	            System.out.print(usingRecursion(i)+",");
	        }
	}

}
