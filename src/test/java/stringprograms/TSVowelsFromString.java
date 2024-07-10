package stringprograms;

public class TSVowelsFromString {
	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';

	}

	public static void main(String[] args) {
		String s ="aeiou";
		int vowelCount = 0;
		for (int i = 0; i <s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				vowelCount++;
			}

		}
		System.out.println("No of Vowels in given string are:"+vowelCount);
	}

}
