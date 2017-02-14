package calculations;

import java.util.ArrayList;

import setUp.Date;
import setUp.Lists;

public class DaysBetween implements LeapYearDays, Lists{

	private final ArrayList<String> WEEKDAYF = Lists.weekdayFull(); //full 
	private final ArrayList<String> WEEKDAYA = Lists.weekdaysAbr(); //Abbreviated
	private int weekdayStart; //0 = Monday ... 6 = Sunday
	private int weekdayEnd;
	private int daysBetween;
	private boolean errorCheck;
	
	public DaysBetween(Date start, Date end){
		errorCheck = true;
		if(start.getErrorCheck() == true && end.getErrorCheck() == true){
			this.errorCheck = true;
		}else{
			this.errorCheck = false;
		}
		
		if(start.getYear() > end.getYear()){
			errorCheck = false;
		}else if(start.getYear() == end.getYear()){
			if(start.getMonth() > end.getMonth()){
				errorCheck = false;
			}else if(start.getMonth() == end.getMonth()){
				if(start.getDay() > end.getDay()){
					errorCheck = false;
				}
			}
		}
		
		if(errorCheck == true){
			this.weekdayStart = calcWeekday(start);
			this.weekdayEnd = calcWeekday(end);
			this.daysBetween = getDaysBetween(start, end);
		}
		
	}
	
	/*
	 * Calculates the integer value of the weekday
	 * @param end -  the day in question. 
	 * @return 0 = Monday, 1 = Tuesday, 2 = Wednesday, 3 = Thursday, 4 = Friday, 5 = Saturday, 6 = Sunday
	 */
	private int calcWeekday(Date end){
		final Date aMonday = new Date(1, "Jan", 1753);
		int weekday = getDaysBetween(aMonday, end) %7;
		return weekday;
	}
	
	/*
	 * This calculates the days between two given dates
	 * @param start - the earlier date of the two dates
	 * @param end - the later of the two given dates
	 * @return the int variable of the weekday for the end date object. 
	 */
	private int getDaysBetween(Date start, Date end){
		int days = 0;
		int startYear = start.getYear();
		int endYear = end.getYear();
		int startMonth = start.getMonth();
		int endMonth = end.getMonth();
		int startDay = start.getDay();
		int endDay = end.getDay();
		int[] monthDays = LeapYearDays.totalDays(startYear);
		
		
		if(startMonth == endMonth){
			days = endDay - startDay;
		}else{
			days += monthDays[startMonth] - startDay + endDay;
			startMonth ++;
			if(startMonth == 13){
				startMonth = 1;
			}
		}
		
		while(startYear < endYear){
			while(startMonth <= 12){
				days += monthDays[startMonth];
				startMonth++;
			}
			startMonth = 1;
			startYear ++;
			monthDays = LeapYearDays.totalDays(startYear);
		}
		
		while(startMonth < endMonth){
			days += monthDays[startMonth];
			startMonth ++;
		}
		
		return days;
	}
	
	/*
	 * Returns the start weekday integer.
	 * @return the weekday as an int.
	 */
	public int getStartWeekday(){
		return this.weekdayStart;
	}
	
	/*
	 * Returns the end weekday integer.
	 * @return the weekday as an int.
	 */
	public int getEndWeekday(){
		return this.weekdayEnd;
	}
	
	/*
	 * Returns the number of days between two dates.
	 * @return the int value of the days between two given dates.
	 */
	public int getDaysBetween(){
		return this.daysBetween;
	}
	
	/*
	 * This method returns the name of the weekday of the start date.
	 * @return A string containing the day of the week of the start date object.
	 */
	public String getStartWeekdayName(){
		return this.WEEKDAYF.get(this.weekdayStart);
	}
	
	/*
	 * This method returns the name of the weekday of the start date.
	 * @return A string containing the day of the week of the start date object.
	 */
	public String getEndWeekdayName(){
		return this.WEEKDAYF.get(this.weekdayEnd);
	}
	
	/*
	 * This method returns the abbreviated name of the weekday of the start date.
	 * @return A string containing the abbreviated day of the week of the start date object.
	 */
	public String getStartWeekdayAbr(){
		return this.WEEKDAYA.get(this.weekdayStart);
	}
	
	/*
	 * This method returns the abbreviated name of the weekday of the start date.
	 * @return A string containing the abbreviated day of the week of the start date object.
	 */
	public String getEndWeekdayAbr(){
		return this.WEEKDAYA.get(this.weekdayEnd);
	}
	
	/*
	 * This method returns the first letter of the weekday of the start date.
	 * @return A string containing the first letter of day of the week of the start date object.
	 */
	public String getStartWeekdayLetter(){
		return this.WEEKDAYF.get(this.weekdayStart);
	}
	
	/*
	 * This method returns the first letter of the weekday of the start date.
	 * @return A string containing the first letter of the day of the week of the start date object.
	 */
	public String getEndWeekdayLetter(){
		return this.WEEKDAYF.get(this.weekdayEnd);
	}
	
}
