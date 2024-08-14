package stringprograms;

public class ReplaceCharWithOccurerence {

	
	public static void method1() {
		// String is testing, chartoreplace is t ans--1es2ing
		String str = "testings";
		char charToReplace = 's';
		StringBuffer sb= new StringBuffer();
		int count=0;
		for(char c:str.toCharArray()) {
			if(c==charToReplace) {
				count++;
				if(count==1) {
					sb.append('1');
				}else if(count==2) {
					sb.append('2');
				}else if(count==3) {
					sb.append('3');
				}else {
					sb.append(c);
				}
			}
			
		}
		
		System.out.println(sb.toString());

	}

	public static void main(String[] args) {
		method1();
	}
}
