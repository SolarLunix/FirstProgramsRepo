
import java.util.Scanner;
import java.util.Random;
public class List
{
       public static void main(String[] args){
           
    Scanner inp = new Scanner(System.in);
    System.out.println("Welcome to Story Idea Generator");
    System.out.println("Press 0 to Generate the Conditions");
    System.out.println("Press 1 to Generate the Time of Day");
    System.out.println("Press 2 to Generate the Place");
    System.out.println("Press 3 to Generate the Event");
    System.out.println("Press 4 to Generate the Weather");
    System.out.println("Press 5 to Generate the Prop");
    System.out.println("Or press 6 to exit");
    System.out.print("Enter Option: ");
    int v = inp.nextInt();
    
    while(v!=6){
        
        String[] listTime = new String [13];
        listTime[0] = "Early Morning";
        listTime[1] = "Breakfast Time";
        listTime[2] = "Morning";
        listTime[3] = "Late Morning";
        listTime[4] = "Lunch Time";
        listTime[5] = "Early Afternoon";
        listTime[6] = "Afternoon";
        listTime[7] = "Late Afternoon";
        listTime[8] = "Dinner Time"; 
        listTime[9] = "Early Evening"; 
        listTime[10] = "Evening";
        listTime[11] = "Late Evening"; 
        listTime[12] = "Midnight";
        
        String[] listPlace = new String [1];
        listPlace[0] = "In a tree";
        
        String[] listEvent = new String [1];
        listEvent[0] = "Moving";
        
        String[] listWeather = new String [16];
        listWeather[0] = "Snow";
        listWeather[1] = "Light snow";
        listWeather[2] = "Heavy snow";
        listWeather[3] = "Blizzard";
        listWeather[4] = "Rain";
        listWeather[5] = "Light rain";
        listWeather[6] = "Heavy rain";
        listWeather[7] = "Flood";
        listWeather[8] = "Clear";
        listWeather[9] = "Cold";
        listWeather[10] = "Hot";
        listWeather[11] = "Warm";
        listWeather[12] = "Cool";
        listWeather[13] = "Perfect";
        listWeather[14] = "Foggy";
        listWeather[15] = "Misty";

        
        String[] listProp = new String [1];
        listProp[0] = "Fruit";
        
    if(v>5 && v!=6){
        System.out.print("Option not available \n Enter Option: ");
    }
    
    if(v<0) {
        System.out.print("Option not available \n Enter Option: ");
    }
    
    if (v==0) {
        System.out.println(" ");
        
        Random listSelectTime = new Random();
        System.out.print("Your Time of Day is: ");
        System.out.println(listTime[listSelectTime.nextInt(13)]);
        
        Random listSelectPlace = new Random();
        System.out.print("Your Place is: ");
        System.out.println(listPlace[listSelectPlace.nextInt(1)]);
        
        Random listSelectEvent = new Random();
        System.out.print("Your Event is: ");
        System.out.println(listEvent[listSelectEvent.nextInt(1)]);
        
        Random listSelectWeather = new Random();
        System.out.print("Your Weather is: ");
        System.out.println(listWeather[listSelectWeather.nextInt(16)]);
        
        Random listSelectProp = new Random ();
        System.out.print("Your Prop is: ");
        System.out.println(listProp[listSelectProp.nextInt(1)]);
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: ");
    }
    
    if(v==1){
        System.out.println(" ");
        
        Random listSelectTime = new Random();
        System.out.print("Your Time of Day is: ");
        System.out.println(listTime[listSelectTime.nextInt(13)]);
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate All New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: ");
    }
    
    if(v==2){
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate All New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: ");
    }
    
    if(v==3){
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate All New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: ");
    }
    
    if(v==4){
        System.out.println(" ");
        
        Random listSelectWeather = new Random();
        System.out.print("Your Weather is: ");
        System.out.println(listWeather[listSelectWeather.nextInt(16)]);
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate All New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: ");
    }
    
    if (v==5){
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Press 0 to Generate All New Conditions");
        System.out.println("Press 1 to Generate a New Time of Day");
        System.out.println("Press 2 to Generate a New Place");
        System.out.println("Press 3 to Generate a New Event");
        System.out.println("Press 4 to Generate New Weather");
        System.out.println("Press 5 to Generate a New Prop");
        System.out.println("Or press 6 to exit");
        System.out.print("Enter Option: "); 
    }
    
    v = inp.nextInt();
}   
}
}
