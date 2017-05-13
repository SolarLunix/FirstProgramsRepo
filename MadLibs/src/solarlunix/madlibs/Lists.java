/**
 * 
 */
package solarlunix.madlibs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author SolarLunix a.k.a. Melissa Melaugh
 * Date Created:	02 October 2016
 * Date Edited:		02 October 2016
 */
public class Lists {
	public static ArrayList<String> madlibs = new ArrayList<String>();
	public static ArrayList<String> nouns = new ArrayList<String>();
	public static ArrayList<String> verbs = new ArrayList<String>();
	public static ArrayList<String> adjs = new ArrayList<String>();
	private static String newDirectory;
	/**
	 * This method attempts to populate the lists. Returns true if lists populate
	 * @return	True if lists are populated, false if they are not.
	 */
	public static boolean populateLists(){
		Boolean read = true;
		String directory = System.getProperty("user.dir");
		newDirectory = directory + "\\src\\solarlunix\\madlibs";
		Scanner in = new Scanner(System.in);
		//Fill MadLibs
		try {
			in = new Scanner(new File(newDirectory + "\\MadLibs.txt"));
			while(in.hasNextLine())
			{
				madlibs.add(in.nextLine());
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			read = false;
		}
		//Fill Adjectives
		try {
			in = new Scanner(new File(newDirectory + "\\Adj.txt"));
			while(in.hasNextLine())
			{
				adjs.add(in.nextLine());
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			read = false;
		}
		//Fill Nouns
		try {
			in = new Scanner(new File(newDirectory + "\\Nouns.txt"));
			while(in.hasNextLine())
			{
				nouns.add(in.nextLine());
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			read = false;
		}
		//Fill Verbs
		try {
			in = new Scanner(new File(newDirectory + "\\Verbs.txt"));
			while(in.hasNextLine())
			{
				verbs.add(in.nextLine());
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			read = false;
		}
		//finalize
		in.close();
		return read;
	}
	
	public static void saveLib(String toAdd){
		// The name of the file to open.
        String fileName = newDirectory + "\\0utput.txt";

        try {
        	//remove the old file
        	File old = new File(fileName);
        	old.delete();
        	FileWriter fileWrite = new FileWriter(new File(fileName));
            fileWrite.write(toAdd);
            fileWrite.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
	}
}
