package Interview;

public class KailasIQ3 {

	public static void main(String[] args) {
		String s = "India@123";// Covert this into 3 string Inida,@ and 123
		String s1 = "";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i <= 4; i++) {
			s1 = s1 + s.charAt(i);
		}
		for (int i = 5; i < 6; i++) {
			s2 = s2 + s.charAt(i);
		}
		for (int i = 6; i <= s.length() - 1; i++) {
			s3 = s3 + s.charAt(i);

		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
