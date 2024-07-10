package stringprograms;

	public class StringCompression {
	    public static void main(String[] args) {
	        String input = "aaaabcccccddddeee";
	        String compressedString = compressString(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + compressedString);
	    }

	    public static String compressString(String input) {
	        StringBuilder compressed = new StringBuilder();
	        int count = 1;
	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == input.charAt(i - 1)) {
	                count++;
	            } else {
	                compressed.append(input.charAt(i - 1));
	                if (count > 1) {
	                    compressed.append(count-1);
	                }
	                count = 1;
	            }
	        }
	        compressed.append(input.charAt(input.length() - 1));
	        if (count > 1) {
	            compressed.append(count-1);
	        }
	        return compressed.toString();
	    }
	}


