
public class main
{

    public static void main(String[] args){
        int i =0;
        createBoard test = new createBoard();
        while(i!=1){
            test.display();
            test.addO(1,0);
            test.addX(1,1);
            test.display();
            i=1;

        }
        
        
    }

}
