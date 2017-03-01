import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Random rnd = new Random();
        String[] listTime = {"morning", "noon", "evening", "night"};
        String[] listWeather = {"stormy", "clear", "snowy", "cold"};
        String[] listPlace = {"in a car", "in a field", "in my house", "in the street"};
        String[] listObject = {"book", "pencil", "phone", "dagger"};
        String[] listPerson = {"a friend", "my enemy", "a stranger", "a dog"};
        Scanner inAns = new Scanner(System.in);
        
        int loopBreak = 0;
        
        while(loopBreak != 1){
            System.out.println("It was " + listTime[rnd.nextInt(4)] + " and it was " +
                                    listWeather[rnd.nextInt(4)] + ". I was " + listPlace[rnd.nextInt(4)] +
                                        " with my " + listObject[rnd.nextInt(4)] + ", waiting for " +
                                        listPerson[rnd.nextInt(4)]);
            
            System.out.println("Do you wish to stop, Type Y for Yes or N for N");
            String ans = inAns.next();
            if(ans.equals("Y") || ans.equals("y")){
                loopBreak = 1;
                System.out.println("--ENDING PROGRAM--");
            }
        }
    }

}