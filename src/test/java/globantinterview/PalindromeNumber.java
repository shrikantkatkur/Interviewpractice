package globantinterview;

public class PalindromeNumber {
	public static void palindomeNumber(int Number) {
		int num = Number;
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = rem + rev * 10;
			num = num / 10;
		}
		if (rev == Number) {
			System.out.println("PalindromeNumber");
		} else
			System.out.println(" NOT PalindromeNumber");

	}

	public static void main(String[] args) {
		PalindromeNumber.palindomeNumber(122231);
	}

}