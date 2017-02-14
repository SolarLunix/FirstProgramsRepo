import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[][] test = new String[48][6];
        for(int i = 0; i<48;i++){
            for(int c = 0;c<6;c++){
                test[i][c]= "empty";
            }
        }
        
        test[25][0] = "6";
        test[25][1] = "Tending to fields";
        test[25][2] = "Checking on the herd";
        test[25][3] = "Eating a snack";
        test[25][4] = "Taking a snooze in a bail of hay";
        test[25][5] = "Going for a stroll";
        
        TimeManager tm = new TimeManager();
        tm.importTimeSlot(test);
        tm.getPrimaryAction(52);
        System.out.println(tm.getRandomActionFromRow(25));
        System.out.println(tm.getStatBasedGrid(1, 1, 1, 25));
        
        
    }
    
}