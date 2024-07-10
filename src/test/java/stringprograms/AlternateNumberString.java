package stringprograms;

public class AlternateNumberString {

	public static void method1(String s) {
		// input-a3bc4d3e2
		// output-aaaabcccccddddeee
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int len = Integer.parseInt(s.charAt(i) + "");
				for (int l = 0; l < len; l++) {
					result = result + s.charAt(i - 1);
				}
			} else {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		AlternateNumberString.method1("a3bc4d3e2");
	}

}
