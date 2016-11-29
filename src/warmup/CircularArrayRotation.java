package warmup;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
		}

		printArray(a);
		System.out.println();
		a = rotateArray(a, k);
		printArray(a);
	}

	public static int[] rotateArray(int[] array, int rotations) {
		int length = array.length;
		int[] rotatedArray = new int[length];

		for (int j = 0; j < rotations; j++) {
			rotatedArray[0] = array[length - 1];

			for (int i = 1; i < length; i++) {
				rotatedArray[i] = array[i - 1];
			}
		}

		return rotatedArray;
	}

	public static void printArray(int[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

}
