package warmup;

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
        // Complete this function
		float positiveFraction = 0;
		float negativeFraction = 0;
		float zeroFraction = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveFraction++;
			} else if (arr[i] < 0) {
				negativeFraction++;
			} else {
				zeroFraction++;
			}
		}
		
		System.out.println("" + positiveFraction / arr.length);
		System.out.println("" + negativeFraction / arr.length);
		System.out.println("" + zeroFraction / arr.length);
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
