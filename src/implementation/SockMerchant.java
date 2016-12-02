package implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Integer> colors = new HashSet<Integer>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int color = in.nextInt();
			if (!colors.contains(color)) {
				colors.add(color);
			} else {
				colors.remove(color);
				count++;
			}

		}

		System.out.println(count);

	}

}
