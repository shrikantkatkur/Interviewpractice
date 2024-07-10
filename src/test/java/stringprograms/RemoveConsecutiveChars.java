package stringprograms;

public class RemoveConsecutiveChars {
//input:aaabccddef
	//output:-abcdef
	public static void removeConsecutiveChars(String s){
		int n=s.length();
		String answer="";
		for (int i = 0; i <n; i++) {
			if(i<n-2 && s.charAt(i)==s.charAt(i+1)) {//to avoid array index out of bound i<n-2
				continue;
			}else {
				answer=answer+s.charAt(i);
			}
		}
		System.out.println(answer);
		
	}
	public static void main(String[] args) {
		RemoveConsecutiveChars.removeConsecutiveChars("aaaaabccddef");
	}

}
