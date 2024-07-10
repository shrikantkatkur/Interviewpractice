package Interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utilities.PropUtil;

public class WordsInFile {

	public static void main(String[] args) {
		String filePath ="D:\\JAVA\\Interviewpractice\\src\\main\\resources\\sample.txt";

		try {
			int wordCount = countWordsInFile(filePath);
			System.out.println("The number of words in the file is: " + wordCount);
		} catch (IOException e) {
			System.err.println("An error occurred while reading the file: " + e.getMessage());
		}
	}

	public static int countWordsInFile(String filePath) throws IOException {
	        int wordCount = 0;

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }
	        }

	        return wordCount;
	    
	}}
