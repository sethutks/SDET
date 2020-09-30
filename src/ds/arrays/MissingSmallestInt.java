package ds.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MissingSmallestInt {
	
	@Test
	public void testSet1() {
		int [] inputArray = {2,8,10,1,0,2,1};
		System.out.println("Test set1");
		findSmallestMissingInt(inputArray);	
	}
	
	@Test
	public void testSet2() {
		int [] inputArray = {7, 8, 9, 10, 11, 12};
		System.out.println("Test set2");
		findSmallestMissingInt(inputArray);	
	}
	
	@Test
	public void testSet3() {
		int [] inputArray = {0, 0, 1, 2, 3, 4};
		System.out.println("Test set3");
		findSmallestMissingInt(inputArray);	
	}
	
	private void findSmallestMissingInt(int [] inputArray) {
		Arrays.sort(inputArray);
		
		Map<Integer, Integer> array1Map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inputArray.length; i++) {	
			array1Map.put(inputArray[i], i);	
		}
		
		for (int i = 0; i < inputArray.length; i++) {
			if(!(array1Map.containsKey(i)) && (i < inputArray.length -1)) {
				System.out.println("The missing smallest integer is: "+i);
				break;
			}
		}
	}
	
	
	
	

}
