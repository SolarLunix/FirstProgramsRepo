package setUp;

import java.util.Scanner;
import java.util.ArrayList;

import calculations.DaysBetween;
import calculations.LeapYearDays;
import setUp.Date;

public class Controls{
	
	private ArrayList<String> options;
	
	/*
	 * This constructor basically runs the entire program. It allows the user to chose what they would like to do with it and then
	 * calls the method of the option that they picked. 
	 */
	public Controls(){
		boolean runProgram = true;
		
		//Welcome the user and let them know how this will work.
		System.out.println("Hello and welcome to Melissa Melaugh's Date Calculator. \nHere you can do all sorts of calculations"
				+ "involving dates. However, this date calculator will only be accurate for dates after and including 1753."
				+ " \nBelow is a list of options.");
		
		options = new ArrayList<String>();
		options.add(0, "0: Quit");
		options.add(1, "1: Calculate the days between two dates");
		options.add(2, "2: Check if a year is a leap year or not");
		options.add(3, "3: View all the leap years between two years");
		options.add(4, "4: View a year's calender");
		
		
		while(runProgram == true){
			//This for loop prints out all of the options
			System.out.println();
			for(int i = 0; i < options.size(); i++){
				System.out.println("\t" + options.get(i));
			}
		
			//Initialize the user.
			System.out.print("\nPlease input the number corresponding to the function you wish to use: ");
			Scanner input = new Scanner(System.in);
			
			//TODO add if statements that directs you to the correct method.
			//If(choice == 1) { choiceOne(); }
			if(input.hasNextInt()){
				int choice = input.nextInt();
				if(choice == 0){
					break;
				}else if(choice == 1){
					choice1();
				}else if(choice == 2){
					choice2();
				}else if(choice == 3){
					choice3();
				}else if(choice == 4){
					choice4();
				}
				
			}else{
				System.out.println("Invalid input");
				runProgram = false;
			}
			
			System.out.print("\nWould you like to run the program again? ");
			Scanner q = new Scanner(System.in);
			String ans = q.next();
			if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){
				runProgram = true;
			}else{
				runProgram = false;
			}
		}
	}
	

	/*
	 * This method prints out the number of days between two dates.
	 */
	private void choice1(){
		System.out.println("\n\nYou have chosen to calculate the days between two dates. \n   If you did not mean to select this, "
				+ "please enter 0 for the next prompt.");
		System.out.print("Please enter all dates in the following format: Year Month Day \nEnter the earlier of the two dates: ");
		Scanner in = new Scanner(System.in);
		Date start = new Date (1, 1, 1753);
		Date end = new Date (1,1,1753);
		boolean error = true;
		
		int day = 0;
		int month = 0;
		int year = 0;
		String months = "";
		
		if(in.hasNextInt()){
			day = in.nextInt();
			if(day != 0){
				if(in.hasNextInt()){
					month = in.nextInt();
					if(in.hasNextInt()){
						year = in.nextInt();
						start = new Date(day, month, year);
						error = start.getErrorCheck();
					}else{
						error=false;
						System.out.println("I'm sorry the program has encountered an error.");
					}
				}else if(in.hasNext()){
					months = in.next();
					if(in.hasNextInt()){
						year = in.nextInt();
						start = new Date(day, months, year);
						error = start.getErrorCheck();
					}else{
						error=false;
						System.out.println("I'm sorry the program has encountered an error.");
					}
				}else{
					error=false;
					System.out.println("I'm sorry the program has encountered an error.");
				}
				
				System.out.print("Enter the later of the two dates: ");
				if(in.hasNextInt()){
					day = in.nextInt();
					if(in.hasNextInt()){
						month = in.nextInt();
						if(in.hasNextInt()){
							year = in.nextInt();
							end = new Date(day, month, year);
							error = end.getErrorCheck();
						}else{
							error=false;
							System.out.println("I'm sorry the program has encountered an error.");
						}
					}else if(in.hasNext()){
						months = in.next();
						if(in.hasNextInt()){
							year = in.nextInt();
							end = new Date(day, months, year);
							error = end.getErrorCheck();
						}else{
							error=false;
							System.out.println("I'm sorry the program has encountered an error.");
						}
					}else{
						error=false;
						System.out.println("I'm sorry the program has encountered an error.");
					}
				}else{
					error = false;
					System.out.println("I'm sorry the program has encountered an error.");
				}
				
				
			}else{
				error=false;
			}
		}
		
		if(error == true){
			DaysBetween d = new DaysBetween(start, end);
			int daysbetween = d.getDaysBetween();
			String startday = d.getStartWeekdayName() + ", " + start.getDay() + " " + start.getMonthS() + ", " + start.getYear();
			String endday = d.getEndWeekdayName() + ", " + end.getDay() + " " + end.getMonthS() + ", " + end.getYear();
			
			if(daysbetween != 1){
				System.out.println("\nThere are " + daysbetween + " days between " + startday + " and " + endday + ".");
			}else{
				System.out.println("\nThere is " + daysbetween + " day between " + startday + " and " + endday + ".");
			}
			
		}
	}
	
	/*
	 * This method asks the user to put in a year and prints out if the year is a leap year or a normal year.
	 */
	private void choice2() {
		System.out.println("\n\nYou have chosen to check if a year is a leap year. \n   If you did not mean to select this, "
				+ "please enter 0 for the next prompt.");
		System.out.print("Please the year you wish to check: ");
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextInt()){
			int year = in.nextInt();
			System.out.println();
			if(year != 0){
				if(year > 1753){
					if(LeapYearDays.isLeapYear(year)){
						System.out.println(year + " is a leap year.");
					}else{
						System.out.println(year + " is not a leap year.");
					}
				}else{
					System.out.println("The year " + year + " was before leap years were propperly implemented.");
				}
			}
		}else{
			System.out.println("There was an error with the entered year.");
		}
	}

	/*
	 * This method prints out all of the leap years between two years (ie it would print out 1992 if the inputs were 1990 and 1993)
	 */
	private void choice3() {
		System.out.println("\n\nYou have chosen to view all of the leap years between two years. \n   "
				+ "If you did not mean to select this, "
				+ "please enter 0 for the next prompt.");
		System.out.print("Please the earliest year: ");
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextInt()){
			int yearStart = in.nextInt();
			System.out.println();
			if(yearStart != 0){
				if(yearStart > 1753){
					System.out.print("Please enter the second year: ");
					if(in.hasNextInt()){
						int yearEnd = in.nextInt();
						if(yearEnd > yearStart){
							System.out.println("The leap years between " + yearStart + " and " + yearEnd + " are:");
							int count = 0;
							while(yearStart <= yearEnd){
								if(LeapYearDays.isLeapYear(yearStart)){
									System.out.println(yearStart);
									count++;
								}
								yearStart++;
							}
							if(count == 0){
								System.out.println("None");
							}
						}
					}else{
						System.out.println("There was an error with the entered year.");
					}
				}else{
					System.out.println("The year " + yearStart + " was before leap years were propperly implemented.");
				}
			}
		}else{
			System.out.println("There was an error with the entered year.");
		}
	}
	
	/*
	 * This method asks the user for a year and  then prints out the calendar for that year.
	 */
	private void choice4() {
		System.out.println("\n\nYou have chosen to view a year's calendar. \n   If you did not mean to select this, "
				+ "please enter 0 for the next prompt.");
		System.out.print("Please enter the year whose calendar you wish to view: ");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()){
			int year = in.nextInt();
			if(year > 1753){
				Date start = new Date (1, 1, year);
				int[] monthDays = LeapYearDays.totalDays(year);
				
				
			}else{
				System.out.println("\nThe year " + year + "occured before the current calendar was adopted.");
			}
		}
	}
	
	/*
	 * A quick thank you and goodbye to end the program.
	 */
	public void end(){
		System.out.println("\n\n\nThank you for using my program, \n~Melissa Melaugh");
	}
}
