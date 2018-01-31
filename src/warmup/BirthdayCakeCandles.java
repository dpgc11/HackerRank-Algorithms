package warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		int result = 0;
		int max = Integer.MIN_VALUE;
		for (int i : ar) {
			if (i > max) {
				max = i;;
			}
		}
		for (int i : ar) {
			if (i == max) {
				result++;
			}
		}
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
