package ltimindtree2ndround;

public class StringCompression {
	public static void main(String[] args) {
		String s = "a2b3d4";// aabbbdddd
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 0 && s.charAt(i) <= 9) {
				int len = Character.getNumericValue(s.charAt(i));
				for (int j = 0; j < len - 1; j++) {
					output = output + s.charAt(i - 1);
				}
			} else
				output = output + s.charAt(i);
		}
		System.out.println(output);

	}

}
