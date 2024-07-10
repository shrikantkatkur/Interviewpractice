package javinterviewquestions;

public class IQ5 {
	//SWAP h AND s, SWAP i AND r OP=hsiraktn
		public static void main(String[] args) {
			String s="shrikant";
			char c[]=s.toCharArray();
			char temp;
			for (int i = 0; i < c.length; i = i + 2) {
				temp = c[i];
				c[i] = c[i + 1];
				c[i + 1] = temp;
			}
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
		}

}
