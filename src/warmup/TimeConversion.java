package warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
		// Complete this function
		String result = "";
		SimpleDateFormat displayFormat = new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			result = outFormat.format(displayFormat.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}

}
