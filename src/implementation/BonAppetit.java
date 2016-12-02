package implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			if (i != k) {
				sum += reader.nextInt();
			} else {
				reader.nextInt();
			}
			
		}
		
		int chargedAmount = reader.nextInt();
		int actualAmount = sum / 2;
		
		if (chargedAmount == actualAmount) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(chargedAmount - actualAmount);
		}
	}

}
