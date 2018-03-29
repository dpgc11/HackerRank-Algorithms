package implementation;

import java.util.Scanner;

public class StrangeAdvertising {

	static int viralAdvertising(int n) {
        // Complete this function
		int initialShare = 5;
		int result = 0;
     	int totalShared = 0 ;
     	for (int i = 0; i < n ; i++) {
     		result += Math.floorDiv(initialShare , 2);
     		totalShared = (Math.floorDiv(initialShare , 2) * 3);
     		initialShare = totalShared;
     	}
		
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }

}
