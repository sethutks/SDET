package ds.arrays;

import org.junit.Test;

public class SumofConsecutiveNumbers {
	
	//@Test
	public void testSet1() {
		System.out.println(">>> TestSet1 >>>>");
		int[] inputArray = {2,4,1,3,5,6,0,1,3,1};
		int consecutiveSize = 3;
		getSumOfConsecutiveNumbers(inputArray, consecutiveSize);
	}
	
	//@Test
	public void testSet2() {
		System.out.println(">>> TestSet2 >>>>");
		int[] inputArray = {2,4,1,1,3,1,3,5,6};
		int consecutiveSize = 3;
		getSumOfConsecutiveNumbers(inputArray, consecutiveSize);
	}
	
	@Test
	public void testSet3() {
		System.out.println(">>> TestSet3 >>>>");
		int[] inputArray = {-2, 3, 1, 0, -3, 11, -5, 2};
		int consecutiveSize = 4;
		getSumOfConsecutiveNumbers(inputArray, consecutiveSize);
		getSumUsingSlidingWindow(inputArray, consecutiveSize);
	}
	
	private void getSumOfConsecutiveNumbers(int[] inputArray, int consSize) {
		int highestSum = 0;
		for (int i = 0; i <= inputArray.length - consSize; i++) {
			int tempSum = 0; // O[N]
			for (int j = 0; j < consSize; j++) {
				tempSum = tempSum + inputArray[i+j]; //O[N*M] (MAY SOMETIMES N=M)
			}
			if(tempSum > highestSum) {
				highestSum = tempSum; //O[N]
			}
		}
		System.out.println(highestSum); //O[1]
	}
	
	private void getSumUsingSlidingWindow(int[] inputArray, int consSize) {
		int max = 0;
		for (int i = 0; i < consSize; i++) {
			max = max+inputArray[i];
		}
		
		int temp = max;
		for (int i = consSize; i < inputArray.length; i++) {
			temp = temp + inputArray[i] - inputArray[i - consSize];
			max = Math.max(temp, max);
		}
		
		System.out.println(max);
	}

}
