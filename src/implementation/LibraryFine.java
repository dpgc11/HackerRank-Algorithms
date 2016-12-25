package implementation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String returnedDate = reader.nextLine();
		String expectedDate = reader.nextLine();

		DateFormat format = new SimpleDateFormat("d M yyyy");
		Date dateR;
		Date dateE;
		Calendar calR;
		Calendar calE;
		int fine = 0;
		final int DAYS_LATE_FINE = 15;
		final int MONTH_LATE_FINE = 500;
		final int YEAR_LATE_FINE = 10000;
		try {
			dateR = format.parse(returnedDate);
			dateE = format.parse(expectedDate);
			calR = Calendar.getInstance();
			calE = Calendar.getInstance();
			calR.setTime(dateR);
			calE.setTime(dateE);
			int yearR = calR.get(Calendar.YEAR);
			int yearE = calE.get(Calendar.YEAR);
			int monthR = calR.get(Calendar.MONTH) + 1;
			int monthE = calE.get(Calendar.MONTH) + 1;
			int dayR = calR.get(Calendar.DAY_OF_MONTH);
			int dayE = calE.get(Calendar.DAY_OF_MONTH);

			if (calR.before(calE) || calR.equals(calE)) {
				fine = 0;
			} else {
				if (yearR == yearE) {
					if (monthR == monthE) {
						fine = (Math.abs(dayR - dayE)) * DAYS_LATE_FINE;
					} else {
						fine = (Math.abs(monthR - monthE)) * MONTH_LATE_FINE;
					}
				} else {
					fine = 10000;
				}
			}

			System.out.println(fine);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
