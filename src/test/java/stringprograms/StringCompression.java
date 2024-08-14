package stringprograms;

public class StringCompression {
	public static void main(String[] args) {
		String input = "aaaabcccccddddeeeaa";
		String compressedString = compressString1(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + compressedString);
	}

	public static String compressString1(String input) {
		String output = "";
		for (int i = 0; i < input.length();) {
			int count = 0;
			char b = input.charAt(i);
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			output = output + b + count;
			i+= count;
		}
		return output;
	}

}
