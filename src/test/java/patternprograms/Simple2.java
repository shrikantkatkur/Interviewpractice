package patternprograms;

public class Simple2 {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
