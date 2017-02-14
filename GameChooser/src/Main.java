import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static Scanner scn;
	public static ArrayList<String> gamesList;
	
	public static void main(String[] args){
		
		scn = new Scanner(System.in);
		gamesList = new ArrayList<String>();
		LoadFile.inFileGetStrings();
		
		int exit = 0;
		
		while(exit == 0){
			System.out.println("\n\tDo you want to write a list (w) or randomly select a game (g), (e) to exit");
			String read = scn.nextLine();
			if(read.equalsIgnoreCase("w")){
				SaveFile sf = new SaveFile();
				sf.writeGamesList();
			} else if (read.equalsIgnoreCase("g")){
				pickGame pg = new pickGame();
				pg.selectGame();
			} else if (read.equalsIgnoreCase("e")){
				exit = 1;
			} else {
				System.out.println("Incorrect Input.");
			}
			
		}
		
		scn.close();
	}

}
