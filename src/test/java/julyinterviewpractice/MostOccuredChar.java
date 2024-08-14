package julyinterviewpractice;

public class MostOccuredChar {
	public static void usingForLoop(String s) {
		char mostFrequentChar = ' ';
		int maxCount = 0;
		char[] chr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			char c = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (c == chr[j]) {
					count++;
					chr[j] = 0;//most important steps, we have to reset second for loop to zero
				}
			}
			if (count > 0) {
			 System.out.println(c +"=" + count);
			}
		}
		
/*
			if (count > maxCount) {
				maxCount = count;
				mostFrequentChar = c;
			}

		}
		System.out.println("Most occured char is = " + mostFrequentChar);
*/
	}

	public static void main(String[] args) {
		usingForLoop("hshrikant");
	}

}

