import java.util.Random;
import java.util.Scanner;
public class setting {
    public static void main (String [] args) {
        Scanner inAns = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        System.out.println("Are you male or female? (M = Male; F = Female)");
        String ans = inAns.next();
        if (ans.equals("M") || ans.equals("m")){
            System.out.println("How old are you?");
            int v = inp.nextInt();
            if (v<=18 && v>=5) {
                System.out.println(" ");
                System.out.println("Welcome to school.");
                MSchool test = new MSchool();
            }
            
            if (v>=18){
                System.out.println(" ");
                System.out.println("Welcome to college.");
                MCollege test = new MCollege();
            }
        }
        
        if (ans.equals("F") || ans.equals("f")){
            System.out.println("How old are you?");
            int v = inp.nextInt();
            if (v<=18 && v>=5) {
                System.out.println(" ");
                System.out.println("Welcome to school.");
                FSchool test = new FSchool();
            }
            
            if (v>=18){
                System.out.println(" ");
                System.out.println("Welcome to college.");
                FCollege test = new FCollege();
            }
        }
    }
}    