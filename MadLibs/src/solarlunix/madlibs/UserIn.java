/**
 * 
 */
package solarlunix.madlibs;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class is set up for the user to be able to enter their own words
 * @author SolarLunix a.k.a. Melissa Melaugh
 * Date Created:	02 October 2016
 * Date Edited:		02 October 2016
 */
public class UserIn {
	private String [] madLib;
	private String finishedMadLib;
	private Random rnd;
	private ArrayList<String> nouns;
	
	/**
	 * Default Constructor
	 */
	public UserIn(){
		rnd = new Random();
		this.nouns = new ArrayList<String>();
		this.nouns.add("Not Used");
		this.finishedMadLib = "true";
		//get the MadLib to split
		this.madLib = Lists.madlibs.get(rnd.nextInt(Lists.madlibs.size())).split(" ");
	}//end UserIn
	
	public void generate(){
		this.finishedMadLib = "";
		for(int i = 0; i < this.madLib.length; i++){
			String nextWord = this.madLib[i];
			String checkCommand = this.madLib[i];
			boolean specialWord = false;
			
			//If there is a special character or method call, make sure that it gets the proper input and replaces nextWord
			if(checkCommand.equalsIgnoreCase("\\n")){
				nextWord = "\n   ";
			}else if(checkCommand.contains("getNoun")){
				//Get the noun that is supposed to be used based on the number after getNoun
				try{
					if(checkCommand.contains(".") || checkCommand.contains(",")
							|| checkCommand.contains(";") || checkCommand.contains(":")){
						nextWord = checkCommand.substring(0, (checkCommand.length()-1));
					}
					int nounNum = Integer.parseInt(nextWord.substring("getNoun".length()));
					nextWord = getNoun(nounNum);
					specialWord = true;
				}catch(NumberFormatException e){
					//if the number isn't parsable, put a random noun in there.
					nextWord = Lists.nouns.get(rnd.nextInt(Lists.nouns.size()));
				}
			}else if(checkCommand.contains("getAdj")){
				nextWord = Main.getStrResponse("Please enter an adjective.");
				specialWord = true;
			}else if(checkCommand.contains("getVerb")){
				nextWord = Main.getStrResponse("Please enter a verb.");
				specialWord = true;
			}
			
			//If there is a special character associated with a command, make sure it is re-added
			if(checkCommand.contains(".") && specialWord){
				nextWord += ".";
			}else if(checkCommand.contains(",") && specialWord){
				nextWord += ",";
			}else if(checkCommand.contains(":") && specialWord){
				nextWord += ":";
			}else if(checkCommand.contains(";") && specialWord){
				nextWord += ";";
			}
			
			this.finishedMadLib += (nextWord + " ");
		}//end for loop
		System.out.println(this.finishedMadLib);
		Lists.saveLib(this.finishedMadLib);
	}
	
	/**
	 * This method gets the noun from the noun list and returns it as a string. If there isn't a noun matching the 
	 * nounNum, it adds nouns to the list until there is a matching number.
	 * @param nounNum	the noun that is wanted
	 * @return			the noun wanted
	 */
	private String getNoun(int nounNum){
		String noun = "";
		if(nounNum < this.nouns.size() && nounNum >= 1){
			noun = this.nouns.get(nounNum);
		}else{
			noun = Main.getStrResponse("Please enter a noun");
			this.nouns.add(noun);
		}
		return noun;
	}//end getNoun
}
