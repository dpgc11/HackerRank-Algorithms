package implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();
		for (int i = 0; i < testCases; i++) {
			int num = reader.nextInt();
			int count = 0;
			int origNum = num;
			while (num > 0) {
				int rem = num % 10;
				if (rem != 0) {
					if (origNum % rem == 0)
						count++;
				}
				num /= 10;

			}
			System.out.println(count);
		}

	}

}
