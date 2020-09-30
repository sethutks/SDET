package ds.strings;

import java.util.Arrays;

import org.junit.Test;

public class ReverseString {
	
	@Test
	public void testSet1() {
		String testData = "sethu";
		System.out.println(reverseUsingTwoPointerAlgo(testData));
	}
	
	@Test
	public void testSet2() {
		String testData = "sethu	mathavan";
		System.out.println(reverseUsingTwoPointerAlgo(testData));
	}
	
	private String reverseUsingTwoPointerAlgo(String input) {
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length -1;
		while(left < right) {
			char tmp = charArray[left];
			//After assigning the right index value to left, increment the left by 1
			charArray[left++] = charArray[right];
			//After assigning the tmp value to right, decrement the right by 1
			charArray[right--] = tmp;
		}
		return Arrays.toString(charArray);
	}
	
	
	

}
