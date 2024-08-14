package rdautomationprograms;

public class I2PrintVowels2 {
	 public static boolean isVowel(char t){
	        return t=='a'||t=='e'||t=='i'||t=='o'||t=='u';
	    }
	    public static void main(String[] args) {
	        String s="ariou";
	        int count=0;
	        for(int i=0;i<s.length();i++){
	            if(isVowel(s.charAt(i))){
	                count++;
	                System.out.print(s.charAt(i)+",");
	            }
	        }
	        System.out.println();
	         System.out.print("No of vowels present are "+count);
	    }

}
