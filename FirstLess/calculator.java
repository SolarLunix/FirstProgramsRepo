import java.util.Scanner;
public class calculator
{
    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("Welcome to mini-calc! \n Press 1 for Addition \n Press 2 for Subtraction \n Press 3 for Division \n Press 4 for Multiplication");
    System.out.println("Or press 5 to exit");
    System.out.print("Enter Option:");
    int v = inp.nextInt();
    while(v!=5){
        
        
        
    if(v>4 && v!=5){
        System.out.print("Option not available \n Enter Option:");
    }
    
    if(v<1) {
        System.out.print("Option not available \n Enter Option:");
    }
    
    if(v==1){
        System.out.println("Enter number:");
        int y = inp.nextInt();
        System.out.println("Enter number:");
        int x = inp.nextInt();
        double ans = x + y;
        System.out.print("Answer: \n" + ans + "\n\n Enter Option Number:");
    }
    
    if(v==2){
        System.out.println("Enter number:");
        int y = inp.nextInt();
        System.out.println("Enter number:");
        int x = inp.nextInt();
        int ans = y - x;
        System.out.print("Answer: \n" + ans + "\n\n Enter Option Number:");
    }
    
    if(v==3){
        System.out.println("Enter number:");
        double y = inp.nextInt();
        System.out.println("Enter number:");
        double x = inp.nextInt();
        double ans = y / x;
        System.out.print("Answer: \n" + ans + "\n\n Enter Option Number:");
    }
    
    if(v==4){
        System.out.println("Enter number:");
        int y = inp.nextInt();
        System.out.println("Enter number:");
        int x = inp.nextInt();
        int ans = x * y;
        System.out.print("Answer: \n" + ans + "\n\n Enter Option Number:");
    }
    v = inp.nextInt();
}   
}
}
