package warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String time = reader.nextLine();
		Date date = null;
		
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			date = parseFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(displayFormat.format(date));
	}

}
