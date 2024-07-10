package javaBasicMathCoding;

public class PalindromeNumber {
	public static void checkPalindromeNumber(int number) {
		int rev = 0;
		int temp = number;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(rev==number) {
			System.out.println("giver number is Palindrome");
		}else {
			System.out.println("giver number is NOT Palindrome");
		}

	}

	public static void main(String[] args) {
		checkPalindromeNumber(121);

	}

}
