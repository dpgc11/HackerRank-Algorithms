package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {
	
	static int hurdleRace(int k, int[] height) {
        // Complete this function
		int max = height[0];
		for (int i : height) {
			if (i > max) {
				max = i;
			}
		}
		if (max - k <= 0) {
			return 0;
		} else {
			return Math.abs(max - k);
		}
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }

}
