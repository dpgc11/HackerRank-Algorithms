package implementation;

import java.util.Scanner;

public class CountingValleys {

	// input: DDUDDUUDUU
	// o/p: 1
	
	static int countingValleys(int n, String s) {
		// Complete this function
		int seaLevel = 0;
		int currentLevel = 0;
		int valleyCount = 0;
		for (int i = 0; i < n; i++) {
			switch (s.charAt(i)) {
			case 'U':
				currentLevel++;
				if (currentLevel == 0) {
					valleyCount++;
				}
				break;
			case 'D':
				currentLevel--;
				break;
			}
			
		}

		return valleyCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
