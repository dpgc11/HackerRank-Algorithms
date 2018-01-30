package warmup;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
        // Complete this function
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			result += printSpaces(n - 1 - i) + printSymbol(i + 1) + "\n";
		}
		result += printSpaces(0) + printSymbol(n);
		System.out.println(result);
    }
	
	public static String printSpaces(int count) {
		String space = " ";
		String result = "";
		for (int i = 0; i < count; i++) {
			result += space;
		}
		return result;
	}
	
	public static String printSymbol(int count) {
		String symbol = "#";
		String result = "";
		for (int i = 0; i < count; i++) {
			result += symbol;
		}
		return result;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}