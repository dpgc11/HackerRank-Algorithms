package implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();
		while(testCases-- > 0) {
			int startIndex = reader.nextInt();
			int endIndex = reader.nextInt();
			int count = 0;
			
			count = (int) Math.floor(Math.sqrt(endIndex)) - (int) Math.ceil(Math.sqrt(startIndex)) + 1;
			System.out.println(count);
		}
	}

}
