package patternprograms;

public class AlphaCapital {

	public static void main(String[] args) {
		int alpha=65;//97 is small a,49 is for 1,65 is for A
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char) (alpha+j)+" ");
				//alpha++;
			}
			System.out.println();
		}
	}

}
