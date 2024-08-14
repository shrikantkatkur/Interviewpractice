package rdautomationprograms;


public class I37CountNoOfWordsInString {

	public static void countWord(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println("No of words in String :" + count);

	}
	
	public static  void usingSplit(String s) {
		String[] words=s.split(" ");
		for(String w:words) {
			System.out.println(w.length());
		}
		System.out.println(words.length);

	}

	public static void main(String[] args) {
		//countWord("My name is shrikant katkur");
		usingSplit("My name is shrikant");
	}

}
