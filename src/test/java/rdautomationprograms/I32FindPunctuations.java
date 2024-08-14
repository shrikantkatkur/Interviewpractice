package rdautomationprograms;

public class I32FindPunctuations {
//Punctuations marks are ;,.?
	public static void main(String[] args) {
		String s="t?r;u,e.";
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)==';') {
				System.out.println("Punctuation present "+s.charAt(i));
			}
		}
	}

}
