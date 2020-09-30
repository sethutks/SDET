package ds.assessment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Problem1 {

	// Write a Program to move all zeros to the end

	@Test
	public void testSet1() {
		int[] input = { 1, 0, 5, 9, 0, 0, 6, 8 };
		System.out.println("Input: " + Arrays.toString(input));
		moveZerosToRight(input);
		moveZerosToRight2(input);
		moveZerosToRight3(input);
	}

	@Test
	public void testSet2() {
		int[] input = { 1, 3, 5, 9, 0, 0, 2, 0 };
		System.out.println("\n");
		System.out.println("Input: " + Arrays.toString(input));
		moveZerosToRight(input);
		moveZerosToRight2(input);
		moveZerosToRight3(input);
	}

	@Test
	public void testSet3() {
		int[] input = { 0, 0, 2, 0, 1, 3, 5, 9 };
		System.out.println("\n");
		System.out.println("Input: " + Arrays.toString(input));
		moveZerosToRight(input);
		moveZerosToRight2(input);
		moveZerosToRight3(input);
	}

	//Using Brute force - O[N^2]
	private void moveZerosToRight(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				//If current value is not zero and the previous index is zero, only then swapping should happen
				if (!(input[j] == 0) && (input[j-1] == 0)) {
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		System.out.println("Output using Brute force: " + Arrays.toString(input));
	}
	
	/*Solution 2 - 	Take the non zero elements in a array and put it in the list.
	 * 				iterate the list and update the values from the list to array
	 * 				remaining values update with zero
	 * 				Complexity - O[N] */
	
	private void moveZerosToRight2(int[] input) {
		List<Integer> nonZeroList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if(!(input[i]==0)) {
				nonZeroList.add(input[i]);
			}
		}
		for (int i=0; i<input.length; i++) {
			if(i<nonZeroList.size()) {
				input[i] = nonZeroList.get(i);
			}
			else {
				input[i] = 0;
			}
		}
		System.out.println("Output using Solution2: " + Arrays.toString(input));
	}
	
	/*Solution 3 - 	Create an output array with same length as input and all values as zero.
	 * 				Iterate the input array and check if the input[i] value is not a zero.
	 * 				Then have the counter as 0 and replace the output[counter] = input[i] and increment counter by 1
	 * 				Complexity - O[N] */
	
	private void moveZerosToRight3(int[] input) {
		int[] outputArray = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			outputArray[i] = 0;
		}	
		int counter = 0;
		for (int i = 0; i < outputArray.length; i++) {
			if(!(input[i] == 0)) {
				outputArray[counter] = input[i];
				counter++;
			}
		}	
		System.out.println("Output using Solution3: " + Arrays.toString(input));
	}
	
	

}
