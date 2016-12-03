package implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int startingDay = reader.nextInt();
		int endingDay = reader.nextInt();
		int divisibleBy = reader.nextInt();
		int count = 0;

		for (int i = startingDay; i <= endingDay; i++) {

			if ((Math.abs(i - revNum(i))) % divisibleBy == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static int revNum(int num) {
		int rem = 0, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev *= 10;
			rev += rem;
			num /= 10;
		}
		return rev;
	}

}
