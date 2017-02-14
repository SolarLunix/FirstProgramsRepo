
public class Player {
	int love, startlove;
	int health, starthealth;
	
	TextGraphics acter = new TextGraphics();
	
	//pet, brush, scold, hurt, feed, play, ignore
	
	public void check(){
		if(love >= 100){
			System.out.println("You have reached maximum love points!");
			love = 100;
		}
		
		if(health == 100){
			System.out.println("You have reached maximum health points!");
			health = 100;
		}
		
		if(love <= 0){
			System.out.println("Your pet has run away.");
			love = 0;
		}
		
		if(health <= 0){
			System.out.println("Your pet has died.");
			health = 0;
		}
	}
	
	public void pet(){
		love += 5;
		System.out.println("You pet your pet, your pet responds happily.");
	}
	
	public void brush(){
		love += 5;
		health += 5;
		System.out.println("You brush your pet, your pet smiles at you.");
	}
	
	public void scold(){
		love -= 3;
		health += 3;
		System.out.println("Your pet was being bad, so you scold your pet. Your pet cowers in fear.");
	}
	
	public void hurt(){
		love -= 10;
		health -= 10;
		System.out.println("You accidentally hurt your pet. Your pet squeels and moves away from you.");
	}
	
	public void feed(){
		health += 5;
		System.out.println("You feed your pet some yummy treats.");
	}
	
	public void play(){
		love+=10;
		System.out.println("You play with your pet.");
	}
	
	public void ignore(){
		System.out.println("You ignore your pet, who starts batting at your leg.");
	}
}
