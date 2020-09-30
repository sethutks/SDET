package ds.week2.assignments;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Problem5 {

	@Test
	public void testSet1() {
		int[][] input = new int[2][2];
		input[0][0] = 1;
		input[0][1] = 2;
		input[1][0] = 3;
		input[1][1] = 4;
		printArrayInWave(input);
	}

	@Test
	public void testSet2() {
		int[][] input = new int[4][4];
		input[0][0] = 1;
		input[0][1] = 2;
		input[0][2] = 3;
		input[0][3] = 4;

		input[1][0] = 5;
		input[1][1] = 6;
		input[1][2] = 7;
		input[1][3] = 8;

		input[2][0] = 9;
		input[2][1] = 10;
		input[2][2] = 11;
		input[2][3] = 12;

		input[3][0] = 13;
		input[3][1] = 14;
		input[3][2] = 15;
		input[3][3] = 16;

		printArrayInWave(input);
	}

	@Test
	public void testSet3() {
		int[][] input = new int[5][4];
		input[0][0] = 1;
		input[0][1] = 2;
		input[0][2] = 3;
		input[0][3] = 4;

		input[1][0] = 5;
		input[1][1] = 6;
		input[1][2] = 7;
		input[1][3] = 8;

		input[2][0] = 9;
		input[2][1] = 10;
		input[2][2] = 11;
		input[2][3] = 12;

		input[3][0] = 13;
		input[3][1] = 14;
		input[3][2] = 15;
		input[3][3] = 16;

		input[4][0] = 17;
		input[4][1] = 18;
		input[4][2] = 19;
		input[4][3] = 20;

		printArrayInWave(input);
	}

	private void printArrayInWave(int[][] input) {
		List<Integer> outputList = new ArrayList<Integer>();
		int counter = 2;
		// i refers the column here
		for (int i = input[0].length - 1; i >= 0; i--) {
			if (counter % 2 == 0) {
				for (int j = 0; j < input.length; j++) {
					outputList.add(input[j][i]);
				}
				counter++;
			} else {
				for (int j = input.length - 1; j >= 0; j--) {
					outputList.add(input[j][i]);
				}
				counter++;
			}
		}
		System.out.println(outputList);
	}

}
