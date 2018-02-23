package implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] score) {
		// Complete this function
		int[] result = new int[2];
		int lowestScore = score[0];
		int highestScore = score[0];
		int highestCount = 0;
		int lowestCount = 0;
		for (int i = 1; i < score.length; i++) {
			
			if (score[i] > highestScore) {
				highestCount++;
				highestScore = score[i];
			} 
			if (score[i] < lowestScore) {
				lowestCount++;
				lowestScore = score[i];
			}
		}
		result[0] = highestCount;
		result[1] = lowestCount;

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}

}
