
public class createBoard
{
   int[][] board = new int[3][3];
    public createBoard(){
        for(int i = 0;i<board.length;i++){
            for(int c = 0;c<board[i].length;c++){
                board[i][c] = 0;
              }
        
    }
}
    
    public void addO(int i,int x){
    board[i][x] = 1;    
    }
    
    public void addX(int i,int x){
        board[i][x] = 2;
    }
    
    int ch = 0;
    public void display(){

         for(int i = 0;i<board.length;i++){
            System.out.print("\n");
            System.out.print(ch + " > ");
            ch++;
            for(int c = 0;c<board[i].length;c++){
                if(board[i][c]==1){
                    System.out.print("0");
                
              }else if(board[i][c]==2){
                  System.out.print("X");
                }else{
                    System.out.print("-");
                }
              
    }
    
}
System.out.print("\n");
    System.out.println("-------------------------------");
}
    
    public void checkWin(){
        
    }
    
}

