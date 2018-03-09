package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatsAndMouse {
	
	private static final String CAT_A = "Cat A";
	private static final String CAT_B = "Cat B";
	private static final String MOUSE_C = "Mouse C";
	
	/*
     * Complete the catAndMouse function below.
     */
    static String catAndMouse(int x, int y, int z) {
        /*
         * Write your code here.
         */
    	if (Math.abs(x - z) < Math.abs(y - z)) 
    		return CAT_A;
    	else if (Math.abs(x - z) > Math.abs(y - z))
    		return CAT_B;
    	else 
    		return MOUSE_C;

    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scan.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scan.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0].trim());

            int y = Integer.parseInt(xyz[1].trim());

            int z = Integer.parseInt(xyz[2].trim());

            String result = catAndMouse(x, y, z);

            bw.write(result);
            bw.newLine();
        }

        bw.close();
    }

}
