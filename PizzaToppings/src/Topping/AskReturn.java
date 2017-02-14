package Topping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AskReturn {
	public void createList(){
		//Set up scanner, String list, and while loop
		Scanner addItem = new Scanner(System.in);
		List<String> topList = new ArrayList<String>();
		String item = null;
		
		boolean add = true;
		
		//Initiate the user
		System.out.println("Hello and welcome to TheToppings, a quick and easy way to determine the most desired toppings "
				+ "your guests would like."
				+ "\n  Step 1: Type in a topping and then press enter - repeat until all desired toppings are entered"
				+ "\n  Step 2: Pass the device on to the next person to repeate step 1 (toppings from the previous person should be ignored)"
				+ "\n  Step 3: When everyone is finished type \"done\" and then press enter"
				+ "\n  Step 4: Wait for the program to tell you what you should get"
				+ "\nEnter your toppings:");
		
		//Continue adding items until the user types in the word "done"
		while(add){
			item = addItem.nextLine();
			item = item.trim();
			item = item.toLowerCase();
			
			//check to make sure that done wasn't typed, add non "done" items to list:
			if(item.equalsIgnoreCase("done")){
				add = false;
			}else{
				//Add the items to the list
				topList.add(item);
			}
		}
		
		countandOrder(topList);
		addItem.close();
		
		System.out.println("Thank you for using TheToppings. Goodbye!");
		
	}
	
	private void countandOrder(List<String> l) {
		//Take out duplicates in list in order to count and check
		Set<String> hashTopList = new HashSet<String> (l);
		
		//Set up new list to take items and numbers
		List<String> topList = new ArrayList<String>();
		
		//count the number of times an item appears
		for(String x : hashTopList){
			int itemNum = Collections.frequency(l, x);
			if(itemNum == 1){
				String item = (itemNum + " person would like "+ x);
				topList.add(item);
			}else{
				String item = (itemNum + " people would like "+ x);
				topList.add(item);
			}	
		}
		
		// order the list by amount of people requesting the item
		Collections.sort(topList);
		Collections.reverse(topList);
		
		//print out toppings requested
		System.out.println("Toppings in ordrder of request: ");
		for(String x : topList){
			System.out.println("\t" + x);
		}
	}
}
