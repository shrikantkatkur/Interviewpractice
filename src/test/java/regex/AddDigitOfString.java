package regex;

public class AddDigitOfString {

	public static void main(String[] args) {
		String s="ajhdsjak21367";
		int result=0;
		//char[] ch=s.toCharArray();
		for (int i = 0; i <=s.length()-1; i++) {
			if(s.charAt(i)>='0' &&s.charAt(i)<='9') {
				result= result+Integer.parseInt(s.charAt(i)+"");
				
			}
		}
		System.out.println(result);
	}

}
