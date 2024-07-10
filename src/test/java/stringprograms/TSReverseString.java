package stringprograms;

public class TSReverseString {
	
	public static void usingConcat(String s) {
	        String rev="";
	        for(int i=s.length()-1;i>=0;i--){
	            rev=rev+s.charAt(i);
	        }
	        if(s.equals(rev)){
	            System.out.println("P");
	        }else{
	        System.out.println("N");}
	        
	    }
					
	public static void usingStringBufferClass(String s) {
		StringBuffer sb = new StringBuffer(s);
		String rev = sb.reverse().toString();
		if (s.equals(rev)) {
			System.out.println("Given String is Palindtrome:" + s);
		} else {
			System.out.println("Given String is NOT Palindtrome:" + s);
		}

	}
	

	public static void main(String[] args) {

		usingConcat("nitin");
		//usingStringBufferClass("WOW");

	}
}
