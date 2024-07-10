package patternprograms;

public class Pattern2 {

	public static void main(String[] args) {
		int num=16;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(num-1+" ");
				num=num-1;
			}
			
			System.out.println();
		}
	}

}
