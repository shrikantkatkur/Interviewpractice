package rdautomationprograms;

public class I1ReverseString {

	public static void usingRegularMethod() {
		String s = "shrikant";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	 public static void usingStringBuffer(){
	        String s="shrikant";
	       StringBuffer sb=new StringBuffer(s);
	       String s1=sb.reverse().toString();
	       System.out.println(s1);
	    }

	public static void main(String[] args) {
		usingRegularMethod();
		usingStringBuffer();
	}

}
