package stringprograms;

public class CapitalEachWord {

	public static void capitaliseEachWord(String s) {
		String result = "";
		String[] words = s.split(" ");
		for (String w : words) {
			String caps = w.substring(0, 1).toUpperCase();
			String remChars = w.substring(1);
			result = result + caps + remChars + " ";
		}
		System.out.println(result);

	}
	

	public static void main(String[] args) {
		capitaliseEachWord("hello everyone this shrikant");
	}

}
