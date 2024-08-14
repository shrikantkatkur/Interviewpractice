package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesWordInString {

	public static void main(String[] args) {
		String input = "Hi I am Shrikant I am from pune ";
		String[] words = input.split(" ");
		int count = 0;

		Set<String> hSet = new LinkedHashSet<>();
		for (String w : words) {
			if (hSet.add(w) == false) {
				count++;
				System.out.println("Duplicate word:" + w);
			}
		}
		if (count == 0) {
			System.out.println("NO Duplicate words:");
		}

	}

}
