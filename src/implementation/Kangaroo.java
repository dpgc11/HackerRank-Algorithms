package implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println((v2 < v1 && (x2 - x1) % (v2 - v1) == 0) ? "YES" : "NO");
	}

}
