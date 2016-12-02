package implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] prices = new int[n];
		
		for (int i = 0; i < prices.length; i++) {
			prices[i] = reader.nextInt();
		}
		
		int chargedAmount = reader.nextInt();
		int sum = 0;
		
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		
		sum -= prices[k];
		int actualAmount = sum / 2;
		
		if (chargedAmount == actualAmount) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(chargedAmount - actualAmount);
		}
	}

}
