
import java.util.Random;

public class TimeManager {

    /**A list of actions for the relevant blocks. Broken into 48 blocks down and 6 across 
     * Position 0: Number of slots
     * Position 1: Primary Action (85%)
     * Position 2: Secondary Action (chance 50% less than primary)
     * Position 3: Third Action (Circumstance: 45%)
     * Position 4: Fourth Action (Circumstance: 45%)
     * Position 5: Fifth Action (Circumstance: 45%)
     * */
    private String[][] timeSlots = new String[48][6];
    
    /**
     * Default Constr.
     */
    TimeManager(){
        
    }
    
    /**
     * Import a time sheet that is attached to timeSlots.
     * @param timeSheet String[][] an array with a list of time actions within a timesheet.
     */
    public void importTimeSlot(String timeSheet[][]){        
        try{
            if((timeSheet.length==48) && (timeSheet[0].length==6)){
                timeSlots = timeSheet;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR - Imported timesheet contains incorrect number of slots");
        }                
    }
    
    
    /**
     * 
     * @param y
     * @return
     */
    public String getPrimaryAction(int y){
        try{
        return timeSlots[y][1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR - Incorrect array position for 'timeSlots'");
        }
        return null;
    }
    
    /**
     * Get a random slot from the given row.
     * @param y
     * @return
     */
    public String getRandomActionFromRow(int y){
        try{
            Random rnd = new Random();
            int rndSlot = rnd.nextInt(6);            
            return timeSlots[y][rndSlot];
            }catch (NullPointerException e){
                System.out.println("ERROR - Incorrect array position for 'timeSlots'");
            }
            return null;
    }
    
    /**
     * Decide based on stats which slot to pick from the given row.
     * @param f
     * @param s
     * @param e
     * @param y
     * @return
     */
    public String getStatBasedGrid(int f, int s, int e, int y){
        boolean checkF = false;
        boolean checkS = false;
        boolean checkE = false;
        Random rnd = new Random();
        
        if(f<2){
            checkF = true;
        }
        if(s<2){
            checkS = true;
        }
        if(e<2){
            checkE = true;
        }
        
        if(checkF==true && checkS==true && checkE==true){
            int prCheck = rnd.nextInt(3);
            if(prCheck==0){
                return getReturnAnwserStatBased(y, 3);
            } else if(prCheck==1) {
                return getReturnAnwserStatBased(y, 4);
            } else {
                return getReturnAnwserStatBased(y, 5);
            }
        }
        if(checkF==true && checkS==true && checkE==false){
            int prCheck = rnd.nextInt(2);
            if(prCheck==0){
                return getReturnAnwserStatBased(y, 3);
            } else {
                return getReturnAnwserStatBased(y, 4);
            }
        }
        if(checkF==true && checkS==false && checkE==true){
            int prCheck = rnd.nextInt(2);
            if(prCheck==0){
                return getReturnAnwserStatBased(y, 3);
            } else {
                return getReturnAnwserStatBased(y, 5);
            }
        }
        if(checkF == false && checkS==true && checkE==true){
            int prCheck = rnd.nextInt(2);
            if(prCheck==0){
                return getReturnAnwserStatBased(y, 4);
            } else {
                return getReturnAnwserStatBased(y, 5);
            }
        }
        if(checkF==true){
            return getReturnAnwserStatBased(y, 3);
        }
        if(checkS==true){
            return getReturnAnwserStatBased(y, 4);
        }
        if(checkE==true){
            return getReturnAnwserStatBased(y, 5);
        }
        
        return getReturnAnwserStatBased(y,0);
    }
    
    /**
     * Determines which priority to select.
     * @param y
     * @param circ
     * @return
     */
    private String getReturnAnwserStatBased(int y, int circ){
        Random rnd = new Random();
        int chance = rnd.nextInt(20);
        int result;
        if(chance>18){            
            result = getSlotByStats(0);
        } else {            
            result = getSlotByStats(circ);
        }
        
        //int result = getSlotByStats(chance);
        
        //if(result>0){
            return timeSlots[y][result];
        //} else {
          //  return timeSlots[y][result+2];
        //}
    }
    
    /**
     * Randomly select the slot based on priority.
     * @param circumstance
     * @return
     */
    private int getSlotByStats(int circumstance){
        Random chanceChange = new Random();
        int primaryDrop = chanceChange.nextInt(35);        
        int primaryPerc = 85-primaryDrop;
        int secondPerc = primaryPerc/2;
        
        if(circumstance==0){
            return getSlot(primaryPerc,secondPerc);
        }
        if(circumstance==3){
            return getCirSlot(circumstance, primaryPerc, secondPerc);
        }
        if(circumstance==4){
            return getCirSlot(circumstance, primaryPerc, secondPerc);
        }
        if(circumstance==5){
            return getCirSlot(circumstance, primaryPerc, secondPerc);
        }
            
        return 0;
    }
    
    private int getSlot(int primaryPerc, int secondPerc){
        Random chanceChange = new Random();
        int chance = chanceChange.nextInt(100);
        if(chance>secondPerc){
            return 1;
        } else {
            return 2;
        }
    }
    
    private int getCirSlot(int circumstance,int primaryPerc, int secondPerc){
        Random chanceChange = new Random();
        int chance1 = chanceChange.nextInt(100);
        int chance2 = chanceChange.nextInt(100);
        
        if(chance1>chance2+40){
            return getSlot(primaryPerc,secondPerc);
        } else {
            int circChance = chanceChange.nextInt(100);
            if(circChance>50){
                return circumstance;
            } else {
            	return 1;
            }
        }
        
    }
                    
        
}