
import java.util.Random;
/**

 */
public class Word
{
   private Random generator = new Random();
   String word = "";

   public Word(String word)  //leave the constructor alone
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
        this.word = word;
   }
   /**
    * Gets a version of this word with the leters scrambled
    * @param word the string to scramble
    * @return the scrabled string
    */
   public String scramble()
   {
        //TODO scramble the letters following the pseudocode
       String newWord = this.word;
       int wl = newWord.length();
       for(int c = 0; c < wl; c++){
    	   System.out.println(newWord);
    	   int i = generator.nextInt(wl - 1);
    	   int j = -1;
    	   while (j <= i){
    		   j = generator.nextInt(wl - i) + i;
    	   }
    	   newWord = newWord.substring(0,i) + newWord.substring(j,j+1) + 
                          newWord.substring(i+1,j) + newWord.substring(i,i+1) +
                          newWord.substring(j+1,wl);
       
       }
       return newWord;
   }


}