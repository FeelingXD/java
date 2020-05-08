package sec01.exam01;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year +" , " + (month+1) + ", " +day );
		
	}

}
