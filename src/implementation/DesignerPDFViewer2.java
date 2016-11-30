package implementation;

import java.util.Scanner;

public class DesignerPDFViewer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++)
        {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int length = word.length();
        
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
        	char tempChar = word.charAt(i);
        	max = max > h[tempChar - 'a'] ? max : h[tempChar - 'a'];
        }
        
        System.out.println(length * max);
	}

}
