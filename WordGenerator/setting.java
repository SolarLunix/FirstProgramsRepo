import java.util.Random;
import java.util.Scanner;

public class setting {
    public static void main (String [] args) {
        Random rnd = new Random();
        
        String [] listPOV = new String [3];
        listPOV[0] = "first person.";
        listPOV[1] = "second person.";
        listPOV[2] = "third person.";
        
        String[] listTime = new String [16];
        listTime[0] = "early in the morning";
        listTime[1] = "around breakfast time";
        listTime[2] = "mid morning";
        listTime[3] = "late in the morning";
        listTime[4] = "around lunch time";
        listTime[5] = "early in the afternoon";
        listTime[6] = "mid afternon";
        listTime[7] = "late in the afternoon";
        listTime[8] = "around dinner time"; 
        listTime[9] = "early in the evening"; 
        listTime[10] = "mid evening";
        listTime[11] = "late in the evening"; 
        listTime[12] = "around midnight";
        listTime[13] = "just as twilight set";
        listTime[14] = "sunset";
        listTime[15] = "sunrise";
        
        String[] listWeather = new String [17];
        listWeather[0] = "snowing";
        listWeather[1] = "lightly snowing";
        listWeather[2] = "heavily snowing";
        listWeather[3] = "freezing";
        listWeather[4] = "raining";
        listWeather[5] = "lightly raining";
        listWeather[6] = "raining heavily";
        listWeather[7] = "flooding";
        listWeather[8] = "clear";
        listWeather[9] = "cold";
        listWeather[10] = "hot";
        listWeather[11] = "warm";
        listWeather[12] = "cool";
        listWeather[13] = "perfect";
        listWeather[14] = "foggy";
        listWeather[15] = "misty";
        listWeather[16] = "hailing";        
        
        String[] listEvent = new String [47];
        listEvent[0] = "going to be moving into the";
        listEvent[1] = "about to slay the dragon at the";
        listEvent[2] = "breaking the law at the";
        listEvent[3] = "bringing justice at the";
        listEvent[4] = "watching a ghost trying to make trouble at the";
        listEvent[5] = "watching a ghost trying to make peace at the";
        listEvent[6] = "tricked by the fairies at the";
        listEvent[7] = "helped by the fairies at the";
        listEvent[9] = "taken in by the fairies at the";
        listEvent[10] = "learning how to drive at the";
        listEvent[11] = "shooting a gun at the";
        listEvent[12] = "learning martial arts at the";
        listEvent[13] = "shooting a bow and arrow at the";
        listEvent[14] = "doing something embarassing at the";
        listEvent[15] = "playing a board game at the";
        listEvent[16] = "breaking the rules at the";
        listEvent[17] = "breaking something at the";
        listEvent[18] = "finding a secret passage at the";
        listEvent[19] = "finding a secret hide out at the";
        listEvent[20] = "following dreams at the";
        listEvent[21] = "being dumped at the";
        listEvent[22] = "being asked out at the";
        listEvent[23] = "losing a friend at the";
        listEvent[24] = "making a friend at the";
        listEvent[25] = "making friends at the";
        listEvent[26] = "writing a book at the";
        listEvent[27] = "finding a happy ending at the";
        listEvent[28] = "finding God at the";
        listEvent[29] = "having a conversation with God at the";
        listEvent[30] = "yelling at God at the";
        listEvent[31] = "heartbroken at the";
        listEvent[32] = "dealing with the loss of a loved one at the";
        listEvent[33] = "hearing the news about the new baby at the";
        listEvent[34] = "adopting a child at the";
        listEvent[35] = "giving a child up for adoption at the";
        listEvent[36] = "running away to the";
        listEvent[37] = "breaking up with the long term partner at the";
        listEvent[38] = "asking someone out at the";
        listEvent[39] = "going for a romantic dinner at the";
        listEvent[40] = "going on a date at the";
        listEvent[41] = "making breakfast at the";
        listEvent[42] = "making lunch at the";
        listEvent[43] = "making dinner at the";
        listEvent[44] = "grooming at the";
        listEvent[45] = "Watching TV at the";
        listEvent[46] = "enjoying the first kiss at the";        

        String[] listPlace = new String [31];
        listPlace[0] = " tree.";
        listPlace[1] = " field.";
        listPlace[2] = " sidewalk.";
        listPlace[3] = " old dirt road.";
        listPlace[4] = " airport.";
        listPlace[5] = " lakeside.";
        listPlace[6] = " lake.";
        listPlace[7] = " beach.";
        listPlace[8] = " ocean.";
        listPlace[9] = " town.";
        listPlace[10] = " large town.";
        listPlace[11] = " small city.";
        listPlace[12] = " large city.";
        listPlace[13] = " outskirts of civilization.";
        listPlace[14] = " corn field.";
        listPlace[15] = " riverside.";
        listPlace[16] = " river.";
        listPlace[17] = " home.";
        listPlace[18] = " castle.";
        listPlace[19] = " ruins.";
        listPlace[20] = " workplace.";
        listPlace[21] = " restaurant.";
        listPlace[22] = " drive through.";
        listPlace[23] = " abandoned movie theater.";
        listPlace[24] = " movie theater.";
        listPlace[25] = " car park.";
        listPlace[26] = " theme park.";
        listPlace[27] = " water park.";
        listPlace[28] = " zoo.";
        listPlace[29] = " hotel.";
        listPlace[30] = " country house.";
        
        String[] listProp = new String [11];
        listProp[0] = "apple";
        listProp[1] = "book";
        listProp[2] = "dagger";
        listProp[3] = "pencil";
        listProp[4] = "sword";
        listProp[5] = "puppy";
        listProp[6] = "ring";
        listProp[7] = "teddy bear";
        listProp[8] = "phone";
        listProp[9] = "laptop";
        listProp[10] = "keys";
        
               
        
        Scanner inAns = new Scanner(System.in);
        int loopBreak = 0;
        
        while (loopBreak != 1){
            int x=rnd.nextInt(3);
            System.out.println(" ");
            
        if (x==0) {
            System.out.println("Written in the " + listPOV[x] + ", your story could begin as follows:");
            System.out.println("It was " + listTime[rnd.nextInt(16)] + " and already " + listWeather[rnd.nextInt(17)] + ". I was " + listEvent[rnd.nextInt(47)] + listPlace[rnd.nextInt(31)] + " In my hand, I held my trusty " + listProp[rnd.nextInt(11)] + " which never left my sight." );
            
            System.out.println(" ");
            System.out.println("Do you wish to generate another setting? (Y = Yes; N = No)");
            String ans = inAns.next();
            if (ans.equals("N") || ans.equals("n")){
                loopBreak = 1;
                System.out.println("Thank you for using Story Generator! Goodbye!");
            }
        }
        
        if (x==1){
            System.out.println("Written in the " + listPOV[x] + ", your story could begin as follows:");
            System.out.println("It was " + listTime[rnd.nextInt(16)] + " and already " + listWeather[rnd.nextInt(17)] + ". You were " + listEvent[rnd.nextInt(47)] + listPlace[rnd.nextInt(31)] + " You kept moving your " + listProp[rnd.nextInt(11)] + " which was pretty distracting." );
            
            System.out.println(" ");
            System.out.println("Do you wish to generate another setting? (Y = Yes; N = No)");
            String ans = inAns.next();
            if (ans.equals("N") || ans.equals("n")){
                loopBreak = 1;
                System.out.println("Thank you for using Story Generator! Goodbye!");
            }
        }
        
        if (x==2) {
            System.out.println("Do you want your main character to be a boy or a girl? (B = Boy; G = Girl)");
            String ans = inAns.next();
            if (ans.equals("B") || ans.equals("b")){
                System.out.println(" ");
                System.out.println("Written in the " + listPOV[x] + ", your story could begin as follows:");
                System.out.println("It was " + listTime[rnd.nextInt(16)] + " and already " + listWeather[rnd.nextInt(17)] + ". He was " + listEvent[rnd.nextInt(47)] + listPlace[rnd.nextInt(31)] + " In his hand, he held his trusty " + listProp[rnd.nextInt(11)] + " which never left his sight." );
                System.out.println("Do you wish to generate another setting? (Y = Yes; N = No)");
                String ans1 = inAns.next();
                if (ans1.equals("N") || ans1.equals("n")){
                    loopBreak = 1;
                    System.out.println("Thank you for using Story Generator! Goodbye!");
                }
            }
            
            if (ans.equals("G") || ans.equals("g")){
                System.out.println(" ");
                System.out.println("Written in the " + listPOV[x] + ", your story could begin as follows:");
                System.out.println("It was " + listTime[rnd.nextInt(16)] + " and already " + listWeather[rnd.nextInt(17)] + ". She was " + listEvent[rnd.nextInt(47)] + listPlace[rnd.nextInt(31)] + " In her hand, she held her trusty " + listProp[rnd.nextInt(11)] + " which never left her sight." );
                System.out.println("Do you wish to generate another setting? (Y = Yes; N = No)");
                String ans1 = inAns.next();
                if (ans1.equals("N") || ans1.equals("n")){
                    loopBreak = 1;
                    System.out.println("Thank you for using Story Generator! Goodbye!");
                }
            }
        }
    }
  }
}