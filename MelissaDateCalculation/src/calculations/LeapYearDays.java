package calculations;

public interface LeapYearDays {
	
	/*
	 * This method checks if the given year is a leap year
	 * @return true if it is a leap year, false if it is a normal year.
	 */
	static boolean isLeapYear(int year){
		if (year%4 == 0){
			if (year%100 == 0){
				if (year%400 == 0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
	
	/*
	 * This method uses the method above to return a basic Array of the days
	 * @return an Array of the total days in each month
	 */
	static int[] totalDays(int year){
		//Set up initially with normal February, first number is 100 to prevent a double error printout
		int[] daysInMonth = new int[13];
		
		daysInMonth[0] = 100;
		daysInMonth[1] = 31;
		if(LeapYearDays.isLeapYear(year) == true){
			daysInMonth[2] = 29;
		}else{
			daysInMonth[2] = 28;
		}
		daysInMonth[3] = 31;
		daysInMonth[4] = 30;
		daysInMonth[5] = 31;
		daysInMonth[6] = 30;
		daysInMonth[7] = 31;
		daysInMonth[8] = 31;
		daysInMonth[9] = 30;
		daysInMonth[10] = 31;
		daysInMonth[11] = 30;
		daysInMonth[12] = 31;
		
		return daysInMonth;
	}
	
}
