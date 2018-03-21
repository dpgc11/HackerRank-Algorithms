package implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	static int beautifulDays(int i, int j, int k) {
        // Complete this function
		int result = 0;
		for (int num = i; num <= j; num++) {
			System.out.println("diff: " + calculateDifference(num));
			System.out.println("exp: " + calculateDifference(num) % k);
			if ((calculateDifference(num) % k) == 0) {
				result++;
			}
		}
		return result;
    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
    
    public static int reverseNum(int num) {
    	String tempSum = "";
    	int rem = 0;
    	while (num > 0) {
    		rem = num % 10;
    		tempSum += String.valueOf(rem);
    		num /= 10;
    	}
    	return Integer.parseInt(tempSum);
    }
    
    public static int calculateDifference(int i) {
    	int result = (Math.abs(i - reverseNum(i)));
    	return result;
    }

}
