package stringprograms;

public class ReverseEachWordOfString {
 //1. using general method 
	public static void usingregularmethod(String str) {
		String[] words = str.split(" ");
		String revString = "";
		for (String w : words) {
			String revWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revWord = revWord + w.charAt(i);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);
	}
	//2.using StringBuffer
	public static void usingStringBuffer(String str) {
		String[] words = str.split(" ");
		String revString = "";
		for (String word : words) {
			StringBuffer sb= new StringBuffer(word);
			String revWord=new String (sb.reverse());
			revString=revString+(revWord+" ");
		}
		System.out.println(revString);
		
	}
	//reverse entire string
	public static void usingregularmethodEntire(String str) {
		String[] words = str.split(" ");
		String revString = "";
		for (int j = words.length - 1; j >= 0; j--) {
			StringBuffer sb= new StringBuffer(words[j]);
			String revWord=new String (sb.reverse());
			revString=revString+(revWord+" ");
		}
		System.out.println(revString);
		
	}
	public static void main(String[] args) {
		usingregularmethod("Hi I am Shrikant");
		usingStringBuffer("Hello Everyone this shrikant ");
		usingregularmethodEntire("Hello Everyone this shrikant");

	}
}
