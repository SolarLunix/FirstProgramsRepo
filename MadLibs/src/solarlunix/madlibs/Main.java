/**
 * 
 */
package solarlunix.madlibs;

import java.util.Scanner;

/**
 * This is the main class for a MadLibs generator which will either generate a completed MadLibs for you, 
 * or you can enter the words when prompted.  
 * @author SolarLunix a.k.a. Melissa Melaugh
 * Date Created:	02 October 2016
 * Date Edited:		02 October 2016
 */
public class Main {
	private static Scanner keyIn;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		keyIn = new Scanner(System.in);
		boolean lists = Lists.populateLists();
		if(lists){
			Gen madLib = new Gen();
			madLib.generate();
			UserIn userIn = new UserIn();
			userIn.generate();
		}
	}
	
	/**
	 * This method prompts the user for a response, and returns the String they responded with
	 * @param aString	The prompt
	 * @return			The String value that the user entered
	 */
	static public String getStrResponse(String aString){
		String response = "";
		while(true){
			System.out.println(aString);
			response = keyIn.nextLine();
			if(!response.isEmpty()){
				break;
			}
		}
		return response;
	}
	
	/**
	 * This method prompts the user for a yes or no response, and returns Y for yes and N for no
	 * @param aString	The prompt
	 * @return			Y for yes and N for no
	 */
	static public String getYesNoResponse(String aString){
		String response = "";
		while(true){
			System.out.println(aString);
			response = keyIn.nextLine();
			if(response.equalsIgnoreCase("Y")){
				return "Y";
			}else if(response.equalsIgnoreCase("N")){
				return "N";
			}
		}
	}
	
	/**
	 * This method prompts the user for an integer response and returns the value.
	 * @param aString	The prompt
	 * @param min		The minimum value the returned integer can be
	 * @param max		The maximum value the returned integer can be
	 * @return			The user's integer choice
	 */
	static public int getNumResponse(String aString, int min, int max){
		Boolean gotResponse = false;
		int response = min - 1; //Set response to a number that cannot change gotResponse to true
		do{
			//Print out the options in aString
			System.out.println(aString);
			if(keyIn.hasNextInt()){
				//Get the next int and store it as the response
				response = keyIn.nextInt();
				keyIn.nextLine();
				if(response >= min && response <= max){
					//If the response is within the parameters the loop can be exited
					gotResponse = true;
				}else{
					//If the response is outside of the parameters, inform the user and prompt again
					System.out.println("Option not valid");
				}
			}else{
				//Inform the user that there was an error with what they entered and prompt again
				keyIn.next(); //Ensures that there is not an infinite loop of prints
				System.out.println("You must enter a numeric value then press enter.");
			}
		}while(!gotResponse);
		return response;
	}

}
