package julyinterviewpractice;

public class SuhasiniCapeGemini {

	public static void athisQuestion(String s) {
		String[] words = s.split(" ");
		String output = "";
		for (String a : words) {//Testing
			String revWord = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				revWord = revWord + a.charAt(i);//
			}
			output = output + revWord+" ";
		}
		System.out.println(output);

	}
	public static void athisQuestion1(String s) {
		String[] words = s.split(" ");
		String output = "";
		String s1=words[0];
		String s2=words[1];
		String revWord="";
		for(int i=s1.length()-1;i>=0;i--) {
			revWord=revWord+s1.charAt(i);
		}
		output=revWord+" "+s2;
		System.out.println(output);

	}


	public static void main(String[] args) {
		//athisQuestion("Testing Shastra");
		athisQuestion1("Testing Shastra");
	}

}
