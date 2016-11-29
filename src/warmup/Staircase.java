package warmup;

import java.util.Scanner;

public class Staircase {

	public static void printSpace(int num) {
		for (int i = 0; i < num; i++)
			System.out.print(" ");
	}

	public static void printHash(int num) {
		for (int i = 0; i < num; i++)
			System.out.print("#");
	}

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();

		for (int i = 1; i < count+1; i++) {
			printSpace(count - i);
			printHash(i);
			System.out.println();
		}
	}
}