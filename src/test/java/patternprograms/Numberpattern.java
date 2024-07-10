package patternprograms;

public class Numberpattern {

	public static void main(String[] args) {
		int num=48;//97 is small a
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(num+1)+" ");
				num=num+1;
			}
			System.out.println();
		}

	}

}
