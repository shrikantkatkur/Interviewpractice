package mustdohandon;

public class PalindromeNumber {
	public static void checkPalindromeNumber(int number) {
		int temp = number;
		int rev = 0;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (rev == number) {
			System.out.println("Given no is Palindrome Number");
		} else
			System.out.println("Given no is NOT a Palindrome Number");

	}

	public static void main(String[] args) {
		checkPalindromeNumber(1221);
	}

}
