package mustdohandon;

public class RemoveVowlsFromGivenString {

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || 
				t == 'A' || t == 'E' || t == 'I' || t == 'O'|| t == 'U';

	}

	public static void main(String[] args) {
		String s = "adhhaeioau";
		String vowelWord = "";
		String notVowel="";
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				vowelWord = vowelWord + s.charAt(i);
			}else {
				notVowel=notVowel+s.charAt(i);
			}

		}
		System.out.println("  Vowels from given string are:" + vowelWord);
		System.out.println("  No of Vowels from given string are:" + vowelWord.length());
		System.out.println(" Removing Vowels from given given string :" + notVowel);

	}

}
