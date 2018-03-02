package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
        // Complete this function
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		
		int[] frequency = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			frequency[i] = 0;
		}
		for (int i : ar) {
			switch (i) {
			case 1:
				frequency[1] += 1;
				break;
			case 2:
				frequency[2] += 1;
				break;
			case 3:
				frequency[3] += 1;
				break;
			case 4:
				frequency[4] += 1;
				break;
			case 5:
				frequency[5] += 1;
				break;
			}
		}
		return max(frequency);
		
    }
	
	public static int max(int[] ar) {
		int max = Integer.MIN_VALUE;
		int indexOfMax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
