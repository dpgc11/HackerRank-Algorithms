package warmup;

import java.util.Scanner;

public class MiniMaxSum {
	
	static void miniMaxSum(int[] arr) {
        // Complete this function
		long maxSum = Long.MIN_VALUE;
		long minSum = Long.MAX_VALUE;
		long totalSum = 0;
		long tempResult = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		for (int i : arr) {
			tempResult = totalSum - i;
			if (tempResult < minSum) {
				minSum = tempResult;
			} 
			if (tempResult > maxSum) {
				maxSum = tempResult;
			}
		}
		System.out.println("" + minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
