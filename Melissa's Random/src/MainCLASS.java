

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainCLASS {

    public static void main(String[] args) {
        /*String[][] test = new String[48][6];
        for(int i = 0; i<48;i++){
            for(int c = 0;c<6;c++){
                test[i][c]= "empty";
            }
        }
        
        test[25][0] = "6";
        test[25][1] = "Primary";
        test[25][2] = "Second";
        test[25][3] = "Third";
        test[25][4] = "Forth";
        test[25][5] = "Fifth";
        
        TimeManager tm = new TimeManager();
        tm.importTimeSlot(test);
        tm.getPrimaryAction(52);
        System.out.println(tm.getRandomActionFromRow(25));
        System.out.println(tm.getStatBasedGrid(3, 3, 3, 25));
    	
    	Rectangle r = new Rectangle(10,10,30,30);
    	System.out.println(r.getSize());
    	
    	Scanner scan = new Scanner(System.in);
    	String words = scan.nextLine();

    	int diameter = 800;
		int radius = 400;
		int fieldL = 4000;
		int rows = (int)((fieldL - diameter)/(radius * Math.sqrt(3))) + 1; // the number of rows
		System.out.println("The next answer should be 5");
		System.out.println(rows);
		int correct = 400;
		int fieldW = 1900;
		int columnODD = (fieldW/diameter); // the number of spots in an odd row
		int columnEVEN = ((fieldW - correct)/diameter); // the number of spots in an even row
		System.out.println("The next answer should be: 2 1");
		System.out.println(columnODD + " " + columnEVEN);
		
		System.out.println("The next answer should be 8");
		int evenRows = (rows/2);
		int oddRows = (rows/2) + (rows%2);
		int totalFields = (evenRows * columnEVEN) + (oddRows * columnODD);
		System.out.println(totalFields);
		
		int a =(int) (Math.sqrt(totalFields));*/
    	
    	/*Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas in the tank ");
        double gallons = in.nextDouble();
        System.out.print("\nEnter the fuel efficiency ");
        double efficiency = in.nextDouble();
        final double GASPRICE = 3.95;
        double distance = gallons * efficiency;
        double price = gallons*GASPRICE;
        if(efficiency <= 0){
            System.out.println("No can go");
        }else{
        	System.out.printf("\nDistance: %8.1f\nCost: %12.2f", distance, price);
        }
    	Die d1 = new Die(6);
    	int cast = d1.cast();
    	System.out.println(cast);*/
    	//Word word = new Word("Udacity");
    	//System.out.println(word.scramble());
    	/*
    	 * I want to print out from 0:1, 1:2, 2:3, 3:4
    	 * 							0:2, 1:3, 2:4;
    	 * 							0:3, 1:4
    	 * 							0:4;
    	 */
    	
    	
    	/*String word = "ribs";
    	int ln = word.length();
    	String sub = "";
    	int start = 0;
        int end = 0;
        
        for(int i = 1; i <= ln; i ++){
        	for(int c = 0; c < ln; c++){
        		if(c+i <= ln){
        			sub += word.substring(c, c+i) + "\n";
        		}
        	}
        }
        System.out.print(sub);	*/
        
    	/*int xbefore = 10;
    	int ybefore = 10;
    	int xafter = 40;
    	int yafter = 50;
    	double perm = 0;
    	
    	double x = Math.abs((xbefore-xafter) * 1.0);
        double y = Math.abs((ybefore-yafter) * 1.0);
		
		perm += Math.sqrt(x*2 + y*2);
        System.out.println(perm);*/
    	
    	Random rnd = new Random();
    	int choice = rnd.nextInt(2);
    	String[] choices = {"Japanese", "Spanish"};
    	System.out.println(choices[choice]);
    	
        	
    }
    
    
    
}