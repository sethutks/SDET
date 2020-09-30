package ds.strings;

import java.util.Arrays;

import org.junit.Test;

public class HomeAssignment1 {
	
	@Test
	public void testSet1() {
		String input = "I am doing great";
		System.out.println(reverseBywordsInString(input));
		System.out.println("Solution 2: "+ reverseByInBuiltMethod(input));
	}
	
	@Test
	public void testSet2() {
		String input = "StringwithNoWhiteSpaces";
		System.out.println(reverseBywordsInString(input));
		System.out.println("Solution 2: "+ reverseByInBuiltMethod(input));
	}
	
	
	//Solution1 - BruteForce -> Worst case [O(n^2)]
	private String  reverseBywordsInString(String input) {
		String[] splitWords = input.split(" ");
		StringBuilder reverseWord = new StringBuilder();
		reverseWord.reverse();
		for (String eachWord : splitWords) {
			for (int i = eachWord.toCharArray().length -1; i >= 0; i--) {
				reverseWord.append(eachWord.charAt(i));
			}
		}
		return reverseWord.toString();
	}
	
	//Solution-2 using in built method - O[n]
	private String reverseByInBuiltMethod(String input) {
		String[] splitWords = input.split(" ");
		StringBuilder outputString = new StringBuilder();
		for (String eachWord : splitWords) {
			outputString.append(new StringBuilder(eachWord).reverse());
		}
		return outputString.toString();
	}

}
