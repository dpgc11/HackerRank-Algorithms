package implementation;

import java.util.Scanner;

public class MinMaxSum2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long sum = 0;
		long max = Integer.MIN_VALUE;
		long min = Integer.MAX_VALUE;
		
		while(in.hasNext()) {
			long input = in.nextLong();
			sum += input;
			if (input < min) {
				min = input;
			}
			if (input > max) {
				max = input;
			}
		}
		
		System.out.println((sum - max) + " " + (sum - min));
	}

}
