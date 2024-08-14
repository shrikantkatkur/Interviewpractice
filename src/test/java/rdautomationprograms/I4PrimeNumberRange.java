package rdautomationprograms;

public class I4PrimeNumberRange {
	
	public static void printPrimeNumbersUpto(int num) {
		for (int i = 0; i <num; i++) {
			int count=0;
			for (int j = 2; j <i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+",");
			}
			
		}

	}

	public static void main(String[] args) {
		printPrimeNumbersUpto(50);
	}

}
