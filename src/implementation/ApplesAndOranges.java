package implementation;

import java.util.Scanner;

public class ApplesAndOranges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appleCount = 0;
        int orangeCount = 0;
        
        for (int i = 0; i < m; i++) {
        	int temp = in.nextInt();
        	int pos = a + temp;
        	if (pos >= s && pos <= t) {
        		appleCount++;
        	}
        }
        for (int i = 0; i < n; i++) {
        	int temp = in.nextInt();
        	int pos = b + temp;
        	if (pos >= s && pos <= t) {
        		orangeCount++;
        	}
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
        
        
        
	}

}
