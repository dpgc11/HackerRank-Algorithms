package implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
        // Complete this function
		int result = 0;
		Set<Integer> socks = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (!socks.contains(ar[i])) {
				socks.add(ar[i]);
			} else {
				socks.remove(ar[i]);
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
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
