package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] list = new long[5];

		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();

		list[0] = a;
		list[1] = b;
		list[2] = c;
		list[3] = d;
		list[4] = e;

		long totalSum = 0;
		for (long l : list) {
			totalSum += l;
		}

		long[] newList = new long[list.length];
		
		for (int i = 0; i < list.length; i++) {
			newList[i] = totalSum - list[i];
		}
		
		Arrays.sort(newList);
		
		System.out.println(newList[0] + " " + newList[newList.length - 1]);

	}

}
