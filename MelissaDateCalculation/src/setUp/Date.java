package setUp;

import java.util.ArrayList;

import calculations.LeapYearDays;

public class Date implements LeapYearDays, Lists{
	
	private int year;
	private int month;
	private int day;
	private final ArrayList<String> MONTHS = Lists.monthsFull();
	private final ArrayList<String> MONTHS_ABR = Lists.monthsAbr();
	private int[] daysInMonth;
	private boolean errorCheck;
	
	/*
	 * Date Object constructor. 
	 * @param year - year of interest as an integer.
	 * @param month - month of interest as an integer.
	 * @param day - day of interest as an integer.
	 */
	public Date(int day, int month, int year){
		errorCheck = true;
		daysInMonth = new int[13];
		
		this.year = year;
		this.daysInMonth = LeapYearDays.totalDays(this.year);
		
		if(month <= 12){
			this.month = month;
		}else{
			this.month = 0;
			System.out.println("Error, incorrect month entry");
			errorCheck = false;
		}
		
		if(day <= daysInMonth[this.month]){
			this.day = day;
		}else{
			this.day = 0;
			System.out.println("Error, incorrect day entry");
			errorCheck = false;
		}
	}
	
	/*
	 * Date Object constructor. 
	 * @param year - year of interest as an integer.
	 * @param month - month of interest as string, either abreviated or full.
	 * @param day - day of interest as an integer.
	 */
	public Date(int day, String month, int year){
		errorCheck = true;
		daysInMonth = new int[13];
		
		this.year = year;
		this.daysInMonth = LeapYearDays.totalDays(this.year);
		
		int i = 0;
		this.month = 0;
		while(i < 13){
			if(month.equalsIgnoreCase(MONTHS.get(i)) || month.equalsIgnoreCase(MONTHS_ABR.get(i))){
				this.month = i;
			}
			i++;
		}
		if(this.month == 0){
			System.out.println("Error, incorrect month entry");
			errorCheck = false;
		}
		
		if(day <= daysInMonth[this.month]){
			this.day = day;	
		}else{
			this.day = 0;
			System.out.println("Error, incorrect day entry");
			errorCheck = false;
		}
	}
	
	/*
	 * Returns the errorCheck
	 * @return if everything is correct, it will return true.
	 */
	public boolean getErrorCheck(){
		return this.errorCheck;
	}
	
	/*
	 * Returns the year as an integer.
	 * @return the integer of the year of interest.
	 */
	public int getYear(){
		return this.year;
	}
	
	/*
	 * Returns the month as it's integer.
	 * @return the month of interest's corresponding integer. (1 = January)
	 */
	public int getMonth(){
		return this.month;
	}
	
	/*
	 * Returns the month in it's full form.
	 * @return the full month name as a string.
	 */
	public String getMonthS(){
		return this.MONTHS.get(this.month);
	}
	
	/*
	 * Returns the month in it's abbreviated form.
	 * @return the abbreviated month name as a string.
	 */
	public String getMonthSA(){
		return this.MONTHS_ABR.get(this.month);
	}

	/*
	 * Returns the day as an integer.
	 * @return the integer of the day of interest.
	 */
	public int getDay(){
		return this.day;
	}
	
}
