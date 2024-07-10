package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TSRemoveJunk {
	
	public static void removeJunkRegex(String s) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.print(m.group());
		}
		
	}
	public static void main(String[] args) {
		removeJunkRegex("shrika@$$$n6556$#$nt");
	}

}
