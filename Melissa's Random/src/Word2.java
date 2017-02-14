import java.util.ArrayList;

public class Word2
{

    //TODO write the constructor and define the instance variable
    private String word = "sub";
    
    public Word2(String word){
        this.word = word;
    }

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */
    public String getSubstrings()
    {
       //TODO implement this method
        String sub = "";
        
        int start = 0;
        int end = 1;
        for(int i = 0; i < word.length(); i++){
        	start = 0;
            end = i + 1;
            for(int c = 0; c < word.length(); c ++){
            	end = c;
            	sub += this.word.substring(start,end);
            	start+=1;
            	System.out.println(sub);
            }
        }
        return sub;
    }
    
    public boolean isSorted(ArrayList<String> list)
    {
    	
    	
        boolean sorted = true;
        String first = "0"; // This is to compare each string's distance from 0 Lexicographically
        // TODO: Determine if the array is sorted.
        
        for(int i = 1; i < list.size(); i++){
            String word1 = list.get(i-1);
            String word2 = list.get(i);
            int word1Lex = word1.compareTo(first);
            int word2Lex = word2.compareTo(first);
            System.out.println(word1Lex + " " + word2Lex);
            if(word1Lex > word2Lex){
                sorted = false;
            }
        }
        
        return sorted;
    }
}