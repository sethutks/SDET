package ds.strings;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class HomeAssignment3 {

	@Test
	public void testSet1() {
		String input = "aab";
		System.out.println(rearrangeCharInString(input));
	}

	@Test
	public void testSet2() {
		String input = "aaab";
		System.out.println(rearrangeCharInString(input));
	}
	
	@Test
	public void testSet3() {
		String input = "acbbewrr";
		System.out.println(rearrangeCharInString(input));
	}

	/*
	 * Pseudocode: 
	 * 1. Declare the TreeMap 
	 * 2. Break the String into character and put it in the map where character as key and count as value 
	 * 3. Take the map keys and iterate it 
	 * 4. Now add each character from the loop into the String Builder and reduce the count of character by 1 
	 * 5. Run the condition until the size of the builder and input string are same 
	 * 6. After the output constructed, iterate the for loop for each character in the string builder. 
	 * 7. if consecutive characters are same, then return the empty string.
	 */
				
	private String rearrangeCharInString(String input) {
		Map<Character, Integer> inputMap = new TreeMap<Character, Integer>();
		StringBuilder outputString = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			inputMap.put(input.charAt(i), inputMap.getOrDefault(input.charAt(i), 0) + 1);
		}
		Set<Character> keySet = inputMap.keySet();
		while (outputString.length() < input.length()) {
			for (Character eachCharacter : keySet) {
				if (!(inputMap.get(eachCharacter) == 0)) {
					outputString.append(eachCharacter);
					inputMap.put(eachCharacter, inputMap.get(eachCharacter) - 1);
				}
			}
		}
			for (int i = 1; i < outputString.length(); i++) {
				if(outputString.charAt(i-1) == outputString.charAt(i)) {
					return "";
				}
			}
		return outputString.toString();
	}

}
