/**
 * 
 */
package solarlunix.madlibs;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class auto generates MadLibs - no user input
 * @author SolarLunix a.k.a. Melissa Melaugh
 * Date Created:	02 October 2016
 * Date Edited:		02 October 2016
 */
public class Gen {
	private String [] madLib;
	private String finishedMadLib;
	private Random rnd;
	private ArrayList<String> nouns;
	
	/**
	 * Default Constructor
	 */
	public Gen(){
		rnd = new Random();
		this.nouns = new ArrayList<String>();
		this.nouns.add("Not Used");
		this.finishedMadLib = "true";
		//get the MadLib to split
		this.madLib = Lists.madlibs.get(rnd.nextInt(Lists.madlibs.size())).split(" ");
	}//end Gen
	
	/**
	 * This method generates the madlib and calls the Lists.save method to save it to a .txt file
	 */
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
				nextWord = Lists.adjs.get(rnd.nextInt(Lists.adjs.size()));
				specialWord = true;
			}else if(checkCommand.contains("getVerb")){
				nextWord = Lists.verbs.get(rnd.nextInt(Lists.verbs.size()));
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
	}//end generate
	
	/**
	 * This method gets the noun from the noun list and returns it as a string. If there isn't a noun matching the 
	 * nounNum, it adds nouns to the list until there is a matching number.
	 * @param nounNum	the noun that is wanted
	 * @return			the noun wanted
	 */
	private String getNoun(int nounNum){
		String noun = "";
		while(true){
			if(nounNum < this.nouns.size() && nounNum >= 1){
				noun = this.nouns.get(nounNum);
				break;
			}else if(nounNum >= 1){
				this.nouns.add(Lists.nouns.get(rnd.nextInt(Lists.nouns.size())));
			}else{
				nounNum = rnd.nextInt(this.nouns.size());
			}
		}//end while loop
		return noun;
	}//end getNoun

	/**
	 * This is for test purposes
	 */
	public String getMadLib(){
		return this.finishedMadLib;
	}
}
