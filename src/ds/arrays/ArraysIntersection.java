package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ArraysIntersection {
	
	@Test //ONE INTERSECTION
	public void testSet1() {
		int [] array1 = {2,3,1,7,1};
		int [] array2 = {12,8,4,7,9};
		System.out.println("Test set 1");
		arrayIntersection(array1, array2);
	}
	
	@Test //MORE THAN ONE INTERSECTION
	public void testSet2() {
		int [] array1 = {12,3,1,7,1};
		int [] array2 = {12,8,4,7,9};
		System.out.println("Test set 2");
		arrayIntersection(array1, array2);
	}
	
	@Test
	public void testSet3() {
		int [] array1 = {12,12,1,7,1};
		int [] array2 = {12,8,4,7,9};
		System.out.println("Test set 3");
		arrayIntersection(array1, array2);
	}
	
	@Test
	public void testSet4() {
		int [] array1 = {12,3,11,17,1};
		int [] array2 = {1,2,8,4,7,9};
		System.out.println("Test set 4");
		arrayIntersection(array1, array2);
	}
	
	@Test
	public void testSet5() {
		int [] array1 = {12,3,11,17,1};
		int [] array2 = {12,3,11,17,1};
		System.out.println("Test set 5");
		arrayIntersection(array1, array2);
	}
	
	private void arrayIntersection(int [] array1, int [] array2) {
		Map<Integer, Integer> array1Map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array1.length; i++) {	
			array1Map.put(array1[i], i);	//O[N]
		}		
		
		for (int i = 0; i < array2.length; i++) { 
			if(array1Map.containsKey(array2[i])) { //O[N]
				System.out.println(array2[i]); //O[1]
			}
		}
	}

}
