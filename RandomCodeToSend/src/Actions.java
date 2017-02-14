import java.util.Random;

public class Actions {
	
	public void Sleep(){
		/* When called, reset the Sleep stat to full */
		
		Random num = new Random();
		int rNum = num.nextInt(5);
		
		if (rNum == 0){
			System.out.println("Taking a long nap.");
		}
		
		if (rNum == 1){
			System.out.println("Sleeping on a cloud.");
		}
		
		if (rNum == 2){
			System.out.println("Taking a dream break.");
		}
		
		if (rNum == 3){
			System.out.println("Catching some Z's.");
		}
		
		if (rNum == 4){
			System.out.println("Dreaming.");
		}
		
	}
	
	public void Eat(){
		/* When called, reset the Eating stat to full. */
		
		Random num = new Random();
		int rNum = num.nextInt(5);
		
		if (rNum == 0){
			System.out.println("\"Mmmmm Chicken.\"");
		}
		
		if (rNum == 1){
			System.out.println("Eating a good meal.");
		}
		
		if (rNum == 2){
			System.out.println("Chowing down.");
		}
		
		if (rNum == 3){
			System.out.println("Fueling up.");
		}
		
		if (rNum == 4){
			System.out.println("Just eating.");
		}
		
	}
	
	
	
}
