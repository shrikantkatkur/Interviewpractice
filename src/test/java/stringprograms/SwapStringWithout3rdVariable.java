package stringprograms;

public class SwapStringWithout3rdVariable {
	
	    public static void main(String[] args) {
	        String a = "abc";
	        String b = "xyz";
	        
	        // Display the original values
	        System.out.println("Before swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        
	        // Swap the strings
	        a = a + b; // a now holds "abcxyz"
	        b = a.substring(0, a.length() - b.length()); // b gets "abc"
	        a = a.substring(b.length()); // a gets "xyz"
	        
	        // Display the swapped values
	        System.out.println("After swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
	}


