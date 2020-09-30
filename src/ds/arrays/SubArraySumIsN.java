package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubArraySumIsN {
	
	@Test
	public void testData() {
		int[] input = {1,7,4,3,1,2,1,5,1};
		int sumValue = 7;
		getSubArray(input,sumValue);
		getSubArrayUsingSlidingHashing(input,sumValue);
	}
	
	private void getSubArray(int[] input, int sumValue) {
		for (int i = 0; i < input.length; i++) {
			if(input[i] == sumValue) {
				System.out.println("{"+i+" , "+i+"}");
			}
			int temp = input[i];
			for (int j = i+1; j < input.length; j++) {
				temp = temp+input[j];
				if(sumValue == temp) {
					System.out.println("{"+i+" , "+j+"}");
				}
			}
		}
	}
	
	private void getSubArrayUsingSlidingHashing(int[] input, int sumValue) {
		
		Map<Integer, Integer> storageMap = new HashMap<Integer, Integer>();
		storageMap.put(0, -1);
		
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum +input[i];
			int diff = sum - sumValue;
			if(storageMap.containsKey(diff)) {
				System.out.println("{"+(storageMap.get(diff)+1)+" , "+i+"}");
			}
			storageMap.put(sum, i);
		}
		
	}

}
