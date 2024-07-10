package stringprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TSAddDigitsOfString {
	public static void withoutUsingStringMethod(String s) {
		Pattern p = Pattern.compile("[0-9]");
		int result = 0;
		Matcher m = p.matcher(s);
		while (m.find()) {
			result = result + Integer.parseInt(m.group());
			//System.out.print(m.group());
			
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		String s = "ae123i456ou";
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				// result=result+s.charAt(i);//307
				//result = result + (s.charAt(i) - 48);// 307
				result = result + Integer.parseInt(s.charAt(i) + "");// typecasting string into integer
			}
		}
		System.out.println(result);
		withoutUsingStringMethod("ae123i456ou");
	}

}
