import java.util.Random;
import java.util.Scanner;

class BlindBoard extends Game {
    
    int size;
    int x,y;
    int score;
    int[][] board;
    boolean isitOver;
    
    BlindBoard()
    {
        this.size = 8;
        this.score = 0;
        this.board = new int[this.size][this.size];
        this.isitOver = false;
    }
    
    void initializeGame()
    {
        Random random = new Random();
        
        for(int n = 0; n < 2*this.size; n++)
        {
            this.x = random.nextInt(this.size);
            this.y = random.nextInt(this.size);
  
            while(board[this.x][this.y]==1)
            {
                this.x = random.nextInt(this.size);
                this.y = random.nextInt(this.size);
            }
          
            board[this.x][this.y] = 1;
        }
    }
    
    void makePlay(int player)
    {
        for(int r=0; r<3; r++)
        {
            Scanner inputReader = new Scanner(System.in);
            System.out.print("Hit x-coordinate (0-7): ");
            int inputX = inputReader.nextInt();
            System.out.print("Hit y-coordinate (0-7): ");
            int inputY = inputReader.nextInt();
            System.out.println("Score: " + this.score);
            
            if(this.board[inputX][inputY] == 1)
            {
                this.score++;
                this.board[inputX][inputY] = 0;
            }
        }
    }
    
    boolean endOfGame()
    {
        //System.out.println("Joo");
        return false;
    }
    
    void printWinner()
    {
        if(this.score == 0)
        {
            System.out.println("We have no winner!");
        }
        else
        {
            System.out.println("We have a winner! Score: " + this.score);
        }
    }
}
