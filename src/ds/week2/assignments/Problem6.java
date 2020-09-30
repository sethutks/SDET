package ds.week2.assignments;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Problem6 {

	@Test
	public void testSet1() {
		String input = "aaa";
		printPalindromicStrings(input);

	}

	@Test
	public void testSet2() {
		String input = "aabc";
		printPalindromicStrings(input);
	}

	@Test
	public void testSet3() {
		String input = "unique";
		printPalindromicStrings(input);
	}

	@Test
	public void testSet4() {
		String input = "caab";
		printPalindromicStrings(input);
	}

	private void printPalindromicStrings(String input) {
		List<String> outputList = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				String temp = input.substring(i, j);
				String reverse = new StringBuilder(temp).reverse().toString();
				if (reverse.equals(temp)) {
					outputList.add(temp.toString());
				}
			}
			String tmp = input.substring(i);
			String reverse = new StringBuilder(tmp).reverse().toString();
			if (reverse.equals(tmp)) {
				outputList.add(tmp.toString());
			}
		}
		System.out.println(input);
		System.out.println(outputList);
		System.out.println();
	}

}
