package rdautomationprograms;

public class I3SubstringMethod {
//s.substring(start,end)=
//start-inclusive,end-exclusive
	public static void main(String[] args) {
		String s="shrikant";
		System.out.println(s.substring(0));
		System.out.println(s.substring(0,1));//will give first char
		System.out.println(s.substring(1,2));//will give second char
		System.out.println(s.substring(4,7));//will give sfrom 4 onwards upto 7-1=6 index as end exclusive
	}

}
