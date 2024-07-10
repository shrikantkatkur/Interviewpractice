package Interview;

public class EvenPrint {

	public static void main(String[] args) {
		String s = "Atish";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				output = output+s.charAt(i);//A when i=0;
			}

		}
		System.out.println(output);

	}

}
