package wordProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;

/***
 * Model some utilities that could be used to process words
 * 
 * @author nicomp
 *
 */
public class WordProcessor {
	/**
	 * Look for a word in the dictionary and check possible misspellings
	 * 
	 * @param target The word to look for
	 * @param words  The dictionary
	 * @return The matching word in the dictionary or "" if no match
	 */
	public String checkSpelling(String target, Hashtable<String, String> words) {
		target = target.toLowerCase();
		String foundWord = "";
		
		if (words.get(target) == null) {
			for (int i = 0; i < target.length() - 1; i++) {
				char[] chars = target.toCharArray();
				char i1 = chars[i];
				chars[i] = chars[i + 1];
				chars[i + 1] = i1;
				if (words.get(String.valueOf(chars)) != null) {
					foundWord = String.valueOf(chars);
					break;
				}
			}
		} else {
			foundWord = words.get(target);
		}

		return foundWord;
	}

	/***
	 * Read words from a text file
	 * 
	 * @param fileName The file to open and read
	 * @return The Hashtable containing all the words in the file.
	 */
	public Hashtable<String, String> readWords(String fileName) {
		Hashtable<String, String> words = new Hashtable<String, String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String word;
			while ((word = br.readLine()) != null) {
				words.put(word.toLowerCase(), word.toLowerCase()); // Use the word as the key and the value
			}
		} catch (Exception ex) {
			System.out.println("Error reading " + fileName + ": " + ex.getLocalizedMessage());
		}
		try {
			br.close();
		} catch (Exception ex) {
		}
		return words;
	}
}
