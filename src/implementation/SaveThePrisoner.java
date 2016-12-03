package implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();

		for (int i = 0; i < testCases; i++) {
			int prisoners = in.nextInt();
			int sweets = in.nextInt();
			int startIndex = in.nextInt();

			int result = (startIndex + sweets - 1) % prisoners;

			if (result == 0) {
				System.out.println(prisoners);
			} else {
				System.out.println(result);
			}
		}

	}

}
