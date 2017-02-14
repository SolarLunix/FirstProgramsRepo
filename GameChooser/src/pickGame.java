import java.util.Random;


public class pickGame {
	
	pickGame(){
		
	}
	
	public void selectGame(){
		
		Random rnd = new Random();
		int gameChoice = rnd.nextInt(Main.gamesList.size());
		
		System.out.println(Main.gamesList.get(gameChoice));
	}

}
