package ds.week2.assignments;

public class Sample {

	public static void main(String[] args) {
		String input = "caab";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
					System.out.println(input.substring(i, j));
			}
			System.out.println(input.substring(i));
		}
		
	}

}
