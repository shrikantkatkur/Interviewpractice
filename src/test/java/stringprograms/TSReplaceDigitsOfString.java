package stringprograms;

public class TSReplaceDigitsOfString {

	public static  void usingRegularMethod() {
		String s = "ae123i553ou";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				s=s.replace(s.charAt(i), 'X');
			}
		}
		System.out.println(s);
	}
	
	public static void usingReplaceAll() {
		String s="ae123i553ou";
		s=s.replaceAll("[0-9]","X");
		System.out.println(s);
	}
	
	public static void extractDigitsOnly() {
		String s="ae123i45ou";
		String s1=s.replaceAll("[A-Za-z]","");
		String s2=s.replaceAll("[0-9]","");
		System.out.println(s1+" "+s2);
	}
	
	public static void main(String[] args) {
		//usingRegularMethod();
		//usingReplaceAll();
		extractDigitsOnly();
	}

}
