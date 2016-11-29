package warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		int[][] array = new int[count][count];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				array[i][j] = reader.nextInt();
			}
		}

		int sum1=0,sum2 = 0;

		for (int i = 0; i < array.length; i++) {
			sum1 += array[i][i] ;
		}
		for (int i = 0; i < array.length; i++) {
			sum2 += array[i][array.length-i-1];
		}
		
		int difference = Math.abs(sum1-sum2);
		

		System.out.println(difference);
	}

}
