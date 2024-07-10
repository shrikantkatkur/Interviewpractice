package stringprograms;

public class ReplaceCharWithOccurerence {

	
	public static void method1() {
		// String is testing, chartoreplace is t ans--1es2ing
		String str = "testings";
		char charToReplace = 's';
		if (str.indexOf(charToReplace) == -1) {
			System.out.println("The given char is not avilable in string");
			System.exit(0);
		}
		// logic to replace char occuerenece in string
		int cnt = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str);

	}

	public static void main(String[] args) {
		method1();
	}
}
