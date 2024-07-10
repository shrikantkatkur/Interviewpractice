package stringprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStrings {

	public static void main(String[] args) {

		// 1. using Apache Commons Lang
		String randStr = RandomStringUtils.randomAlphabetic(3);// 5 char String
		System.out.println(randStr);
	}

}
