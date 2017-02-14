package setUp;

import java.util.ArrayList;

public interface Lists {
	
	/*
	 * Creates a list of the full weekdays
	 * @return An ArrayList containing the String full weekdays
	 */
	static ArrayList<String> weekdayFull(){
		ArrayList<String> weekdays = new ArrayList<String>();
		
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		
		return weekdays;
	}
	
	/*
	 * Creates a list of the abbreviated names of the weekdays
	 * @return An ArrayList containing the String abbreviated weekdays
	 */
	static ArrayList<String> weekdaysAbr(){
		ArrayList<String> weekdays = new ArrayList<String>();
		
		weekdays.add("Mon");
		weekdays.add("Tue");
		weekdays.add("Wed");
		weekdays.add("Thur");
		weekdays.add("Fri");
		weekdays.add("Sat");
		weekdays.add("Sun");
		
		return weekdays;
	}
	
	/*
	 * Creates a list of the starting letters of the weekdays
	 * @return An ArrayList containing the String first letters of every weekday
	 */
	static ArrayList<String> weekdaysL(){
		ArrayList<String> weekdays = new ArrayList<String>();
		
		weekdays.add("M");
		weekdays.add("T");
		weekdays.add("W");
		weekdays.add("T");
		weekdays.add("F");
		weekdays.add("S");
		weekdays.add("S");
		
		return weekdays;
	}
	
	/*
	 * Creates a list of the full month names
	 * @return An ArrayList containing the String names of all the months
	 */
	static ArrayList<String> monthsFull(){
		ArrayList<String> months = new ArrayList<String>();
		
		months.add(0, ""); //Blank at 0 so that way months won't have to be adjusted
		months.add(1, "January");
		months.add(2, "February");
		months.add(3, "March");
		months.add(4, "April");
		months.add(5, "May");
		months.add(6, "June");
		months.add(7, "July");
		months.add(8, "August");
		months.add(9, "September");
		months.add(10, "October");
		months.add(11, "November");
		months.add(12, "December");
		
		return months;
	}
	
	/*
	 * Creates a list of the abbreviated month names.
	 * @return An ArrayList containing the String values of the abbreviated names of all the months
	 */
	static ArrayList<String> monthsAbr(){
		ArrayList<String> months = new ArrayList<String>();
		
		months.add(0, ""); //Blank at 0 so that way months won't have to be adjusted
		months.add(1, "Jan");
		months.add(2, "Feb");
		months.add(3, "Mar");
		months.add(4, "Apr");
		months.add(5, "May");
		months.add(6, "June");
		months.add(7, "July");
		months.add(8, "Aug");
		months.add(9, "Sep");
		months.add(10, "Oct");
		months.add(11, "Nov");
		months.add(12, "Dec");
		
		return months;
	}
}
