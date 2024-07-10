package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TSAddDigitsOfString {
	public static void withoutUsingStringMethod(String s) {
		Pattern p = Pattern.compile("[0-9]");
		int result = 0;
		Matcher m = p.matcher(s);
		while (m.find()) {
			result = result + Integer.parseInt(m.group());
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		withoutUsingStringMethod("ae123i55223ou");
	}

}
