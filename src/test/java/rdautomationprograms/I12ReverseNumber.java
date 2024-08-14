package rdautomationprograms;

public class I12ReverseNumber {

	public static void reverseNumber(int number) {
		int rev = 0;
		int temp = number;
		int rem;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println(rev);

	}
	public static void main(String[] args) {
		reverseNumber(1241);

	}

}
