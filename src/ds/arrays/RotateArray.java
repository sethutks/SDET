package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray {
	
	@Test
	public void example1() {
		int numbers[] = {1, 3, 8, 6, 3, 4};
		int numberofTimes = 7;
		rotateArrayInClockwise(numbers, numberofTimes);
	}
	
	@Test
	public void example2() {
		int numbers[] = {1, 3, 8, 6, 3, 4, 7};
		int numberofTimes = 3;
		rotateArrayInClockwise(numbers, numberofTimes);
	}
	
	@Test
	public void example3() {
		int numbers[] = {1, 3};
		int numberofTimes = 2;
		rotateArrayInClockwise(numbers, numberofTimes);
	}
	
	@Test
	public void example4() {
		int numbers[] = {1, 3, 8, 6, 3, 4, 7};
		int numberofTimes = 0;
		rotateArrayInClockwise(numbers, numberofTimes);
	}
	
	
	private void rotateArrayInClockwise(int[] numbers, int numberofTimes) {
		int outputNumbers[] = new int[numbers.length];
		if(numberofTimes > numbers.length) {
			numberofTimes = numberofTimes % numbers.length;
		}		
		for (int i = 0; i < numbers.length; i++) {
			int temp = i + numberofTimes;
			if(temp < numbers.length) {
				outputNumbers[temp] = numbers[i];
			}
			else {
				outputNumbers[temp -numbers.length] = numbers[i];
			}	
		}
		System.out.println("Input: "+ Arrays.toString(numbers));
		System.out.println("Output: "+ Arrays.toString(outputNumbers));
	}

}
