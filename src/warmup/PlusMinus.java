package warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		int[] array = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = reader.nextInt();
		}
		
		reader.close();
		
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		for (int i : array) {
			if (i < 0) {
				negativeCount++;
			} else if (i > 0) {
				positiveCount++;
			} else {
				zeroCount++;
			}
		}
		
		double positiveFrac = (positiveCount*1.0/count);
		double negativeFrac = (negativeCount*1.0/count);
		double zeroFrac = (zeroCount*1.0/count);
		
		System.out.printf("%.6f %n",positiveFrac);
		System.out.printf("%.6f %n",negativeFrac);
		System.out.printf("%.6f %n",zeroFrac);
	}

}
