package julyinterviewpractice;

public class PrimeNumber {
	
	
	public static  void primeNumberRange(int num) {
		for(int i=0;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+",");
			}
		}
	}
	public static void checkPrimeNumber(int num){
		int count=0;
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("yes");
		}else
			
			System.out.println("NO");
	}

	public static void main(String[] args) {
		//checkPrimeNumber(23);
		primeNumberRange(50);
	}

}
