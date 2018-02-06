package implementation;

import java.util.Scanner;

public class ApplesAndOranges {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
		int appleCount = 0;
		int orangeCount = 0;
		
		for (int i : apples) {
			if ((i + a) >= s && (i + a) <= t) {
				appleCount++;
			}
		}
		for (int i : oranges) {
			if ((i + b) >= s && (i + b) <= t) {
				orangeCount++;
			}
		}
		
		System.out.println(appleCount + "\n" + orangeCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
