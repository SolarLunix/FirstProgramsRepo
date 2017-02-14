import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SaveFile {
	
	SaveFile(){
		
	}
	
	public void writeGamesList(){
		System.out.println("Write the games list, (e) to exit");
		
		String game;
		while (true){
			game = Main.scn.nextLine();
			
			if(game.equalsIgnoreCase("e")){
				break;
			} else {
				Main.gamesList.add(game);
			}
		}
		
		try {
			FileWriter write = new FileWriter(new File("gamesList.txt"));
			
			for(String aGame: Main.gamesList){
				write.write(aGame + "\n");
			}
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
