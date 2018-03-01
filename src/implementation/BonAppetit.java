package implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		int foodCount = in.nextInt();
		int ignoredIndex = in.nextInt();
		int[] foodArray = new int[foodCount];
		int actualMoney = 0;
		for (int i = 0; i < foodCount; i++) {
			int money = in.nextInt();
			foodArray[i] = money;
			
			if (i != ignoredIndex) {
				actualMoney += money;
			}
		}
		actualMoney /= 2;
		int moneyCharged = in.nextInt();
		String bonAppetit = "Bon Appetit";
		if (moneyCharged == actualMoney) {
			System.out.println(bonAppetit);
		} else {
			System.out.println(moneyCharged - actualMoney);
		}
		
		
    }

}
