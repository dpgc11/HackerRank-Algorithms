package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		
		int i = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			letters.put(ch, h[i++]);
			
		}

		String word = in.next();

		char[] wordArray = word.toCharArray();

		int max = Integer.MIN_VALUE;
		for (char c : wordArray) {
			if (letters.get(c) > max) {
				max = letters.get(c);
			}
		}

		System.out.println(wordArray.length * max);

	}

}
