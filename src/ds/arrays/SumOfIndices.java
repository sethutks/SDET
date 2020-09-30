package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class SumOfIndices {
	
	private int[] getSumIndices(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		throw new RuntimeException("No matching targets");
	}
	
	@Test
	public void example1() {
		int numbers[] = {2, 3, 1, 4, 7, 8};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example2() {
		int numbers[] = {12, 3, 1, 4, 7, -3};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example3() {
		int numbers[] = {12, 0, 1, 4, 8, -3};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example4() {
		int numbers[] = {12, 0, 1, 3, 8, -2};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}

}
