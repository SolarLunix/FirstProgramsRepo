import java.util.Scanner;
import java.util.Random;

public class Game {
	int choice;
	int count;
	
	Player p = new Player();
	TextGraphics acter = new TextGraphics();
	
	public void intro(){
		System.out.print("Welcome to Pet Love, please chose your player: "
				+ "\n\t For a bunny press 0 \n\t For a bear press 1 \n\t Then press enter "
				+ "\nYour choice is: ");
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		System.out.println("");
		
		Random rnd = new Random();
		
		if(choice == 0){
			acter.bunny();
		}else if(choice == 1){
			acter.teddy();
		}else{
			choice = rnd.nextInt(2);
			if(choice == 0){
				System.out.println("Input invalid, your character is now a bunny.");
				acter.bunny();
			}else if (choice == 1){
				System.out.println("Input invalid, your character is now a bear.");
				acter.teddy();
			}else{
				System.out.println("Error");
			}
			
			System.out.println("");
		}
		
		p.love = 10;
		p.startlove = 10;
		p.health = 10;
		p.starthealth = 10;
		
		commands();
		game();
		
		
	}
	
	public void commands(){
		System.out.println("The commands for your pet are as follows:"
				+ "\n\t 0: Display commands"
				+ "\n\t 1: Pet your pet \t (+love)"
				+ "\n\t 2: Brush your pet \t (+love +health)"
				+ "\n\t 3: Scold your pet \t (-love +health)"
				+ "\n\t 4: Hurt your pet \t (-love -health)"
				+ "\n\t 5: Feed your pet \t (+health)"
				+ "\n\t 6: Play with your pet \t (+love)"
				+ "\n\t 7: Ignore your pet"
				+ "\n\t 8: Check your pet's current stats"
				+ "\n\t 9: Quit");
	}
	
	public void game(){
		for(int i=1; i<11; i++){
			if(count == 7){
				i = 0;
				count = 1;
				if(p.love <= p.startlove && p.love != 100){
					System.out.println("You haven't provided your pet with love in 7 turns, -10 love");
					p.love -= 10;
				}
				
				if(p.health <= p.starthealth && p.health != 100){
					System.out.println("You haven't provided your pet with health in 7 turns, -10 health");
					p.health -= 10;
				}
				
				p.startlove = p.love;
				p.starthealth = p.health;
				count = 0;
				
				System.out.println("After seven turns your pet's health is as follows:" + "\n\tLove: " + p.love + "\n\tHealth:" + p.health);
				System.out.print("\nWould you like to continue playing with your pet? ");
				Scanner in1 = new Scanner(System.in);
				String ans = in1.nextLine();
				
				if(!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("y")){
					break; 
				}
			}
			
			System.out.print("What would you like to do with your pet? ");
			Scanner in0 = new Scanner(System.in);
			int num = in0.nextInt();
			System.out.println("");
			
			if(num == 0){
				commands();
			}else if(num == 1){
				p.pet();
				count ++;
			}else if(num == 2){
				p.brush();
				count ++;
			}else if(num == 3){
				p.scold();
				count ++;
			}else if(num == 4){
				p.hurt();
				count ++;
			}else if(num == 5){
				p.feed();
				count ++;
			}else if(num == 6){
				p.play();
				count ++;
			}else if(num == 7){
				p.ignore();
				count ++;
			}else if(num == 8){
				System.out.println("Your pet's health is as follows:" + "\n\tLove: " + p.love + "\n\tHealth:" + p.health);
			}else if(num == 9){
				break;
			}else{
				p.ignore();
				count ++;
			}
			
			p.check();
			if(p.health ==0){
				if(choice == 0){
					acter.deadBunny();
					break;
				}else{
					acter.deadTeddy();
					break;
				}
			}
			
			if(p.health == 0 || p.love == 100){
				if(choice == 0){
					acter.happyBunny();
				}else{
					acter.happyTeddy();
				}
			}
			
		}
		
		System.out.println("\n\nThese are the final stats of your pet: \n\t Love: " + p.love + "\n\t Health:" + p.health + 
				"\nThank you for playing.");
	}
}
