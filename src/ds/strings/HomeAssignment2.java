package ds.strings;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HomeAssignment2 {

	@Test
	public void testSet1() {
		String input = "3[a]2[bc]";
		decodeGivenString2(input);
	}

	/*
	 * @Test public void testSet2() { String input = "3[a2[c]]";
	 * decodeGivenString2(input); }
	 * 
	 * @Test public void testSet3() { String input = "ab3[c2[ab]]";
	 * decodeGivenString2(input); }
	 */

	private void decodeGivenString2(String input) {
		char[] charArray = input.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		StringBuilder outputBuilder = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			
		}
		System.out.println(charList);
		System.out.println(outputBuilder.toString());
	}

}
