package stringprograms;

public class TSRemoveJunk {
//regex for space is "\\s"
	 static public void main(String[] args) {
		String s="shrika6576512^%&^%^";
		s=s.replaceAll("[^a-zA-Z0-9]"," ");//^ CHAR OPERATOR means other than
		System.out.println(s);
	}

}
