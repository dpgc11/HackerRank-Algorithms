package Warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int points1=0,points2=0;
        
        if (a0 > b0) {
        	points1++;
        } else if (a0 < b0) {
        	points2++;
        }
        
        if (a1 > b1) {
        	points1++;
        } else if (a1 < b1) {
        	points2++;
        }
        
        if (a2 > b2) {
        	points1++;
        } else if (a2 < b2) {
        	points2++;
        }
        
        System.out.println(points1 + " " + points2);			
	}

}
