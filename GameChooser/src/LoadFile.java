import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LoadFile {
	
	public static void inFileGetStrings(){
		File fileLoc = new File("gamesList.txt");
		try {
			BufferedReader read = new BufferedReader(new FileReader(fileLoc));
			
			String line;
			while((line = read.readLine()) != null){
				Main.gamesList.add(line);
			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
