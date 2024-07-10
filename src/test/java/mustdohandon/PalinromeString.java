package mustdohandon;

public class PalinromeString {
	public static void isPalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("Given string is Palindrome");
		} else
			System.out.println("Given string is NOT Palindrome");

	}

	public static void main(String[] args) {
		isPalindrome("NitiN1");
	}

}
