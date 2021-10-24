package main;

import java.util.Hashtable;

import wordProcessor.WordProcessor;

public class Main {
	public static void main(String[] args) throws Exception {

		test();
	}

	/***
	 * Run the test cases
	 * @throws Exception if word file can't be read.
	 */
	public static void test() throws Exception {

		WordProcessor wp = new WordProcessor();
		// Read the dictionary of words from the text file
		Hashtable<String, String> words = wp.readWords("english.ALL.txt");
		System.out.println(words.size() + " words were read into the Hashtable");
		if (words.size() == 0) {
			throw new Exception("Cannot continue. No words were read into the Hashtable.");
		}
		int failCount = 0, passCount = 0;
		String testCase;
		// Some test cases:
		testCase = "fish";
		if (wp.checkSpelling(testCase, words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 01 Passed");
			passCount++;
		} else {
			System.out.println("Test 01 FAILED");
			failCount++;
		}
		if (wp.checkSpelling("Fsih", words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 02 Passed");
			passCount++;
		} else {
			System.out.println("Test 02 FAILED");
			failCount++;
		}
		testCase = "zebra";
		if (wp.checkSpelling(testCase, words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 03 Passed");
			passCount++;
		} else {
			System.out.println("Test 03 FAILED");
			failCount++;
		}
		if (wp.checkSpelling("ezbra", words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 04 Passed");
			passCount++;
		} else {
			System.out.println("Test 04 FAILED");
			failCount++;
		}
		testCase = "supersonically";
		if (wp.checkSpelling(testCase, words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 05 Passed");
			passCount++;
		} else {
			System.out.println("Test 05 FAILED");
			failCount++;
		}
		if (wp.checkSpelling("supersonicalyl", words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 06 Passed");
			passCount++;
		} else {
			System.out.println("Test 06 FAILED");
			failCount++;
		}
		// This will be a false positive if the checkSpelling method has not been implemented!
		testCase = "skdjfhsdkjfhsk";
		if (wp.checkSpelling(testCase, words).toLowerCase().contentEquals("")) {
			System.out.println("Test 07 Passed");
			passCount++;
		} else {
			System.out.println("Test 07 FAILED");
			failCount++;
		}
		testCase = "zygotes";
		if (wp.checkSpelling(testCase, words).toLowerCase().contentEquals(testCase)) {
			System.out.println("Test 08 Passed");
			passCount++;
		} else {
			System.out.println("Test 08 FAILED");
			failCount++;
		}

		System.out.println("Pass count = " + passCount + ", fail count = " + failCount);
	}
}
