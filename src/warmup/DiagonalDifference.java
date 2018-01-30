package warmup;

import java.util.Scanner;

public class DiagonalDifference {

	static int diagonalDifference(int[][] a) {
		int result = 0;
        // Complete this function
		int diagonalA = 0;
		int diagonalB = 0;
		
		for (int i = 0; i < a.length; i++) {
			diagonalA += a[i][i];
			diagonalB += a[i][a.length - 1 - i];
		}
		
		result = Math.abs(diagonalA - diagonalB);
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }

}
